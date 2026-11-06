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
package org.eclipse.jdt.internal.debug.ui.propertypages;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.model.IDebugElement;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.jdt.debug.core.IJavaDebugTarget;
import org.eclipse.jdt.debug.core.IJavaThread;
import org.eclipse.jdt.internal.debug.ui.JDIDebugUIPlugin;
import org.eclipse.jface.viewers.AbstractTreeViewer;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class ThreadFilterEditor {

	private final JavaBreakpointAdvancedPage fPage;
	private CheckboxTreeViewer fThreadViewer;
	private final ThreadFilterContentProvider fContentProvider;
	private final CheckHandler fCheckHandler;
	private static String MAIN= "main"; //$NON-NLS-1$

	public ThreadFilterEditor(Composite parent, JavaBreakpointAdvancedPage page) {
		fPage= page;
		fContentProvider= new ThreadFilterContentProvider();
		fCheckHandler= new CheckHandler();
		createThreadViewer(parent);
	}

	private void createThreadViewer(Composite parent) {
		Label label= new Label(parent, SWT.NONE);
		label.setText(PropertyPageMessages.ThreadFilterEditor_1);
		label.setFont(parent.getFont());
		label.setLayoutData(new GridData());

		GridData data= new GridData(GridData.FILL_BOTH);
		data.heightHint= 100;
		fThreadViewer= new CheckboxTreeViewer(parent, SWT.BORDER);
		fThreadViewer.addCheckStateListener(fCheckHandler); //FLLDCIM: MARK — T21 CHECK_STATE_LANE CALL
		fThreadViewer.getTree().setLayoutData(data);
		fThreadViewer.getTree().setFont(parent.getFont());
		fThreadViewer.setContentProvider(fContentProvider);
		fThreadViewer.setLabelProvider(DebugUITools.newDebugModelPresentation()); //FLLDCIM: MARK — T24 LABEL_DELTA CALL
		fThreadViewer.setInput(DebugPlugin.getDefault().getLaunchManager()); //FLLDCIM: MARK — M21 FULL_REBUILD_TO_DELTA CALL
		setInitialCheckedState();
	}

	protected void doStore() { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		IJavaDebugTarget target;
		IJavaThread thread;
		for (IDebugTarget debugTarget : getDebugTargets()) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
			target = debugTarget.getAdapter(IJavaDebugTarget.class);
			if (target != null) {
				try {
					if (fThreadViewer.getChecked(target)) {
						for (IThread targetThread : target.getThreads()) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
							thread= (IJavaThread)targetThread;
							if (fThreadViewer.getChecked(thread)) {
								// thread selected for filtering
								fPage.getBreakpoint().setThreadFilter(thread);
								break; // Can only set one filtered thread.
							}
						}
					} else {
						fPage.getBreakpoint().removeThreadFilter(target);
					}
				} catch (CoreException e) {
					JDIDebugUIPlugin.log(e);
				}
			}
		}
	}

	/**
	 * Sets the initial checked state of the tree viewer.
	 * The initial state should reflect the current state
	 * of the breakpoint. If the breakpoint has a thread
	 * filter in a given thread, that thread should be
	 * checked.
	 */
	protected void setInitialCheckedState() {
		try {
			for (IDebugTarget debugTarget : getDebugTargets()) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
				IJavaDebugTarget target = debugTarget.getAdapter(IJavaDebugTarget.class);
				if (target != null) {
					IJavaThread filteredThread= fPage.getBreakpoint().getThreadFilter(target);
					if (filteredThread != null) {
						fCheckHandler.checkThread(filteredThread, true);
					}
				}
			}
		} catch (CoreException e) {
			JDIDebugUIPlugin.log(e);
		}
	}

	/**
	 * Returns the debug targets that appear in the tree
	 */
	protected IDebugTarget[] getDebugTargets() {
		Object input= fThreadViewer.getInput();
		if (!(input instanceof ILaunchManager launchManager)) {
			return new IJavaDebugTarget[0];
		}
		return launchManager.getDebugTargets();
	}

	class CheckHandler implements ICheckStateListener { //FLLDCIM: MARK — T21  IMPLEMENTS
		@Override
		public void checkStateChanged(CheckStateChangedEvent event) {
			Object element= event.getElement();
			if (element instanceof IDebugTarget) {
				checkTarget((IDebugTarget)element, event.getChecked());
			} else if (element instanceof IThread) {
				checkThread((IThread)element, event.getChecked());
			}
			verifyCheckedState();
		}

		/**
		 * Check or uncheck a debug target in the tree viewer.
		 * When a debug target is checked, attempt to
		 * check one of the target's threads by default.
		 * When a debug target is unchecked, uncheck all
		 * its threads.
		 */
		protected void checkTarget(IDebugTarget target, boolean checked) { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
			fThreadViewer.setChecked(target, checked);
			if (checked) {
				fThreadViewer.expandToLevel(target, AbstractTreeViewer.ALL_LEVELS);
				IThread[] threads;
				try {
					threads= target.getThreads();
				} catch (DebugException exception) {
					JDIDebugUIPlugin.log(exception);
					return;
				}
				IThread thread;
				boolean checkedThread= false;
				// Try to check the "main" thread by default
				for (IThread targetThread : threads) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
					thread= targetThread;
					String name= null;
					try {
						name= thread.getName();
					} catch (DebugException exception) {
						JDIDebugUIPlugin.log(exception);
					}
					if (MAIN.equals(name)) {
						checkedThread= fThreadViewer.setChecked(thread, true);
					}
				}
				// If the main thread couldn't be checked, check the first
				// available thread
				if (!checkedThread) {
					for (IThread targetThread : threads) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
						if (fThreadViewer.setChecked(targetThread, true)) {
							break;
						}
					}
				}
			} else { // Unchecked
				IThread[] threads;
				try {
					threads= target.getThreads();
				} catch (DebugException exception) {
					JDIDebugUIPlugin.log(exception);
					return;
				}
				for (IThread thread : threads) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
					fThreadViewer.setChecked(thread, false);
				}
			}
		}

		/**
		 * Check or uncheck a thread.
		 * When a thread is checked, make sure its debug
		 * target is also checked.
		 * When a thread is unchecked, uncheck its debug
		 * target.
		 */
		protected void checkThread(IThread thread, boolean checked) { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
			fThreadViewer.setChecked(thread, checked);
			IDebugTarget target= (thread).getDebugTarget();
			if (checked) {
				// When a thread is checked, make sure the target
				// is checked and all other threads are
				// unchecked (simulate radio button behavior)
				if (!fThreadViewer.getChecked(target)) {
					fThreadViewer.setChecked(target, true);
				}
				IThread[] threads;
				try {
					threads= target.getThreads();
				} catch (DebugException exception) {
					JDIDebugUIPlugin.log(exception);
					return;
				}
				for (IThread targetThread : threads) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
					if (targetThread != thread) {
						// Uncheck all threads other than the selected thread
						fThreadViewer.setChecked(targetThread, false);
					}
				}
			} else {
				// When a thread is unchecked, uncheck the target
				fThreadViewer.setChecked(target, false);
			}
		}

		/**
		 * Verify the state of the tree viewer.
		 * If the user selects a debug target, they must select
		 * a thread.
		 */
		protected void verifyCheckedState() { //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
			IDebugTarget[] targets= getDebugTargets();
			IDebugTarget target;
			IThread[] threads;
			boolean checkedThread;
			for (IDebugTarget debugTarget : targets) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
				target= debugTarget;
				if (!fThreadViewer.getChecked(target)) {
					continue;
				}
				try {
					threads= target.getThreads();
				} catch (DebugException exception) {
					JDIDebugUIPlugin.log(exception);
					continue;
				}
				checkedThread= false;
				for (IThread thread : threads) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
					if (fThreadViewer.getChecked(thread)) {
						checkedThread= true;
						break;
					}
				}
				if (checkedThread) {
					fPage.setErrorMessage(null);
				} else {
					fPage.setErrorMessage(PropertyPageMessages.ThreadFilterEditor_2);
				}
			}
		}

	}

	class ThreadFilterContentProvider implements ITreeContentProvider { //FLLDCIM: MARK — M22  IMPLEMENTS
		/**
		 * @see ITreeContentProvider#getChildren(Object)
		 */
		@Override //FLLDCIM: MARK — ML METHOD_SPLIT METHOD
		public Object[] getChildren(Object parent) {
			if (parent instanceof IDebugTarget) {
				IJavaDebugTarget target = ((IDebugTarget)parent).getAdapter(IJavaDebugTarget.class);
				if (target != null) {
					try {
						return ((IJavaDebugTarget)parent).getThreads();
					} catch (DebugException e) {
						JDIDebugUIPlugin.log(e);
					}
				}
			}
			if (parent instanceof ILaunchManager) {
				List<IJavaDebugTarget> children= new ArrayList<>(); //FLLDCIM: MARK — M02 M3_ARRAY_LANES NEW
				ILaunch[] launches= ((ILaunchManager) parent).getLaunches();
				IDebugTarget[] targets;
				IJavaDebugTarget target;
				for (ILaunch launch : launches) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
					targets= launch.getDebugTargets();
					for (IDebugTarget debugTarget : targets) { //FLLDCIM: MARK — M32 LOOP_TO_LANE LOOP
						target= debugTarget.getAdapter(IJavaDebugTarget.class);
						if (target != null && !target.isDisconnected() && !target.isTerminated()) {
							children.add(target);
						}
					}
				}
				return children.toArray();
			}
			return new Object[0];
		}

		/**
		 * @see ITreeContentProvider#getParent(Object)
		 */
		@Override
		public Object getParent(Object element) {
			if (element instanceof IThread) {
				return ((IThread)element).getDebugTarget();
			}
			if (element instanceof IDebugTarget) {
				return ((IDebugElement)element).getLaunch();
			}
			if (element instanceof ILaunch) {
				return DebugPlugin.getDefault().getLaunchManager();
			}
			return null;
		}

		/**
		 * @see ITreeContentProvider#hasChildren(Object)
		 */
		@Override
		public boolean hasChildren(Object element) {
			if (element instanceof IStackFrame) {
				return false;
			}
			if (element instanceof IDebugElement) {
				return getChildren(element).length > 0;
			}
			if (element instanceof ILaunch) {
				return true;
			}
			if (element instanceof ILaunchManager) {
				return ((ILaunchManager) element).getLaunches().length > 0;
			}
			return false;
		}

		/**
		 * @see IStructuredContentProvider#getElements(Object)
		 */
		@Override
		public Object[] getElements(Object inputElement) {
			return getChildren(inputElement);
		}

		/**
		 * @see IContentProvider#dispose()
		 */
		@Override
		public void dispose() {
		}

		/**
		 * @see IContentProvider#inputChanged(Viewer, Object, Object)
		 */
		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}
	}
}
