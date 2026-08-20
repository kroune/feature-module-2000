# feature-module-2000 — Gradle sync performance benchmark

Synthetic Android project with **2000 feature modules** (`api/` + `impl/` + `ui/` per
feature, plus `foundation/`, `core/`, `common/`, `app/`) used to measure **Android
Studio Gradle sync performance** — sync wall time and CPU utilization over time — on a
16 GB GitHub Actions runner. Sister repo of
[feature-module-3000](https://github.com/kroune/feature-module-3000) (the sync OOM
repro); same generator, same settings, scaled down so the sync **fits in a 9 GB daemon
heap** and completes.

- AGP 9.2.1, Kotlin 2.4.0, Gradle 9.7.0-rc-1 by default (wrapper), configuration cache +
  Isolated Projects + parallel tooling model fetch enabled (see `gradle.properties`).
- The daemon is capped at `-Xmx9g -Xms9g` on CI; the sync must complete within it.
  There is intentionally **no heap-dump machinery** here — an OOM just fails the run.

## What gets measured

Each benchmark run executes two gradle-profiler scenarios (see `sync.scenarios`):

| Scenario | Meaning |
|---|---|
| `cold-sync` | Zero warm-ups, fresh daemon (`--single-shot` implies `--cold-daemon`). The expensive, realistic "open the project" case. |
| `warm-sync` | 1 warm-up + 3 measured iterations in the same IDE session (daemon and configuration cache warm). |

Measured outputs per run:

- **Sync wall time** from gradle-profiler's `benchmark.csv` (total, Gradle-side, and
  IDE-side execution time per iteration), aggregated into `perf-metrics.json`.
- **CPU utilization over time** — 1 s samples from `tools/cpu-sampler.sh` (plain
  `/proc`, no dependencies): whole-machine busy% (`system.csv`) and per-process CPU%/RSS
  for the Gradle daemon, Kotlin daemon, and IDE (`process.csv`). Published as
  `cpu-logs.tar.gz`, summarized in the release notes (mean / p50 / p95 / max).
- **Gradle build-operation trace** — `--build-ops-trace` makes the sync daemon record
  every build operation; gradle-profiler converts it to `*.perfetto.proto` (open at
  <https://ui.perfetto.dev>). Covers the Gradle side of the sync, including the
  IDE-driven model fetch (the profiler forwards the trace flags to the sync invocations
  through its IDE agent). Disable via the `build_ops_trace` input.

## Running the benchmark on GitHub Actions

Actions → **sync-benchmark** → *Run workflow*. Inputs:

| Input | Default | Meaning |
|---|---|---|
| `gradle_distribution_url` | `gradle-9.7.0-rc-1-bin.zip` | Any public Gradle zip URL — stable, RC, nightly, or a self-hosted custom build. Rewrites the wrapper for that run. |
| `daemon_xmx` | `9g` | Gradle daemon heap (`-Xmx` = `-Xms`). The project is sized to sync within 9g; lower values eventually OOM (run fails — no dump, by design). |
| `build_ops_trace` | `true` | Record the Gradle build-operation trace and publish a Perfetto trace. |
| `studio_url` | Studio 2026.1.2 (Quail 2) | Android Studio `linux.tar.gz` URL — pick any build from [the releases list](https://jb.gg/android-studio-releases-list.json). |
| `gradle_profiler_url` | patched 0.25.2 (this repo's releases) | gradle-profiler dist zip. The default build ships longer IDE-connect timeouts (upstream hardcodes 60s, too short for 6000 modules — see the `build-profiler` workflow). |

What a run does, end to end:

1. Frees runner disk, sets up JDK 25 + Android SDK (`platforms;android-37.0`), pins the
   Gradle wrapper from `gradle_distribution_url`, and patches `gradle.properties` with
   the heap cap and `-XX:+UseCompactObjectHeaders`.
2. Runs the **cold** sync via gradle-profiler (`--single-shot`, headless IDE), then the
   **warm** scenario (same runner, daemon/configuration cache warm), sampling CPU every
   second across both. Each profiler invocation is wrapped in `timeout -s KILL` —
   gradle-profiler hangs forever when the daemon dies mid-sync, so an OOM surfaces as a
   fast failure (exit 124/137) instead of burning the job timeout.
3. Publishes results two ways:
   - **A `run-N` release per run** (permanent, fast public download URLs — the primary
     channel): `perf-metrics.json` (machine-readable headline numbers), benchmark
     CSV/HTML, `cpu-logs.tar.gz` (full CPU time series), `*.perfetto.proto.gz` +
     gzipped raw build-ops logs (ui.perfetto.dev opens gzipped traces directly), profiler logs, the Studio `idea.log`, and the exact
     `gradle.properties` / wrapper properties / scenario file used.
   - **A `sync-perf-N` Actions artifact** (kept 7 days) with the full results dirs.

The job is green when both cold and warm syncs completed and produced benchmark CSVs;
red otherwise (timeout kill = likely daemon OOM at the given `daemon_xmx`).

## The `measure-commits` workflow

Actions → **measure-commits** → *Run workflow* — end-to-end performance comparison of
two Gradle refs (typically an upstream commit vs a fork branch with an optimization) in
a single run: `resolve → build (both in parallel) → sync (both legs on one runner) →
compare`.

```bash
gh workflow run measure-commits.yml \
  -f base_repo=gradle/gradle -f base_ref=<sha> \
  -f candidate_repo=kroune/gradle-fork -f candidate_ref=<branch>
```

| Input | Default | Meaning |
|---|---|---|
| `base_repo` / `base_ref` | `gradle/gradle` / (required) | Baseline Gradle checkout — branch, tag, or SHA. |
| `candidate_repo` / `candidate_ref` | `kroune/gradle-fork` / (required) | Candidate Gradle checkout — branch, tag, or SHA. |
| `daemon_xmx` | `9g` | Daemon heap for both syncs. |
| `studio_url`, `gradle_profiler_url` | same as sync-benchmark | Same meaning as in sync-benchmark. |

What a run does:

1. `resolve` turns both refs into full SHAs (via the GitHub API).
2. `build` (one job per ref, parallel) compiles the bin distribution from source
   (`:distributions-full:binDistributionZip`, JDK 25 + 21/17 toolchains) and publishes
   it as `gradle-<sha12>-bin.zip` under the `gradle-build-<sha12>` release tag in this
   repo. The build is **skipped entirely when that release already exists**, so
   re-measuring a commit costs no rebuild. Build time ranges from minutes (remote
   build-cache hits) to ~1–2 h cold.
3. `sync` (**one** job) runs both legs **sequentially on the same runner** — GitHub-hosted
   runners vary ~20% in machine speed, so a parallel matrix leg on a slow runner would
   fake a regression. Each leg gets a fresh Gradle user home and no leftover daemons, so
   both cold syncs are truly cold; each leg measures cold + warm sync with CPU sampling
   and a build-ops trace. Publishes **`run-<N>-base` / `run-<N>-candidate`** releases
   plus the side-by-side diff **`run-<N>-perf-diff`** (computed in-job).

## The `measure-idea-commits` workflow

Actions → **measure-idea-commits** → *Run workflow* — same shape, but compares two
**IntelliJ** refs (e.g. `sync-baseline` vs a branch with a Gradle-sync optimization).
The `build-idea` job builds the Gradle tooling-extension jars from the IntelliJ sources
via Bazel (cached as `idea-build-<sha12>` releases); the `sync` job overlays them into
the Studio installation (the tooling extension runs inside the Gradle daemon during
sync) while the Gradle distribution stays fixed for both legs. `compare` publishes
**`run-idea-<N>-perf-diff`**.

## The `build-profiler` workflow

Actions → **build-profiler** → *Run workflow* clones gradle-profiler (default `v0.25.2`),
patches the IDE-connect timeouts in
`src/main/java/org/gradle/profiler/ide/process/IdeProcess.java`
(`IDE_START`/`PLUGIN_CONNECT`/`AGENT_CONNECT` → 10/30/30 min), builds `distZip`, and
publishes it as a release asset under the `patched-profiler` tag. This is the default
`gradle_profiler_url`. Why it's needed: upstream waits only 60 s for the IDE plugin to
connect, but opening 6000 modules takes longer, so the sync never starts.

## Running locally

Requirements: JDK 21+, Android Studio 2026.1+, gradle-profiler 0.25.2+ (prefer the
patched build from this repo's releases), Android SDK with platform android-37
(`platforms;android-37.0`).

```bash
echo "sdk.dir=$ANDROID_HOME" > local.properties   # required by gradle-profiler

# Cold sync (single shot, fresh daemon):
tools/cpu-sampler.sh cpu-logs/cold 1 &  SAMPLER=$!
gradle-profiler --benchmark \
  --single-shot --build-ops-trace \
  --project-dir . \
  --scenario-file sync.scenarios cold-sync \
  --studio-install-dir /path/to/android-studio \
  --output-dir results-cold
kill $SAMPLER

# Warm sync (1 warm-up + 3 measured iterations):
gradle-profiler --benchmark \
  --build-ops-trace \
  --project-dir . \
  --scenario-file sync.scenarios warm-sync \
  --studio-install-dir /path/to/android-studio \
  --output-dir results-warm

python3 tools/extract-metrics.py results-cold results-warm cpu-logs perf-metrics.json
```

On a headless machine add `GRADLE_PROFILER_OPTS=-Dide.tests.headless=true` (full-GUI
Studio hangs on project frame creation without a display).

Note: `org.gradle.java.home` is deliberately not committed — set it in
`~/.gradle/gradle.properties` if your machine needs a pinned JDK.
