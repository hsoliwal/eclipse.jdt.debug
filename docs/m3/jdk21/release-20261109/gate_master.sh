#!/usr/bin/env bash
# Copyright (c) 2026 Synexia, Hitesh Soliwal (hsoliwal@gmail.com) and others.
# SPDX-License-Identifier: Apache-2.0 OR EPL-2.0
#
# Release-readiness gate of one Eclipse fork for M3JDK21 (Java 21), run on a depth-1 clone of fork master.
#   1. bundle list  = old Java 22+ list (2026-10-20) + bundles upstream master declares JavaSE-22+ + bundles fork
#                     master still declares JavaSE-22+   -> <G>.bundles
#   2. census       = Java 22+ language lines (unnamed `_`, import module) in main sources + 22+ pins -> <G>.census.tsv
#   3. base25       = javac --release 25 on the master tree
#   4. recipe       = apply_jdk21.sh (bundles) + apply_jdk21_pins.sh (repo) on the same tree -> <G>.recipe.tsv
#   5. jdk21        = javac --release 21 on the recipe output; residue = jdk21 - base25 - BOM-file rows
# Usage: gate_master.sh <repo>     (clone F:/m3-scratch/rel21/forks/<repo>, outputs F:/m3-scratch/rel21/gate/<repo>.*)
set -euo pipefail
R="$1"; W=F:/m3-scratch/rel21/forks/$R; G=F:/m3-scratch/rel21/gate/$R; T=F:/m3-scratch/rel21/tools
REC=S:/m3-scratch/jdk21/recipe; OLD=S:/m3-scratch/jdk21/bundles-$R.txt; export LC_ALL=C
EXCL=(':(exclude)*/tests/*' ':(exclude)*/test/*' ':(exclude)*/testresources/*' ':(exclude)*/workspace/*'
      ':(exclude)*.tests.*/*' ':(exclude)*/test-data/*' ':(exclude)*/resources/*' ':(exclude)*/testdata/*'
      ':(exclude)*/src/test/*' ':(exclude)docs/*')
BREE='Bundle-RequiredExecutionEnvironment:.*JavaSE-2[2-9]'
{ if [ -f "$OLD" ]; then tr -d '\r' < "$OLD"; echo; fi
  git -C "$W" diff -U0 HEAD upstream/master -- '*MANIFEST.MF' \
	| awk -v re="^\\\\+$BREE" '/^\+\+\+ b\//{f=substr($0,7)} $0 ~ re {print f}' | sed 's|/\?META-INF/MANIFEST.MF$||'
  { git -C "$W" grep -l -P "$BREE" HEAD -- '*MANIFEST.MF' || true; } | sed 's|^HEAD:||; s|/\?META-INF/MANIFEST.MF$||'
} | sed '/^$/d' | sort -u | while read -r b; do if [ -d "$W/$b" ]; then echo "$b"; fi; done > "$G.bundles"
q() { git -C "$W" grep -n -I -P -e "$2" HEAD -- "${@:3}" | sed 's|^HEAD:||' | awk -v k="$1" 'BEGIN{OFS="\t"}{print k,$0}' || true; }
{ q bree "$BREE" '*MANIFEST.MF'
  q pin '<(maven\.compiler\.(release|source|target)|release|java\.version|javaVersion|tycho\.compiler\.release)>2[2-9]<|<executionEnvironment>JavaSE-2[2-9]<|requiredJavaVersion=2[2-9]|jre\.compilation\.profile\s*=\s*JavaSE-2[2-9]|JRE_CONTAINER.*JavaSE-2[2-9]|compiler\.(compliance|source|codegen\.targetPlatform)=2[2-9]' \
	'*pom.xml' '*.ini' '*.product' '*build.properties' '*.classpath' '*org.eclipse.jdt.core.prefs' ':(exclude)docs/*'
  q unnamed_lambda '(?:^|[(,\s])_\s*(?:\)\s*)?->|\(\s*_\s*,|,\s*_\s*\)\s*->' '*.java' "${EXCL[@]}"
  q unnamed_decl '[\w>\]]\s+_\s*(?:\)|=[^=]|:)' '*.java' "${EXCL[@]}"
  q unnamed_pattern '(?:case|instanceof)\b[^;{]*(?<![\w$'"'"'"])_(?![\w$'"'"'"])' '*.java' "${EXCL[@]}"
  q import_module '^\s*import\s+module\s' '*.java' "${EXCL[@]}"
} > "$G.census.tsv"
echo "$R $(git -C "$W" rev-parse --short=12 HEAD): $(wc -l < "$G.bundles") gated bundles; census $(cut -f1 "$G.census.tsv" | sort | uniq -c | tr -s ' \n' ' ')"
[ -s "$G.base25.tsv" ] || bash "$T/compile_gate.sh" "$W" "$G.bundles" 25 "$G.base25"
{ bash "$REC/apply_jdk21.sh" "$W" "$G.bundles"; bash "$REC/apply_jdk21_pins.sh" "$W"; } > "$G.recipe.tsv"
echo "$R recipe: $(wc -l < "$G.recipe.tsv") files changed ($(cut -f1 "$G.recipe.tsv" | sort | uniq -c | tr -s ' \n' ' '))"
bash "$T/compile_gate.sh" "$W" "$G.bundles" 21 "$G.jdk21"
grep -F "illegal character: '/ufeff'" "$G.base25.tsv" | cut -f1 | sort -u > "$G.bom" || true
comm -23 "$G.jdk21.tsv" "$G.base25.tsv" \
	| awk -F'\t' -v bf="$G.bom" 'BEGIN { while ((getline l < bf) > 0) bom[l] = 1 } !($1 in bom)' > "$G.residue.tsv"
echo "$R residue: $(wc -l < "$G.residue.tsv") errors"
