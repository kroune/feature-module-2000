#!/usr/bin/env python3
"""Runner speed calibration: fixed busy-loop, writes a JSON score.

Usage: runner-calib.py <out.json>

GitHub-hosted runners vary ~10-20% in speed between machines (and occasionally much
more). A slow runner inflates sync times and depresses CPU%; the calibration score
makes such outliers detectable and lets comparisons normalize for machine speed.
Runs ~5 s single-core plus ~5 s on all cores.
"""
import json
import os
import sys
import time
from multiprocessing import Pool

DURATION_S = 5.0


def bench(_):
    n = 0
    x = 1
    end = time.monotonic() + DURATION_S
    while time.monotonic() < end:
        x = x * 3 % 1000003
        n += 1
    return n


def main(out_path):
    single = bench(None)
    nproc = os.cpu_count() or 1
    with Pool(nproc) as p:
        multi = sum(p.map(bench, range(nproc)))
    score = {
        "single_core_ops": single,
        "all_cores_ops": multi,
        "cpus": nproc,
        "duration_s": DURATION_S,
    }
    with open(out_path, "w") as f:
        json.dump(score, f, indent=2)
    print(json.dumps(score, indent=2))


if __name__ == "__main__":
    main(sys.argv[1])
