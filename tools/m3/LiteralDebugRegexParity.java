// SPDX-License-Identifier: EPL-2.0
/** Differential parity of literal regex operations received into JDT Debug. */
public final class LiteralDebugRegexParity {
    private LiteralDebugRegexParity() {}
    public static void main(String[] args) {
        final java.util.Random rng = new java.util.Random(0x4D334A44444247L);
        final String[] atoms = {"", "\t", "\\t", "/", ".", "a.b/c", "\\", "😀", "हिंदी", "日本語", "$", "\\n", "  "};
        for (int i = 0; i < 100_000; i++) {
            final StringBuilder s = new StringBuilder();
            for (int j = rng.nextInt(10); j >= 0; j--) {
                s.append(atoms[rng.nextInt(atoms.length)]);
            }
            final String text = s.toString();
            if (!text.replaceAll("\\\t", "").equals(text.replace("\t", ""))) {
                throw new AssertionError("TAB mismatch: " + i);
            }
            if (!text.replaceAll("/", ".").equals(text.replace("/", "."))) {
                throw new AssertionError("SLASH mismatch: " + i);
            }
            if (!text.replaceAll("\\.", "/").equals(text.replace(".", "/"))) {
                throw new AssertionError("DOT mismatch: " + i);
            }
        }
        System.out.println("literal_debug_regex_parity=PASS cases=100000 transformations=3");
    }
}
