// SPDX-License-Identifier: EPL-2.0
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Random;

/** Regression parity for JDT Debug immutable regex plans. */
public final class JdtDebugRegexHoistParity {
    private static final String[] REGEXES = {
        "([a-zA-Z0-9\\$]+)\\.([a-zA-Z0-9]+)\\(([^)]*)\\)",
        "([a-zA-Z0-9\\$]+(?:<[a-zA-Z0-9,<>]+>)?)\\.([a-zA-Z0-9]+)\\(([^)]*)\\)",
        "([a-zA-Z0-9\\$]+(?:\\([a-zA-Z0-9]+\\))?)\\.([a-zA-Z0-9]+)\\(([^)]*)\\)",
        "\\w+\\([^)]*\\)",
        "\\(([^)]*)\\)",
        "\\(([^)]+)\\)"
    };
    private static final Pattern[] CACHED = java.util.Arrays.stream(REGEXES)
            .map(Pattern::compile).toArray(Pattern[]::new);
    private JdtDebugRegexHoistParity() {}
    public static void main(String[] args) {
        final Random rng = new Random(0x4D334A44444247L);
        final String[] atoms = {"", "Foo", "Class", "foo.bar(x)", "A$B", "java.lang.String", "<T,Long>", "(", ")", "abc()", "[x]", "foo/bar", "😀", "हिंदी", ".", "\\", " \t"};
        for (int n = 0; n < 100_000; n++) {
            final StringBuilder b = new StringBuilder();
            for (int i = rng.nextInt(7); i >= 0; i--) b.append(atoms[rng.nextInt(atoms.length)]);
            final String text = b.toString();
            for (int k = 0; k < REGEXES.length; k++) {
                final Matcher fromCompiled = CACHED[k].matcher(text);
                final Matcher fromFresh = Pattern.compile(REGEXES[k]).matcher(text);
                final boolean a = fromCompiled.find(), c = fromFresh.find();
                if (a != c) throw new AssertionError("find mismatch " + n + "/" + k);
                if (a) {
                    if (fromCompiled.start() != fromFresh.start() || fromCompiled.end() != fromFresh.end()) throw new AssertionError("span mismatch " + n + "/" + k);
                    for (int group = 0; group <= fromFresh.groupCount(); group++) {
                        if (!java.util.Objects.equals(fromCompiled.group(group), fromFresh.group(group))) throw new AssertionError("capture mismatch " + n + "/" + k);
                    }
                }
                if (!CACHED[k].matcher(text).replaceAll("!").equals(Pattern.compile(REGEXES[k]).matcher(text).replaceAll("!"))) throw new AssertionError("replace mismatch " + n + "/" + k);
            }
        }
        System.out.println("jdt_debug_hoist_parity=PASS cases=100000 plans=6");
    }
}
