// SPDX-License-Identifier: EPL-2.0
import java.util.Random;
import java.util.regex.Pattern;

/** Java 21 executable differential test for breakpoint regex transformation parity. */
public final class BreakpointRegexParity {
    private static final Pattern DOT = Pattern.compile("\\.");
    private static final Pattern STAR = Pattern.compile("\\*");
    private static final Pattern DOLLAR = Pattern.compile("\\$");
    private static int count;

    private BreakpointRegexParity() {}

    public static void main(String[] args) {
        final String[] fixed = { "", ".", "*", "$", "a.b", "A$B", "*.*", "pkg.Foo$Inner",
                "org.eclipse.jdt.*", "a\\b", "देवनागरी", "日本語", "\uD83D\uDE00" };
        for (String s : fixed) check(s);
        final Random random = new Random(0xB47A6E1L);
        final String alphabet = "abc.X*$:/\\\\0123456789- _";
        for (int i = 0; i < 10000; i++) {
            final int length = random.nextInt(80);
            final StringBuilder s = new StringBuilder(length);
            for (int j = 0; j < length; j++) {
                s.append(alphabet.charAt(random.nextInt(alphabet.length())));
            }
            check(s.toString());
        }
        System.out.println("PASS breakpoint regex parity checks=" + count);
    }

    private static void check(String value) {
        final String oldDot = value.replaceAll("\\.", "\\\\.");
        final String newDot = DOT.matcher(value).replaceAll("\\\\.");
        same(oldDot, newDot, "DOT");

        final String oldStar = oldDot.replaceAll("\\*", "\\.\\*");
        final String newStar = STAR.matcher(newDot).replaceAll("\\.\\*");
        same(oldStar, newStar, "STAR");

        final String oldDollar = oldStar.replaceAll("\\$", "\\\\\\$");
        final String newDollar = DOLLAR.matcher(newStar).replaceAll("\\\\\\$");
        same(oldDollar, newDollar, "DOLLAR");
    }

    private static void same(String oldValue, String newValue, String lane) {
        count++;
        if (!oldValue.equals(newValue)) {
            throw new AssertionError(lane + " mismatch: " + oldValue + " != " + newValue);
        }
    }
}
