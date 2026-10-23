/*******************************************************************************
 * Copyright (c) 2000, 2015 IBM Corporation and others.
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
package org.eclipse.jdt.internal.launching;


import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.IDebugEventSetListener;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.jdt.launching.JavaLaunchDelegate;
import org.eclipse.jdt.launching.JavaRuntime;

public class JavaAppletLaunchConfigurationDelegate extends JavaLaunchDelegate implements IDebugEventSetListener { //FLLDCIM: MARK — T27  IMPLEMENTS

	/**
	 * Mapping of ILaunch objects to File objects that represent the HTML file
	 * used to initiate the applet launch.  This is used to delete the HTML
	 * file when the launch terminates.
	 */
	private static Map<ILaunch, File> fgLaunchToFileMap = new HashMap<>(); //FLLDCIM: MARK — M01 M3_HASH_LANES NEW

	/**
	 * Used to map temporary file to launch object.
	 */
	private ILaunch fLaunch;

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ILaunchConfigurationDelegate#launch(org.eclipse.debug.core.ILaunchConfiguration, java.lang.String, org.eclipse.debug.core.ILaunch, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public synchronized void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor) throws CoreException {
		try {
			fLaunch = launch;
			super.launch(configuration, mode, launch, monitor);
		} catch (CoreException e) {
			cleanup(launch);
			throw e;
		}
		fLaunch = null;
	}

	/**
	 * Returns the system property string for the policy file
	 *
	 * @param workingDir the working directory
	 * @return system property for the policy file
	 */
	public String getJavaPolicyFile(File workingDir) {
		File file = new File(workingDir, "java.policy.applet");//$NON-NLS-1$
		if (!file.exists()) {
			// copy it to the working directory
			File test = LaunchingPlugin.getFileInPlugin(new Path("java.policy.applet")); //$NON-NLS-1$
			try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file))) {
				Files.copy(test.toPath(), outputStream);
			} catch (IOException e) {
				return "";//$NON-NLS-1$
			}
		}
		return "-Djava.security.policy=java.policy.applet";//$NON-NLS-1$
	}

	/**
	 * Using the specified launch configuration, build an HTML file that specifies the applet to launch. Return the name of the HTML file.
	 *
	 * @param configuration
	 *            the launch config
	 * @param dir
	 *            the directory in which to make the file
	 * @return the new HTML file
	 * @throws CoreException
	 *             if the file cannot be built
	 */
	private File buildHTMLFile(ILaunchConfiguration configuration, File dir) throws CoreException { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		String name = getAppletMainTypeName(configuration);
		File tempFile = new File(dir, name + System.currentTimeMillis() + ".html"); //$NON-NLS-1$ //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		try (FileOutputStream stream = new FileOutputStream(tempFile)) {
			String encoding = getLaunchManager().getEncoding(configuration);
			StringBuilder buf = new StringBuilder(); //FLLDCIM: MARK — M14 M3STRING_COMPOSITE NEW
			buf.append("<html>\n"); //$NON-NLS-1$ //FLLDCIM: MARK — M14 M3STRING_COMPOSITE CALL
			buf.append("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=" + encoding + "\"/>\n"); //$NON-NLS-1$ //$NON-NLS-2$ //FLLDCIM: MARK — M14 M3STRING_COMPOSITE CALL
			buf.append("<body>\n"); //$NON-NLS-1$ //FLLDCIM: MARK — M14 M3STRING_COMPOSITE CALL
			buf.append("<applet code="); //$NON-NLS-1$ //FLLDCIM: MARK — M14 M3STRING_COMPOSITE CALL
			buf.append(name); //FLLDCIM: MARK — M14 M3STRING_COMPOSITE CALL
			buf.append(".class "); //$NON-NLS-1$ //FLLDCIM: MARK — M14 M3STRING_COMPOSITE CALL
			String appletName = configuration.getAttribute(IJavaLaunchConfigurationConstants.ATTR_APPLET_NAME, ""); //$NON-NLS-1$
			if (appletName.length() != 0) {
				buf.append("NAME =\"" + appletName + "\" "); //$NON-NLS-1$ //$NON-NLS-2$ //FLLDCIM: MARK — M14 M3STRING_COMPOSITE CALL
			}
			buf.append("width=\""); //$NON-NLS-1$ //FLLDCIM: MARK — M14 M3STRING_COMPOSITE CALL
			buf.append(Integer.toString(configuration.getAttribute(IJavaLaunchConfigurationConstants.ATTR_APPLET_WIDTH, 200))); //FLLDCIM: MARK — M14 M3STRING_COMPOSITE CALL
			buf.append("\" height=\""); //$NON-NLS-1$ //FLLDCIM: MARK — M14 M3STRING_COMPOSITE CALL
			buf.append(Integer.toString(configuration.getAttribute(IJavaLaunchConfigurationConstants.ATTR_APPLET_HEIGHT, 200))); //FLLDCIM: MARK — M14 M3STRING_COMPOSITE CALL
			buf.append("\" >\n"); //$NON-NLS-1$ //FLLDCIM: MARK — M14 M3STRING_COMPOSITE CALL
			Map<String, String> parameters = configuration.getAttribute(IJavaLaunchConfigurationConstants.ATTR_APPLET_PARAMETERS, new HashMap<>()); //FLLDCIM: MARK — M01 M3_HASH_LANES NEW
			if (!parameters.isEmpty()) {
				Iterator<Entry<String, String>> iterator = parameters.entrySet().iterator();
				while (iterator.hasNext()) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
					Entry<String, String> next = iterator.next();
					buf.append("<param name="); //$NON-NLS-1$ //FLLDCIM: MARK — M14 M3STRING_COMPOSITE CALL
					buf.append(getQuotedString(next.getKey())); //FLLDCIM: MARK — M14 M3STRING_COMPOSITE CALL
					buf.append(" value="); //$NON-NLS-1$ //FLLDCIM: MARK — M14 M3STRING_COMPOSITE CALL
					buf.append(getQuotedString(next.getValue())); //FLLDCIM: MARK — M14 M3STRING_COMPOSITE CALL
					buf.append(">\n"); //$NON-NLS-1$ //FLLDCIM: MARK — M14 M3STRING_COMPOSITE CALL
				}
			}
			buf.append("</applet>\n"); //$NON-NLS-1$ //FLLDCIM: MARK — M14 M3STRING_COMPOSITE CALL
			buf.append("</body>\n"); //$NON-NLS-1$ //FLLDCIM: MARK — M14 M3STRING_COMPOSITE CALL
			buf.append("</html>\n"); //$NON-NLS-1$ //FLLDCIM: MARK — M14 M3STRING_COMPOSITE CALL

			stream.write(buf.toString().getBytes(encoding));
		} catch(IOException e) {
			LaunchingPlugin.log(e);
		}

		return tempFile;
	}

	private String getQuotedString(String string) {
		int singleQuotes = count(string, '\'');
		int doubleQuotes = count(string, '"');
		if (doubleQuotes == 0) {
			return '"' + string + '"'; //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		} else if (singleQuotes == 0) {
			return '\'' + string + '\''; //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		} else {
			return '"' + convertToHTMLContent(string) + '"'; //FLLDCIM: MARK — M33 M3STRING_COMPOSITE CONCAT
		}
	}

	private static int count(String string, char character) {
		int count = 0;
		for (int i = 0; i < string.length(); i++) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			if (string.charAt(i) == character) {
				count++;
			}
		}
		return count;
	}

	private static String convertToHTMLContent(String content) {
		content = replace(content, '"', "&quot;"); //$NON-NLS-1$
		content = replace(content, '\'', "&#39;"); //$NON-NLS-1$
		return content;
	}

	private static String replace(String text, char c, String s) { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD

		int previous = 0;
		int current = text.indexOf(c, previous);

		if (current == -1) {
			return text;
		}

		StringBuilder buffer = new StringBuilder(); //FLLDCIM: MARK — M14 M3STRING_COMPOSITE NEW
		while (current > -1) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			buffer.append(text.substring(previous, current)); //FLLDCIM: MARK — M14 M3STRING_COMPOSITE CALL
			buffer.append(s); //FLLDCIM: MARK — M14 M3STRING_COMPOSITE CALL
			previous = current + 1;
			current = text.indexOf(c, previous);
		}
		buffer.append(text.substring(previous)); //FLLDCIM: MARK — M14 M3STRING_COMPOSITE CALL

		return buffer.toString();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.IDebugEventSetListener#handleDebugEvents(org.eclipse.debug.core.DebugEvent[])
	 */
	@Override //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
	public void handleDebugEvents(DebugEvent[] events) {
		for (int i = 0; i < events.length; i++) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			DebugEvent event = events[i];
			Object eventSource = event.getSource();
			switch(event.getKind()) {

				// Delete the HTML file used for the launch
				case DebugEvent.TERMINATE :
					if (eventSource != null) {
						ILaunch launch = null;
						if (eventSource instanceof IProcess process) {
							launch = process.getLaunch();
						} else if (eventSource instanceof IDebugTarget debugTarget) {
							launch = debugTarget.getLaunch();
						}
						if (launch != null) {
							cleanup(launch);
						}
					}
					break;
			}
		}
	}

	/**
	 * Cleans up event listener and temporary file for the launch.
	 *
	 * @param launch the launch
	 */
	private void cleanup(ILaunch launch) {
		File temp = fgLaunchToFileMap.get(launch);
		if (temp != null) {
			try {
				fgLaunchToFileMap.remove(launch);
				temp.delete();
			} finally {
				if (fgLaunchToFileMap.isEmpty()) {
					DebugPlugin.getDefault().removeDebugEventListener(this);
				}
			}
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jdt.launching.AbstractJavaLaunchConfigurationDelegate#getProgramArguments(org.eclipse.debug.core.ILaunchConfiguration)
	 */
	@Override
	public String getProgramArguments(ILaunchConfiguration configuration) throws CoreException {
		File workingDir = verifyWorkingDirectory(configuration);
		// Construct the HTML file and set its name as a program argument
		File htmlFile = buildHTMLFile(configuration, workingDir);
		if (htmlFile == null) {
			abort(LaunchingMessages.JavaAppletLaunchConfigurationDelegate_Could_not_build_HTML_file_for_applet_launch_1, null, IJavaLaunchConfigurationConstants.ERR_COULD_NOT_BUILD_HTML);
		}
		// Add a debug listener if necessary
		if (fgLaunchToFileMap.isEmpty()) {
			DebugPlugin.getDefault().addDebugEventListener(this); //FLLDCIM: MARK — T27 DEBUG_EVENT_ADAPTER CALL
		}
		// Add a mapping of the launch to the html file
		fgLaunchToFileMap.put(fLaunch, htmlFile);
		return htmlFile.getName();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jdt.launching.AbstractJavaLaunchConfigurationDelegate#getVMArguments(org.eclipse.debug.core.ILaunchConfiguration)
	 */
	@Override
	public String getVMArguments(ILaunchConfiguration configuration) throws CoreException {
		StringBuilder arguments = new StringBuilder(super.getVMArguments(configuration)); //FLLDCIM: MARK — M14 M3STRING_COMPOSITE NEW
		File workingDir = verifyWorkingDirectory(configuration);
		String javaPolicyFile = getJavaPolicyFile(workingDir);
		arguments.append(" "); //$NON-NLS-1$ //FLLDCIM: MARK — M14 M3STRING_COMPOSITE CALL
		arguments.append(javaPolicyFile); //FLLDCIM: MARK — M14 M3STRING_COMPOSITE CALL
		return arguments.toString();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jdt.launching.AbstractJavaLaunchConfigurationDelegate#getMainTypeName(org.eclipse.debug.core.ILaunchConfiguration)
	 */
	@Override
	public String getMainTypeName(ILaunchConfiguration configuration) throws CoreException {
		return configuration.getAttribute(IJavaLaunchConfigurationConstants.ATTR_APPLET_APPLETVIEWER_CLASS, IJavaLaunchConfigurationConstants.DEFAULT_APPLETVIEWER_CLASS);
	}

	/**
	 * Returns the applet's main type name.
	 *
	 * @param configuration the config
	 * @return the main type name
	 * @throws CoreException if a problem occurs
	 */
	protected String getAppletMainTypeName(ILaunchConfiguration configuration) throws CoreException {
		return super.getMainTypeName(configuration);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jdt.launching.AbstractJavaLaunchConfigurationDelegate#getDefaultWorkingDirectory(org.eclipse.debug.core.ILaunchConfiguration)
	 */
	@Override
	protected File getDefaultWorkingDirectory(ILaunchConfiguration configuration) throws CoreException {
		// default working dir for applets is the project's output directory
		String outputDir = JavaRuntime.getProjectOutputDirectory(configuration);
		if (outputDir == null) {
			// if no project attribute, default to eclipse directory
			return new File(System.getProperty("user.dir"));  //$NON-NLS-1$
		}
		IResource resource = ResourcesPlugin.getWorkspace().getRoot().findMember(outputDir);
		if (resource == null || !resource.exists()) {
			//default to eclipse directory
			return new File(System.getProperty("user.dir"));  //$NON-NLS-1$
		}
		return resource.getLocation().toFile();
	}


}
