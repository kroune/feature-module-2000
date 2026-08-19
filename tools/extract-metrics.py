#!/usr/bin/env python3
"""Extracts machine-readable perf metrics from gradle-profiler + cpu-sampler output.

Usage: extract-metrics.py <results-cold-dir> <results-warm-dir> <cpu-logs-dir> <out.json>

- benchmark.csv is gradle-profiler's wide format: header rows (scenario/version/tasks/
  value = sample names), then one row per iteration, first cell = "warm-up build #1" /
  "measured build #1". Durations are milliseconds.
- Warm metrics aggregate measured iterations only (warm-up rows are skipped).
- CPU aggregates come from cpu-sampler.sh CSVs under <cpu-logs-dir>/<mode>/.
"""
import csv
import json
import statistics
import sys
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


def scenario_metrics(csv_path):
    per_sample = read_wide_csv(csv_path)
    result = {}
    for name, vals in per_sample.items():
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


def cpu_metrics(cpu_dir):
    out = {}
    system_csv = Path(cpu_dir) / "system.csv"
    if system_csv.exists():
        with open(system_csv, newline="") as f:
            rows = list(csv.DictReader(f))
        if rows:
            busy = [float(r["user_pct"]) + float(r["system_pct"]) for r in rows]
            out["system_busy_pct_mean"] = round(statistics.fmean(busy), 1)
            out["system_busy_pct_max"] = round(max(busy), 1)
            out["samples"] = len(busy)
    process_csv = Path(cpu_dir) / "process.csv"
    if process_csv.exists():
        with open(process_csv, newline="") as f:
            rows = list(csv.DictReader(f))
        by_role = defaultdict(lambda: {"cpu": [], "rss": []})
        for r in rows:
            by_role[r["role"]]["cpu"].append(float(r["cpu_pct"]))
            by_role[r["role"]]["rss"].append(int(r["rss_kb"]))
        for role, d in by_role.items():
            out[f"{role}_cpu_pct_mean"] = round(statistics.fmean(d["cpu"]), 1)
            out[f"{role}_cpu_pct_max"] = round(max(d["cpu"]), 1)
            out[f"{role}_rss_mb_max"] = round(max(d["rss"]) / 1024)
    return out


def main(results_cold, results_warm, cpu_logs, out_json):
    metrics = {"cold": {}, "warm": {}}
    cold_csv = Path(results_cold) / "benchmark.csv"
    warm_csv = Path(results_warm) / "benchmark.csv"
    if cold_csv.exists():
        metrics["cold"]["sync"] = scenario_metrics(cold_csv)
    if warm_csv.exists():
        metrics["warm"]["sync"] = scenario_metrics(warm_csv)
    metrics["cold"]["cpu"] = cpu_metrics(Path(cpu_logs) / "cold")
    metrics["warm"]["cpu"] = cpu_metrics(Path(cpu_logs) / "warm")
    Path(out_json).write_text(json.dumps(metrics, indent=2))
    print(json.dumps(metrics, indent=2))


if __name__ == "__main__":
    main(*sys.argv[1:5])
