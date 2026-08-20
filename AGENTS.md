# AGENTS.md

## What this repo is

A **synthetic 2000-module Android project** used to benchmark **Android Studio Gradle
sync performance** (sync wall time + CPU utilization over time) on a 16 GB runner, plus
the GitHub Actions machinery that runs the benchmark on demand and publishes results.
Sister repo of `kroune/feature-module-3000` (the sync OOM repro) — same generator
(commit `4446683` of ProjectGenerator, `feature_sliced` shape, seed 42, all shape params
at defaults), scaled down so the sync **fits in a 9 GB daemon heap** and completes.
It is a benchmark harness — there is no production code and nothing to "fix" in the app
modules themselves.

## Layout

- `api/f<N>-api`, `impl/f<N>-impl`, `ui/f<N>-ui` — the 2000 feature triplets (N = 0..638
  per tier, 639 features), plus `foundation/` (34), `core/` (24), `common/` (24)
  libraries and one `app/app` module.
  All generated, all follow the same pattern; changes should be made by generator-style
  edits across the board, not by hand-editing individual modules.
- `build-logic/` — included build with the convention plugins
  (`CompositeBuildPluginAndroid{App,Lib,KmpLib}.kt`, `compileSdk = 37`).
- `settings.gradle.kts` — ~2000 `include` lines; `build.gradle.kts` is near-empty.
- `gradle.properties` — `-Xmx9g` default, configuration cache + Isolated Projects +
  `org.gradle.tooling.parallel=true`. **No heap-dump flags on purpose**: this repo is
  about performance, an OOM is just a failed run.
- `sync.scenarios` — two gradle-profiler scenarios: `cold-sync` (warm-ups = 0,
  `--single-shot`) and `warm-sync` (1 warm-up + 3 measured iterations). They are run as
  two separate profiler invocations because `--single-shot` is global and conflicts with
  warm-ups; pass the scenario name as a positional arg to select one.
- `tools/cpu-sampler.sh` — dependency-free 1 s CPU/RSS sampler (plain `/proc`), writes
  `system.csv` (whole machine) and `process.csv` (per role: `daemon`, `kotlin-daemon`,
  `ide`). `tools/cpu-summary.py` renders markdown aggregates; `tools/extract-metrics.py`
  emits `perf-metrics.json`; `tools/compare-metrics.py` diffs two legs' JSON.
- `.github/workflows/sync-benchmark.yml` — the benchmark (see README for the full
  run-down). `.github/workflows/build-profiler.yml` — builds the patched gradle-profiler
  and publishes it under the `patched-profiler` release tag.
- `.github/workflows/measure-commits.yml` — end-to-end performance comparison of two
  Gradle refs in a single run (resolve → build both in parallel → sync **both legs
  sequentially on ONE runner** so machine-speed variance cancels → in-job compare).
  Built dists are cached as `gradle-build-<sha12>` release assets, so re-measuring a
  commit skips its ~35 min build. `measure-idea-commits.yml` does the same for two
  IntelliJ refs, overlaying freshly built tooling-extension jars into Studio per leg
  (Gradle distribution fixed for both legs).

## Commands

- Compare two Gradle refs: `gh workflow run measure-commits.yml`
  `-f base_repo=gradle/gradle -f base_ref=<sha>`
  `-f candidate_repo=kroune/gradle-fork -f candidate_ref=<branch>`
  (result releases: `run-<N>-base` / `run-<N>-candidate` / `run-<N>-perf-diff`).
- Trigger a benchmark run: `gh workflow run sync-benchmark.yml`
  (inputs: `gradle_distribution_url`, `daemon_xmx`, `build_ops_trace`, `studio_url`,
  `gradle_profiler_url`).
- Rebuild the patched profiler: `gh workflow run build-profiler.yml`.
- Check results: `gh release list` — each run publishes a `run-N` release with
  `perf-metrics.json`, benchmark CSVs, `cpu-logs.tar.gz`, Perfetto traces and logs.
  A run is successful when its `Verdict` step is green (cold and warm sync measured).
- Local repro: see README ("Running locally").

## Hard-won gotchas (don't rediscover these)

- gradle-profiler **hangs forever when the daemon dies mid-sync** (the TAPI call never
  returns). There is no heap-dump watchdog here (perf repo, no dumps) — instead each
  profiler invocation is wrapped in `timeout -s KILL` (cold 150 min, warm 90 min), so
  an OOM fails fast with exit 124/137. Keep that wrapper.
- `warm-ups = 0` requires `--single-shot` (scenario validation fails otherwise), and
  `--single-shot` conflicts with warm-ups — hence two separate profiler invocations
  (`cold-sync` then `warm-sync`), not one scenario file run.
- Upstream gradle-profiler waits only 60 s for the IDE plugin to connect; opening 6000
  modules takes longer. Use the patched build from the `patched-profiler` release
  (default input); rebuild via `build-profiler.yml` when bumping the profiler version.
- On CI the IDE must run headless: `GRADLE_PROFILER_OPTS=-Dide.tests.headless=true`.
  Full-GUI Studio under xvfb hangs in project frame creation and the sync never starts.
- `measure-idea-commits` defaults differ on purpose: `studio_url` is Rabbit 1
  (platform 262) — the sync-* tooling branches carry the post-IDEA-385795 API
  (`GradleBuildScriptClasspathModel.getClasspath(): List`); Quail 2 expects
  `DomainObjectSet` and sync dies with `NoSuchMethodError` when the IDE requests
  build-script classpath models (the 3000-module repo never sees this: the daemon OOMs
  first). `gradle_distribution_url` is the `gradle-build-0fde246a8947` custom build
  (re-hosted in this repo's releases, ABI-paired with those branches).
- Comparisons (`measure-commits`, `measure-idea-commits`) run both legs **sequentially
  on one runner** on purpose: GitHub-hosted runners vary ~20% in speed (observed: one
  leg of a parallel matrix on a slow runner fakes a ~20% regression). Each leg kills
  leftover daemons/IDE and uses a fresh `GRADLE_USER_HOME`, so both cold syncs are
  truly cold. Job timeout is 360 min; per-mode `timeout` is 75/60 min so a hung
  (OOM'd) leg fails fast without eating the other leg's budget. `tools/runner-calib.py`
  records the machine's speed in every `perf-metrics.json` (`calibration` key) — check
  it when a single `sync-benchmark` run looks off.
- `--build-ops-trace` works for studio-sync scenarios: the trace flags
  (`-Dorg.gradle.internal.operations.trace=...`) ride on the jvm args the profiler
  forwards to the IDE-driven Gradle invocations via its agent protocol, so the sync
  daemon writes the build-ops log; the profiler converts the **last iteration's** log
  to `<scenario>.perfetto.proto` in the output dir. The trace covers only the Gradle
  daemon side — IDE-process work shows up in the CPU time series and the
  `IDE execution time` sample instead. The traces are large at this scale (~4 GB raw
  build-ops log → ~800 MB Perfetto proto per mode); the workflows publish both gzipped.
  The trace adds daemon-side overhead — keep `build_ops_trace` identical across legs
  you compare.
- The runner is 16 GB with 4 cores: CPU percentages from `cpu-sampler.sh` are
  pidstat-style (100% = one core; system busy% caps at 100 across all cores).
- GitHub release assets are capped at 2 GiB (not a concern here — outputs are MBs);
  Actions artifact downloads are very slow (~0.2 MB/s); releases are the primary
  distribution channel. Release assets upload by **basename** — both modes produce
  `benchmark.csv`, so per-mode files are renamed `cold-*`/`warm-*` before upload
  (duplicate basenames fail the whole `gh release create` with a cryptic HTTP 404).
  And never collect assets in a `find ... | while read` loop — the pipe makes it a
  subshell and array additions are lost; use `done < <(find ...)`.
- Android SDK: API 37 is published as `platforms;android-37.0` (not `android-37`).
- Android Studio "Quail" downloads are named by codename
  (`android-studio-quail2-linux.tar.gz`), not by version.

## Conventions

- **Never commit** machine-specific paths or analysis artifacts. `org.gradle.java.home`
  lives in `~/.gradle/gradle.properties`, not here. Benchmark outputs (`results*/`,
  `cpu-logs/`, `gradle-user-home/`, `profile-out*/`, `studio-sandbox/`, `heap-dumps/`,
  `graph.dot`, `gc-logs/`) are all gitignored on purpose.
- `local.properties` (SDK path) is also local-only; CI writes it from `$ANDROID_HOME`.
- Workflow changes: validate YAML before pushing, then smoke-test with
  `gh workflow run sync-benchmark.yml` before a measure-commits run.
- The git history is self-contained — this directory used to sit untracked inside a
  larger experiments repo; do not re-embed it.
