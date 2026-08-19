#!/usr/bin/env bash
# Samples CPU utilization once per second while a benchmark runs and writes CSVs:
#   <out-dir>/system.csv   — whole-machine CPU (from /proc/stat)
#   <out-dir>/process.csv  — per-process CPU + RSS for the Gradle/Kotlin daemons and the IDE
#
# Usage: cpu-sampler.sh <out-dir> [interval-seconds]
# Stop with SIGTERM/SIGINT; files are flushed every sample.
#
# CPU% is computed pidstat-style: jiffies delta / (interval * HZ) * 100, so a fully
# busy single core reads 100 and all cores busy read 100 * ncpus. No dependencies
# beyond /proc — sysstat is not required on the runner.
set -u
# Processes come and go between the /proc listing and each read; those races are
# expected and non-actionable, so stderr is silenced for the whole sampler.
exec 2>/dev/null

OUT_DIR="$1"
INTERVAL="${2:-1}"
HZ=$(getconf CLK_TCK)
NCPUS=$(nproc)

mkdir -p "$OUT_DIR"
echo "ts,elapsed_s,user_pct,system_pct,iowait_pct,idle_pct" > "$OUT_DIR/system.csv"
echo "ts,elapsed_s,pid,role,cpu_pct,rss_kb" > "$OUT_DIR/process.csv"

START=$(date +%s)

# Previous /proc/stat totals for delta computation.
read -r _ puser pnice psys pidle piowait pirq psoft psteal prest < /proc/stat
prev_total=$((puser + pnice + psys + pidle + piowait + pirq + psoft + psteal))
prev_busy=$((puser + pnice + psys + pirq + psoft + psteal))
prev_iowait=$piowait
prev_idle_all=$((pidle + piowait))

# role -> previous total jiffies (associative arrays keyed by "pid" to survive respawns)
declare -A PREV_JIFFIES

role_for_pid() {
  local pid="$1" cmd
  cmd=$(tr '\0' ' ' < "/proc/$pid/cmdline" 2>/dev/null) || return 1
  case "$cmd" in
    *java*GradleDaemon*) echo daemon ;;
    *java*KotlinCompileDaemon*) echo kotlin-daemon ;;
    *java*studio*|*java*idea*) echo ide ;;
    *) return 1 ;;
  esac
}

while true; do
  sleep "$INTERVAL"
  ts=$(date -u +%H:%M:%S)
  elapsed=$(( $(date +%s) - START ))

  # --- system ---
  read -r _ user nice sys idle iowait irq soft steal rest < /proc/stat
  total=$((user + nice + sys + idle + iowait + irq + soft + steal))
  busy=$((user + nice + sys + irq + soft + steal))
  idle_all=$((idle + iowait))
  dt=$((total - prev_total))
  if [ "$dt" -gt 0 ]; then
    user_pct=$(awk -v d="$dt" -v u="$((user - puser))" -v n="$((nice - pnice))" 'BEGIN{printf "%.1f", (u+n)*100/d}')
    sys_pct=$(awk -v d="$dt" -v s="$((sys - psys))" 'BEGIN{printf "%.1f", s*100/d}')
    iowait_pct=$(awk -v d="$dt" -v w="$((iowait - prev_iowait))" 'BEGIN{printf "%.1f", w*100/d}')
    idle_pct=$(awk -v d="$dt" -v i="$((idle_all - prev_idle_all))" 'BEGIN{printf "%.1f", i*100/d}')
    echo "$ts,$elapsed,$user_pct,$sys_pct,$iowait_pct,$idle_pct" >> "$OUT_DIR/system.csv"
  fi
  prev_total=$total; prev_busy=$busy; prev_iowait=$iowait; prev_idle_all=$idle_all
  puser=$user; pnice=$nice; psys=$sys

  # --- processes ---
  for pid in $(ls /proc | grep -E '^[0-9]+$'); do
    role=$(role_for_pid "$pid") || continue
    read -r _a _b _c _d _e _f _g _h _i _j _k _l _m utime stime _rest < "/proc/$pid/stat" 2>/dev/null || continue
    jiffies=$((utime + stime))
    prev=${PREV_JIFFIES[$pid]:-}
    PREV_JIFFIES[$pid]=$jiffies
    [ -z "$prev" ] && continue
    rss_kb=$(awk '/VmRSS/{print $2}' "/proc/$pid/status" 2>/dev/null || echo 0)
    cpu_pct=$(awk -v dj="$((jiffies - prev))" -v hz="$HZ" -v i="$INTERVAL" 'BEGIN{printf "%.1f", dj*100/(hz*i)}')
    echo "$ts,$elapsed,$pid,$role,$cpu_pct,$rss_kb" >> "$OUT_DIR/process.csv"
  done
done
