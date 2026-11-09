# Release readiness for M3JDK21 (Java 21): eclipse.jdt.debug

Measured on 2026-11-09 against fork master `6a67f7d657f45b3137887bb24ae576e3cff7b7ad` (upstream master `4578833d8042`).
Tools and raw evidence: [`docs/m3/jdk21/release-20261109`](../jdk21/release-20261109/). Every gate ran locally on CPU; fork CI runs are not counted
(startup failures and queue starvation on this account, 2026-11).

| # | Gate | Verdict | Evidence |
| --- | --- | --- | --- |
| G1 | No Java 22+ requirement on master: BREE above JavaSE-21 (0), build/IDE pins above 21 (0), unnamed `_` (0), `import module` (0) | PASS | CENSUS.tsv (code view; hits inside strings, text blocks and comments: CENSUS_MASKED.tsv) |
| G2 | Java-21 compile gate: JDK 25 javac `--release 21` minus `--release 25` over 5 bundles (1410 files, 9 roots); 77 baseline rows cancel | PASS (residue 0) | GATE_RESIDUE.tsv, GATE_SUMMARY.tsv |
| G2b | Parse gate: every tracked Java source (1650 files, test bundles included, test-input folders excluded), JDK 25 javac `--release 21` stopped after parsing | PASS | PARSE_GATE.tsv |
| G3 | Recipe fixed point (`apply_jdk21.sh` + `apply_jdk21_pins.sh` change nothing on master) | PASS | RECIPE_CHANGES.tsv |
| G4 | Metadata consistent: Tycho bundle/feature versions match their pom, no EE above 21 in a Java-21 bundle | PASS | META.tsv |
| G5 | Full Tycho build of this repository on JDK 21 (`mvn -B clean verify -DskipTests`, fork parent + SDK target from the fork aggregator, other components from the upstream 4.42 I-build repository) | PASS | BUILD SUCCESS in 245 s, modules 7/7 ok, 0 failed, 0 [ERROR] rows (BUILD_G5.tsv, BUILD_G5_ERRORS.tsv, BUILD_G5.log.gz) |
| G6 | Eclipse SDK product build and launch on JDK 21 | PENDING | aggregator verdict, eclipse.platform.releng.aggregator docs/m3/release/RELEASE_READINESS.md |

## What this PR changes

Fork master `6a67f7d657f4` passes G1 to G4, but its Tycho build on JDK 21 (G5) failed in two attempts with ECJ errors
that M3 lanes left in bundles compiled with NLS problems as errors (javac does not check NLS tags, so G2 cannot see them):

| Attempt | Result | Rows |
| --- | --- | --- |
| 1 | BUILD FAILURE, org.eclipse.jdt.debug | 5 x "Unnecessary $NON-NLS$ tag": the regex-hoist lane turned `replaceAll("\.", "\\.") //$NON-NLS-1$//$NON-NLS-2$` into a one-literal hoisted-Pattern call and kept both tags (JavaExceptionBreakpoint 524-525, JavaMethodBreakpoint 690-692) |
| 2 (`--fail-at-end`) | BUILD FAILURE, org.eclipse.jdt.debug.ui | 2 x "Non-externalized string literal": the StringBuilder fold wrote `return "" + uniqueId;` / `return "" + count;` (upstream: `buffer.append(n)`) without a tag (JavaVariableLabelProvider 176, 194) |
| 3 | BUILD SUCCESS, 7/7 modules, 245 s | 0 |

Fill (`fix_nls_tags.sh`, BLLSE-driven from the Maven log, plus a static scan of lane-anchored lines): surplus tags removed,
missing tags appended; only comments change, so G2 and G2b are unaffected.

## Re-run

```bash
git clone --depth 1 https://github.com/hsoliwal/eclipse.jdt.debug.git && git -C eclipse.jdt.debug remote add upstream <upstream>
git -C eclipse.jdt.debug fetch --depth 1 --filter=blob:none upstream master:refs/remotes/upstream/master
bash docs/m3/jdk21/release-20261109/gate_master.sh eclipse.jdt.debug    # paths at the top of the script; JAVAC = JDK 25 javac
bash docs/m3/jdk21/release-20261109/meta_check.sh eclipse.jdt.debug > META.tsv
```

The gate compiles every bundle that upstream master declares JavaSE-22 or newer, plus the 2026-10-20 list, against the
newest jar of every bundle in a p2 pool. Errors in both runs are classpath noise (APIs newer than the pool); what remains
after `--release 21` is the Java 22+ residue and must be empty.
