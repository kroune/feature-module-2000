#!/usr/bin/env python3
"""Side-by-side diff of two perf-metrics.json files (base vs candidate).

Usage: compare-metrics.py base.json candidate.json [--base-label L] [--candidate-label L]

Prints a markdown table: one row per metric present in both legs, with the delta.
Sync times are in ms (lower is better), CPU in %, RSS in MB.
"""
import argparse
import json


def flatten(metrics):
    """{cold: {sync: {sample: {mean...}}, cpu: {...}}} -> {(mode, section, key): value}"""
    flat = {}
    for mode in ("cold", "warm"):
        for section in ("sync", "cpu"):
            data = metrics.get(mode, {}).get(section, {})
            if section == "sync":
                for sample, agg in data.items():
                    flat[(mode, section, sample + " (ms)")] = agg["mean"]
            else:
                for key, val in data.items():
                    flat[(mode, section, key)] = val
    return flat


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("base")
    ap.add_argument("candidate")
    ap.add_argument("--base-label", default="base")
    ap.add_argument("--candidate-label", default="candidate")
    args = ap.parse_args()

    with open(args.base) as f:
        base = flatten(json.load(f))
    with open(args.candidate) as f:
        candidate = flatten(json.load(f))

    print("# Sync performance comparison")
    print()
    print(f"- base: `{args.base_label}`")
    print(f"- candidate: `{args.candidate_label}`")
    print()
    print("| metric | base | candidate | delta | delta % |")
    print("| --- | --- | --- | --- | --- |")
    for key in sorted(set(base) & set(candidate)):
        mode, section, name = key
        b, c = base[key], candidate[key]
        delta = c - b
        pct = f"{delta / b * 100:+.1f}%" if b else ("n/a" if c == 0 else "+inf%")
        print(f"| {mode} {name} | {b} | {c} | {delta:+.2f} | {pct} |")
    missing = set(base) ^ set(candidate)
    if missing:
        print()
        print("Metrics present in only one leg (sync failed or sample missing):")
        for key in sorted(missing):
            print(f"- {key[0]} {key[2]}")


if __name__ == "__main__":
    main()
