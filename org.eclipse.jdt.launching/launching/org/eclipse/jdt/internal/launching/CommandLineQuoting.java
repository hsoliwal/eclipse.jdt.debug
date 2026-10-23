package org.eclipse.jdt.internal.launching;

import org.eclipse.core.runtime.Platform;

/**
 * Utility for quoting of command line Arguments
 */
public class CommandLineQuoting {

	private CommandLineQuoting() {
		// empty
	}

	public static String[] quoteWindowsArgs(String[] cmdLine) {
		// see https://bugs.eclipse.org/387504 , workaround for http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=6511002
		if (Platform.OS.isWindows()) {
			String[] winCmdLine = new String[cmdLine.length];
			if (cmdLine.length > 0) {
				winCmdLine[0] = cmdLine[0];
			}
			for (int i = 1; i < cmdLine.length; i++) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
				winCmdLine[i] = winQuote(cmdLine[i]);
			}
			cmdLine = winCmdLine;
		}
		return cmdLine;
	}

	static boolean needsQuoting(String s) { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		int len = s.length();
		if (len == 0) {
			return true;
		}
		if ("\"\"".equals(s)) //$NON-NLS-1$
		{
			return false; // empty quotes must not be quoted again
		}
		for (int i = 0; i < len; i++) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			switch (s.charAt(i)) {
				case ' ':
				case '\t':
				case '\\':
				case '"':
					return true;
			}
		}
		return false;
	}

	private static String winQuote(String s) {
		if (!needsQuoting(s)) {
			return s;
		}
		s = s.replaceAll("([\\\\]*)\"", "$1$1\\\\\""); //$NON-NLS-1$ //$NON-NLS-2$ //FLLDCIM: MARK — M12 REGEX_PRECOMPUTE CALL
		s = s.replaceAll("([\\\\]*)\\z", "$1$1"); //$NON-NLS-1$ //$NON-NLS-2$ //FLLDCIM: MARK — M12 REGEX_PRECOMPUTE CALL
		return "\"" + s + "\""; //$NON-NLS-1$ //$NON-NLS-2$ //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
	}

}
