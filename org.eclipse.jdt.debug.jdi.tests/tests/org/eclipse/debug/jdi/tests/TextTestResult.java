/*******************************************************************************
 * Copyright (c) 2000, 2012 IBM Corporation and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.debug.jdi.tests;

import java.util.Enumeration;

import junit.framework.AssertionFailedError;
import junit.framework.Test;
import junit.framework.TestFailure;
import junit.framework.TestResult;

/**
 * Tests a <code>TestResult</code>
 */
public class TextTestResult extends TestResult {

	/**
	 * @see junit.framework.TestResult#addError(junit.framework.Test, java.lang.Throwable)
	 */
	@Override
	public synchronized void addError(Test test, Throwable t) {
		super.addError(test, t);
		System.out.println("E");
	}
	/**
	 * @see junit.framework.TestResult#addFailure(junit.framework.Test, junit.framework.AssertionFailedError)
	 */
	@Override
	public synchronized void addFailure(Test test, AssertionFailedError t) {
		super.addFailure(test, t);
		System.out.print("F");
	}
	/**
	 * Prints failures to the standard output
	 */
	public synchronized void print() {
		printHeader();
		printErrors();
		printFailures();
	}
	/**
	 * Prints the errors to the standard output
	 */
	public void printErrors() {
		if (errorCount() != 0) {
			if (errorCount() == 1)
				System.out.println("There was " + errorCount() + " error:"); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
			else
				System.out.println("There were " + errorCount() + " errors:"); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT

			int i = 1;
			for (Enumeration<?> e = errors(); e.hasMoreElements(); i++) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
				TestFailure failure = (TestFailure) e.nextElement();
				System.out.println(i + ") " + failure.failedTest()); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
				failure.thrownException().printStackTrace();
				System.out.println();
			}
		}
	}
	/**
	 * Prints failures to the standard output
	 */
	public void printFailures() { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		if (failureCount() != 0) {
			if (failureCount() == 1)
				System.out.println("There was " + failureCount() + " failure:"); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
			else
				System.out.println(
					"There were " + failureCount() + " failures:"); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT

			int i = 1;
			for (Enumeration<?> e = failures(); e.hasMoreElements(); i++) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
				TestFailure failure = (TestFailure) e.nextElement();
				System.out.print(i + ") " + failure.failedTest()); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
				Throwable t = failure.thrownException();
				if (t.getMessage() != null)
					System.out.println(" \"" + t.getMessage() + "\""); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
				else {
					System.out.println();
					failure.thrownException().printStackTrace();
				}
			}
		}
	}
	/**
	 * Prints the header of the report
	 */
	public void printHeader() { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		if (wasSuccessful()) {
			System.out.println();
			System.out.print("OK");
			System.out.println(" (" + runCount() + " tests)"); //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT

		} else {
			System.out.println();
			System.out.println("!!!FAILURES!!!");
			System.out.println("Test Results:");
			System.out.println(
				"Run: " //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
					+ runCount()
					+ " Failures: "
					+ failureCount()
					+ " Errors: "
					+ errorCount());
		}
	}
	/**
	 * @see junit.framework.TestResult#startTest(junit.framework.Test)
	 */
	@Override
	public synchronized void startTest(Test test) {
		super.startTest(test);
		System.out.print(".");
	}
}
