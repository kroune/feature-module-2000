#!/usr/bin/env python3
"""Extracts machine-readable perf metrics from gradle-profiler + cpu-sampler output.

Usage: extract-metrics.py <out.json> [--cold DIR ...] [--warm DIR ...]
                                     [--cpu-cold DIR ...] [--cpu-warm DIR ...]

Each mode accepts several result dirs (repeated runs); their samples are merged.
- benchmark.csv is gradle-profiler's wide format: header rows (scenario/version/tasks/
  value = sample names), then one row per iteration, first cell = "warm-up build #1" /
  "measured build #1". Durations are milliseconds.
- Warm metrics aggregate measured iterations only (warm-up rows are skipped).
- CPU aggregates come from cpu-sampler.sh CSVs (system.csv / process.csv) in each
  --cpu-* dir.
"""
import argparse
import csv
import json
import statistics
from collections import defaultdict
from pathlib import Path


def read_wide_csv(path):
    """Returns {sample_name: {"warm_up": [...], "measured": [...]}}."""
    with open(path, newline="") as f:
        rows = list(csv.reader(f))
    value_row = next(i for i, r in enumerate(rows) if r and r[0] == "value")
    samples = rows[value_row][1:]
    out = defaultdict(lambda: {"warm_up": [], "measured": []})
    for row in rows[value_row + 1:]:
        if not row or not row[0]:
            continue
        bucket = "measured" if "measured" in row[0] else "warm_up"
        for name, val in zip(samples, row[1:]):
            if val:
                out[name][bucket].append(float(val))
    return dict(out)


def scenario_metrics(dirs):
    merged = defaultdict(lambda: {"warm_up": [], "measured": []})
    for d in dirs:
        csv_path = Path(d) / "benchmark.csv"
        if not csv_path.exists():
            continue
        for name, vals in read_wide_csv(csv_path).items():
            merged[name]["warm_up"].extend(vals["warm_up"])
            merged[name]["measured"].extend(vals["measured"])
    result = {}
    for name, vals in merged.items():
        measured = vals["measured"] or vals["warm_up"]
        if not measured:
            continue
        result[name] = {
            "values": vals["measured"],
            "mean": round(statistics.fmean(measured), 2),
            "min": round(min(measured), 2),
            "max": round(max(measured), 2),
        }
    return result


def cpu_metrics(dirs):
    system_rows, proc_rows = [], []
    for d in dirs:
        system_csv = Path(d) / "system.csv"
        process_csv = Path(d) / "process.csv"
        if system_csv.exists():
            with open(system_csv, newline="") as f:
                system_rows.extend(csv.DictReader(f))
        if process_csv.exists():
            with open(process_csv, newline="") as f:
                proc_rows.extend(csv.DictReader(f))
    out = {}
    if system_rows:
        busy = [float(r["user_pct"]) + float(r["system_pct"]) for r in system_rows]
        out["system_busy_pct_mean"] = round(statistics.fmean(busy), 1)
        out["system_busy_pct_max"] = round(max(busy), 1)
        out["samples"] = len(busy)
    by_role = defaultdict(lambda: {"cpu": [], "rss": []})
    for r in proc_rows:
        by_role[r["role"]]["cpu"].append(float(r["cpu_pct"]))
        by_role[r["role"]]["rss"].append(int(r["rss_kb"]))
    for role, d in by_role.items():
        out[f"{role}_cpu_pct_mean"] = round(statistics.fmean(d["cpu"]), 1)
        out[f"{role}_cpu_pct_max"] = round(max(d["cpu"]), 1)
        out[f"{role}_rss_mb_max"] = round(max(d["rss"]) / 1024)
    return out


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("out_json")
    ap.add_argument("--cold", nargs="*", default=[])
    ap.add_argument("--warm", nargs="*", default=[])
    ap.add_argument("--cpu-cold", nargs="*", default=[])
    ap.add_argument("--cpu-warm", nargs="*", default=[])
    args = ap.parse_args()

    metrics = {"cold": {}, "warm": {}}
    if args.cold:
        metrics["cold"]["sync"] = scenario_metrics(args.cold)
    if args.warm:
        metrics["warm"]["sync"] = scenario_metrics(args.warm)
    metrics["cold"]["cpu"] = cpu_metrics(args.cpu_cold)
    metrics["warm"]["cpu"] = cpu_metrics(args.cpu_warm)
    Path(args.out_json).write_text(json.dumps(metrics, indent=2))
    print(json.dumps(metrics, indent=2))


if __name__ == "__main__":
    main()
