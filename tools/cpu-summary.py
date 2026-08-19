#!/usr/bin/env python3
"""Summarizes cpu-sampler.sh output into a markdown report.

Usage: cpu-summary.py <cpu-log-dir> > summary.md

Reads <dir>/system.csv and <dir>/process.csv, prints per-role CPU/RSS aggregates
and whole-machine CPU aggregates. stdlib only (runners have python3, no pandas).
"""
import csv
import statistics
import sys
from collections import defaultdict


def pct(values, q):
    if not values:
        return 0.0
    s = sorted(values)
    i = min(len(s) - 1, max(0, round((q / 100) * (len(s) - 1))))
    return s[i]


def fmt_row(cells):
    return "| " + " | ".join(str(c) for c in cells) + " |"


def main(log_dir):
    with open(f"{log_dir}/system.csv") as f:
        system = list(csv.DictReader(f))
    try:
        with open(f"{log_dir}/process.csv") as f:
            procs = list(csv.DictReader(f))
    except FileNotFoundError:
        procs = []

    print("## CPU utilization")
    print()
    busy = [float(r["user_pct"]) + float(r["system_pct"]) for r in system]
    iowait = [float(r["iowait_pct"]) for r in system]
    if busy:
        print("### System (all cores, 100% = machine fully busy)")
        print()
        print(fmt_row(["samples", "mean busy %", "p50", "p95", "max", "mean iowait %"]))
        print(fmt_row(["---"] * 6))
        print(fmt_row([len(busy), f"{statistics.fmean(busy):.1f}", f"{pct(busy, 50):.1f}",
                       f"{pct(busy, 95):.1f}", f"{max(busy):.1f}", f"{statistics.fmean(iowait):.1f}"]))
        print()

    by_role = defaultdict(lambda: {"cpu": [], "rss": []})
    for r in procs:
        by_role[r["role"]]["cpu"].append(float(r["cpu_pct"]))
        by_role[r["role"]]["rss"].append(int(r["rss_kb"]))
    if by_role:
        print("### Per process role (100% = one fully busy core)")
        print()
        print(fmt_row(["role", "samples", "mean CPU %", "p50", "p95", "max", "max RSS (MB)"]))
        print(fmt_row(["---"] * 7))
        for role in ("daemon", "kotlin-daemon", "ide"):
            if role not in by_role:
                continue
            d = by_role[role]
            print(fmt_row([role, len(d["cpu"]), f"{statistics.fmean(d['cpu']):.1f}",
                           f"{pct(d['cpu'], 50):.1f}", f"{pct(d['cpu'], 95):.1f}",
                           f"{max(d['cpu']):.1f}", f"{max(d['rss']) / 1024:.0f}"]))
        print()


if __name__ == "__main__":
    main(sys.argv[1])
