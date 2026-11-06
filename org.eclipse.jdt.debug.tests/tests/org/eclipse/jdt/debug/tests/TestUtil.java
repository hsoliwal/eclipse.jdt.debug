/*******************************************************************************
 * Copyright (c) 2016 Google, Inc and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Stefan Xenos (Google) - Initial implementation
 *******************************************************************************/
package org.eclipse.jdt.debug.tests;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.core.internal.jobs.JobManager;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.internal.ui.views.console.ProcessConsole;
import org.eclipse.jdt.debug.testplugin.JavaTestPlugin;
import org.eclipse.jface.text.reconciler.AbstractReconciler;
import org.eclipse.swt.widgets.Display;
import org.junit.Assert;

public class TestUtil {

	/**
	 * Call this in the tearDown method of every test to clean up state that can
	 * otherwise leak through SWT between tests.
	 */
	public static void cleanUp(String owner) { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		// Ensure that the Thread.interrupted() flag didn't leak.
		Assert.assertFalse("The main thread should not be interrupted at the end of a test", Thread.interrupted());

		// Wait for any outstanding jobs to finish. Protect against deadlock by
		// terminating the wait after a timeout.
		boolean timedOut = waitForJobs(owner, 5, 5000);
		if (timedOut) {
			// We don't expect any extra jobs run during the test: try to cancel them
			log(IStatus.INFO, owner, "Trying to cancel running jobs: " + getRunningOrWaitingJobs(null)); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
			getRunningOrWaitingJobs(null).forEach(Job::cancel);
			waitForJobs(owner, 5, 1000);
		}

		// Ensure that the Thread.interrupted() flag didn't leak.
		Assert.assertFalse("The main thread should not be interrupted at the end of a test", Thread.interrupted());

		ILaunchManager launchManager = DebugPlugin.getDefault().getLaunchManager();
		List<ILaunch> launches = Arrays.asList(launchManager.getLaunches());
		// in case some test left a launch, remove it before reporting a failure, so that further tests can work on a clean Debug View state
		for (ILaunch launch : launches) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			launchManager.removeLaunch(launch);
		}
		Assert.assertEquals("expected no launches after test", Collections.EMPTY_LIST, launches);
	}

	public static void logInfo(String message) {
		System.out.println(new SimpleDateFormat("HH:mm:ss.SSS").format(new Date()) + " " + message); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
	}

	public static void log(int severity, String owner, String message, Throwable... optionalError) {
		message = "[" + owner + "] " + message; //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		Throwable error = null;
		if (optionalError != null && optionalError.length > 0) {
			error = optionalError[0];
		}
		Status status = new Status(severity, JavaTestPlugin.getDefault().getBundle().getSymbolicName(), message, error);
		JavaTestPlugin.getDefault().getLog().log(status);
	}

	/**
	 * Process all queued UI events. If called from background thread, does
	 * nothing.
	 */
	public static void runEventLoop() { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		Display display = Display.getCurrent();
		if (display != null) {
			if (!display.isDisposed()) {
				while (display.readAndDispatch()) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
					// Keep pumping events until the queue is empty
				}
			}
		} else {
			long timeoutNanos = System.nanoTime() + AbstractDebugTest.DEFAULT_TIMEOUT * 1_000_000L;
			AtomicBoolean stop = new AtomicBoolean();
			Display.getDefault().asyncExec(() -> stop.set(true)); //FLLDCIM: MARK — T08 UI_THREAD_SYNCHRONIZER CALL
			while (!stop.get() && System.nanoTime() < timeoutNanos) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					break;
				}
			}
		}
	}

	/**
	 * Utility for waiting until the execution of jobs of any family has finished or timeout is reached. If no jobs are running, the method waits
	 * given minimum wait time. While this method is waiting for jobs, UI events are processed.
	 * <p>
	 * <b>Note:</b> This method does not wait for jobs that belong to the families specified in {@link #getUsualJobFamiliesToIgnore()}.
	 *
	 * @param owner
	 *            name of the caller which will be logged as prefix if the wait times out
	 * @param minTimeMs
	 *            minimum wait time in milliseconds
	 * @param maxTimeMs
	 *            maximum wait time in milliseconds
	 * @return true if the method timed out, false if all the jobs terminated before the timeout
	 */
	public static boolean waitForJobs(String owner, long minTimeMs, long maxTimeMs) {
		return waitForJobs(owner, minTimeMs, maxTimeMs, getUsualJobFamiliesToIgnore());
	}

	/**
	 * Utility for waiting until the execution of jobs of any family has finished or timeout is reached. If no jobs are running, the method waits
	 * given minimum wait time. While this method is waiting for jobs, UI events are processed.
	 *
	 * @param owner
	 *            name of the caller which will be logged as prefix if the wait times out
	 * @param minTimeMs
	 *            minimum wait time in milliseconds
	 * @param maxTimeMs
	 *            maximum wait time in milliseconds
	 * @param excludedFamilies
	 *            optional list of job families to NOT wait for
	 *
	 * @return true if the method timed out, false if all the jobs terminated before the timeout
	 */
	public static boolean waitForJobs(String owner, long minTimeMs, long maxTimeMs, Object... excludedFamilies) {
		return waitForJobs(owner, null, minTimeMs, maxTimeMs, excludedFamilies);
	}

	public static boolean waitForJobs(String owner, Object jobFamily, long minTimeMs, long maxTimeMs, Object... excludedFamilies) { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		if (maxTimeMs < minTimeMs) {
			throw new IllegalArgumentException("Max time is smaller as min time!");
		}
		// Not so nice workaround for https://github.com/eclipse-jdt/eclipse.jdt.debug/issues/721
		// After https://github.com/eclipse-platform/eclipse.platform.ui/pull/3025 every opened editor
		// means there will be a reconciler job running, which is not what we do NOT want to wait for.
		// AbstractReconciler.class is the family object we can check for.
		if (excludedFamilies == null) {
			excludedFamilies = new Object[] { AbstractReconciler.class };
		} else if (excludedFamilies.length == 1 && excludedFamilies[0] == ProcessConsole.class) {
			excludedFamilies = getUsualJobFamiliesToIgnore();
		}
		wakeUpSleepingJobs(jobFamily);
		final long startNanos = System.nanoTime();
		while (System.nanoTime() - startNanos < minTimeMs * 1_000_000L) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			runEventLoop();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// Uninterruptable
			}
		}
		while (!Job.getJobManager().isIdle()) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			runEventLoop();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// Uninterruptable
			}
			List<Job> jobs = getRunningOrWaitingJobs(jobFamily, excludedFamilies);
			if (jobs.isEmpty()) {
				// only uninteresting jobs running
				break;
			}
			jobs.forEach(Job::wakeUp);

			if (!Collections.disjoint(runningJobs, jobs)) {
				// There is a job which runs already quite some time, don't wait for it to avoid test timeouts
				dumpRunningOrWaitingJobs(owner, jobs);
				return true;
			}

			if (System.nanoTime() - startNanos >= maxTimeMs * 1_000_000L) {
				dumpRunningOrWaitingJobs(owner, jobs);
				return true;
			}
			wakeUpSleepingJobs(jobFamily);
		}
		runningJobs.clear();
		return false;
	}

	/**
	 * Returns a list of job families that are usually ignored in tests.
	 * <p>
	 * This is used to avoid waiting for jobs that are not relevant to the test.
	 * </p>
	 *
	 * @return an array of job family classes to ignore
	 */
	public static Object[] getUsualJobFamiliesToIgnore() {
		return new Object[] { ProcessConsole.class, AbstractReconciler.class };
	}

	private static void wakeUpSleepingJobs(Object jobFamily) {
		Job.getJobManager().wakeUp(jobFamily);
	}

	static Set<Job> runningJobs = new LinkedHashSet<>();

	private static void dumpRunningOrWaitingJobs(String owner, List<Job> jobs) {
		String message = "Some job is still running or waiting to run: " + dumpRunningOrWaitingJobs(jobs); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		log(IStatus.ERROR, owner, message);
	}

	private static String dumpRunningOrWaitingJobs(List<Job> jobs) { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		if (jobs.isEmpty()) {
			return "";
		}
		// clear "old" running jobs, we only remember most recent
		runningJobs.clear();
		StringBuilder sb = new StringBuilder(); //FLLDCIM: MARK — M14 M3STRING_COMPOSITE NEW
		for (Job job : jobs) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			runningJobs.add(job);
			sb.append("\n'").append(job.toString()).append("'/"); //FLLDCIM: MARK — M14 M3STRING_COMPOSITE CALL
			sb.append(job.getClass().getName()); //FLLDCIM: MARK — M14 M3STRING_COMPOSITE CALL
			sb.append(":").append(JobManager.printState(job)); //FLLDCIM: MARK — M14 M3STRING_COMPOSITE CALL
			Thread thread = job.getThread();
			if (thread != null) {
				ThreadInfo[] threadInfos = ManagementFactory.getThreadMXBean().getThreadInfo(new long[] { thread.threadId() }, true, true);
				if (threadInfos[0] != null) {
					sb.append("\nthread info: ").append(threadInfos[0]); //FLLDCIM: MARK — M14 M3STRING_COMPOSITE CALL
				}
			}
			sb.append(", "); //FLLDCIM: MARK — M14 M3STRING_COMPOSITE CALL
		}

		Thread thread = Display.getDefault().getThread();
		ThreadInfo[] threadInfos = ManagementFactory.getThreadMXBean().getThreadInfo(new long[] { thread.threadId() }, true, true);
		if (threadInfos[0] != null) {
			sb.append("\n").append("UI thread info: ").append(threadInfos[0]); //FLLDCIM: MARK — M14 M3STRING_COMPOSITE CALL
		}
		return sb.toString();
	}

	public static List<Job> getRunningOrWaitingJobs(Object jobFamily, Object... excludedFamilies) {
		List<Job> running = new ArrayList<>(); //FLLDCIM: MARK — M02 M3_ARRAY_LANES NEW
		Job[] jobs = Job.getJobManager().find(jobFamily);
		for (Job job : jobs) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			if (isRunningOrWaitingJob(job) && !belongsToFamilies(job, excludedFamilies)) {
				running.add(job);
			}
		}
		return running;
	}

	private static boolean isRunningOrWaitingJob(Job job) {
		int state = job.getState();
		return (state == Job.RUNNING || state == Job.WAITING);
	}

	private static boolean belongsToFamilies(Job job, Object... excludedFamilies) {
		if (excludedFamilies == null || excludedFamilies.length == 0) {
			return false;
		}
		for (Object family : excludedFamilies) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			if (job.belongsTo(family)) {
				return true;
			}
		}
		return false;
	}

}
