/**
 */
package bpmn.impl;

import bpmn.AbstractTask;
import bpmn.BoundaryEvent;
import bpmn.BpmnPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bpmn.impl.AbstractTaskImpl#getTaskBoundaryEventRefs <em>Task Boundary Event Refs</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractTaskImpl extends ActivityImpl implements AbstractTask {
	/**
	 * The cached value of the '{@link #getTaskBoundaryEventRefs() <em>Task Boundary Event Refs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskBoundaryEventRefs()
	 * @generated
	 * @ordered
	 */
	protected BoundaryEvent taskBoundaryEventRefs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnPackage.Literals.ABSTRACT_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundaryEvent getTaskBoundaryEventRefs() {
		return taskBoundaryEventRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaskBoundaryEventRefs(BoundaryEvent newTaskBoundaryEventRefs, NotificationChain msgs) {
		BoundaryEvent oldTaskBoundaryEventRefs = taskBoundaryEventRefs;
		taskBoundaryEventRefs = newTaskBoundaryEventRefs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BpmnPackage.ABSTRACT_TASK__TASK_BOUNDARY_EVENT_REFS, oldTaskBoundaryEventRefs, newTaskBoundaryEventRefs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskBoundaryEventRefs(BoundaryEvent newTaskBoundaryEventRefs) {
		if (newTaskBoundaryEventRefs != taskBoundaryEventRefs) {
			NotificationChain msgs = null;
			if (taskBoundaryEventRefs != null)
				msgs = ((InternalEObject)taskBoundaryEventRefs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BpmnPackage.ABSTRACT_TASK__TASK_BOUNDARY_EVENT_REFS, null, msgs);
			if (newTaskBoundaryEventRefs != null)
				msgs = ((InternalEObject)newTaskBoundaryEventRefs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BpmnPackage.ABSTRACT_TASK__TASK_BOUNDARY_EVENT_REFS, null, msgs);
			msgs = basicSetTaskBoundaryEventRefs(newTaskBoundaryEventRefs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.ABSTRACT_TASK__TASK_BOUNDARY_EVENT_REFS, newTaskBoundaryEventRefs, newTaskBoundaryEventRefs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BpmnPackage.ABSTRACT_TASK__TASK_BOUNDARY_EVENT_REFS:
				return basicSetTaskBoundaryEventRefs(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BpmnPackage.ABSTRACT_TASK__TASK_BOUNDARY_EVENT_REFS:
				return getTaskBoundaryEventRefs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BpmnPackage.ABSTRACT_TASK__TASK_BOUNDARY_EVENT_REFS:
				setTaskBoundaryEventRefs((BoundaryEvent)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BpmnPackage.ABSTRACT_TASK__TASK_BOUNDARY_EVENT_REFS:
				setTaskBoundaryEventRefs((BoundaryEvent)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BpmnPackage.ABSTRACT_TASK__TASK_BOUNDARY_EVENT_REFS:
				return taskBoundaryEventRefs != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractTaskImpl
