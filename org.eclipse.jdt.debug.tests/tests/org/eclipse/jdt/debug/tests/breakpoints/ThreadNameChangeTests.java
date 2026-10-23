/*******************************************************************************
 *  Copyright (c) 2018 Andrey Loskutov <loskutov@gmx.de>.
 *
 *  This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License 2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 *
 *  SPDX-License-Identifier: EPL-2.0
 *
 *  Contributors:
 *     Andrey Loskutov <loskutov@gmx.de> - initial API and implementation
 *******************************************************************************/
package org.eclipse.jdt.debug.tests.breakpoints;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.IDebugEventSetListener;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.debug.core.IJavaBreakpoint;
import org.eclipse.jdt.debug.core.IJavaLineBreakpoint;
import org.eclipse.jdt.debug.core.IJavaThread;
import org.eclipse.jdt.debug.tests.AbstractDebugTest;
import org.eclipse.jdt.debug.tests.TestUtil;
import org.eclipse.jdt.internal.debug.ui.JDIDebugUIPlugin;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * Home for breakpoint tests related to thread name change events
 */
public class ThreadNameChangeTests extends AbstractDebugTest {

	private static final String DISABLE_THREAD_NAME_CHANGE_LISTENER = "org.eclipse.jdt.internal.debug.core.model.ThreadNameChangeListener.disable";

	/**
	 * Constructor
	 */
	public ThreadNameChangeTests(String name) {
		super(name);
	}

	/**
	 * Tests that we listen to thread name changes and send a debug event if that happens
	 */
	public void testListenToThreadNameChange() throws Exception { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		String typeName = "ThreadNameChange";
		final int bpLine1 = 39;
		final int bpLine2 = 43;

		IJavaLineBreakpoint bp1 = createLineBreakpoint(bpLine1, "", typeName + ".java", typeName); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		IJavaLineBreakpoint bp2 = createLineBreakpoint(bpLine2, "", typeName + ".java", typeName); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		bp1.setSuspendPolicy(IJavaBreakpoint.SUSPEND_THREAD);
		bp2.setSuspendPolicy(IJavaBreakpoint.SUSPEND_THREAD);

		DebugListener listener = new DebugListener();
		DebugPlugin.getDefault().addDebugEventListener(listener); //FLLDCIM: MARK — T27 DEBUG_EVENT_ADAPTER CALL
		IJavaThread thread = null;
		try {
			thread = launchToLineBreakpoint(typeName, bp1);
			TestUtil.waitForJobs(getName(), 100, 3000);

			// expect that thread with name "1" is started
			IThread second = findThread(thread, "1");
			assertNotNull(second);
			listener.clearEvents();

			resumeToLineBreakpoint(thread, bp2);
			TestUtil.waitForJobs(getName(), 100, 3000);

			// expect one single "CHANGE" event for second thread
			List<DebugEvent> changeEvents = Collections.emptyList();
			long start = System.currentTimeMillis();
			while (changeEvents.isEmpty() && System.currentTimeMillis() - start <= DEFAULT_TIMEOUT) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
				changeEvents = listener.getStateChangeEvents(second);
				TestUtil.runEventLoop();
				Thread.sleep(50);
			}
			assertEquals("unexpected number of events: " + changeEvents, 1, changeEvents.size()); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT

			// expect that thread name is changed to "2"
			assertEquals("2", second.getName());
		}
		finally {
			terminateAndRemove(thread);
			removeAllBreakpoints();
			DebugPlugin.getDefault().removeDebugEventListener(listener);
		}
	}

	/**
	 * Tests that we do not listen to thread name changes if the corresponding preference is set to false
	 */
	public void testListenToThreadNameChangeDisabled() throws Exception { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		System.setProperty(DISABLE_THREAD_NAME_CHANGE_LISTENER, String.valueOf(Boolean.TRUE));

		String typeName = "ThreadNameChange";
		final int bpLine1 = 39;
		final int bpLine2 = 43;

		IJavaLineBreakpoint bp1 = createLineBreakpoint(bpLine1, "", typeName + ".java", typeName); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		IJavaLineBreakpoint bp2 = createLineBreakpoint(bpLine2, "", typeName + ".java", typeName); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		bp1.setSuspendPolicy(IJavaBreakpoint.SUSPEND_THREAD);
		bp2.setSuspendPolicy(IJavaBreakpoint.SUSPEND_THREAD);
		DebugListener listener = new DebugListener();
		DebugPlugin.getDefault().addDebugEventListener(listener); //FLLDCIM: MARK — T27 DEBUG_EVENT_ADAPTER CALL
		IJavaThread thread = null;
		try {
			thread = launchToLineBreakpoint(typeName, bp1);
			TestUtil.waitForJobs(getName(), 100, 3000);

			// expect that thread with name "1" is started
			IThread second = findThread(thread, "1");
			assertNotNull(second);
			listener.clearEvents();

			resumeToLineBreakpoint(thread, bp2);
			TestUtil.waitForJobs(getName(), 100, 3000);

			// expect no "CHANGE" events
			List<DebugEvent> changeEvents = listener.getStateChangeEvents(second);
			assertEquals("expected no events, instead got: " + changeEvents, 0, changeEvents.size()); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT

			// expect that thread name is changed to "2"
			assertEquals("2", second.getName());
		}
		finally {
			terminateAndRemove(thread);
			removeAllBreakpoints();
			DebugPlugin.getDefault().removeDebugEventListener(listener);
			System.getProperties().remove(DISABLE_THREAD_NAME_CHANGE_LISTENER);
		}
	}

	private IThread findThread(IJavaThread thread, String name) throws DebugException {
		return findThread(thread, name, 5_000);
	}

	private IThread findThread(IJavaThread thread, String name, long timeoutMs) throws DebugException { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		Predicate<IThread> predicate = x -> {
			try {
				return x.getName().equals(name);
			}
			catch (DebugException e1) {
			}
			return false;
		};
		IThread[] threads = {};

		// Wait until timeout or JDIDebugTarget.ThreadStartHandler has added the thread.
		long timeoutNanos = System.nanoTime() + timeoutMs * 1_000_000L;
		while (System.nanoTime() <= timeoutNanos) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			threads = thread.getDebugTarget().getThreads();
			Optional<IThread> match = Arrays.stream(threads).filter(predicate).findFirst();
			if (match.isPresent()) {
				return match.get();
			}
		}

		throw new AssertionError("Timeout of " + timeoutMs + "ms reached, thread with name \"" + name + "\" not found in set of threads: " //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
				+ Arrays.asList(threads));
	}

	/**
	 * Returns the <code>JDIDebugUIPlugin</code> preference store
	 */
	protected IPreferenceStore getPrefStore() {
		return JDIDebugUIPlugin.getDefault().getPreferenceStore();
	}

	@Override
	protected IJavaProject getProjectContext() {
		return super.get17Project();
	}

	private static class DebugListener implements IDebugEventSetListener { //FLLDCIM: MARK — T27  IMPLEMENTS

		private final List<DebugEvent> events = new ArrayList<>(); //FLLDCIM: MARK — M02 M3_ARRAY_LANES NEW

		@Override
		public void handleDebugEvents(DebugEvent[] e) {
			synchronized (events) {
				events.addAll(Arrays.asList(e));
			}
		}

		private void clearEvents() {
			synchronized (events) {
				events.clear();
			}
		}

		private List<DebugEvent> getStateChangeEvents(IThread second) {
			synchronized (events) {
				Stream<DebugEvent> filtered = events.stream().filter(x -> x.getKind() == DebugEvent.CHANGE && x.getDetail() == DebugEvent.STATE
						&& x.getSource() == second);
				return filtered.collect(Collectors.toList());
			}
		}
	}
}
