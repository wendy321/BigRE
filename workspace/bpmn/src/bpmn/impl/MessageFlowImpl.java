/**
 */
package bpmn.impl;

import bpmn.BpmnPackage;
import bpmn.MessageFlow;
import bpmn.Pool;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bpmn.impl.MessageFlowImpl#getMessageFlowObject <em>Message Flow Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageFlowImpl extends ConnectingObjectImpl implements MessageFlow {
	/**
	 * The cached value of the '{@link #getMessageFlowObject() <em>Message Flow Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageFlowObject()
	 * @generated
	 * @ordered
	 */
	protected Pool messageFlowObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnPackage.Literals.MESSAGE_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pool getMessageFlowObject() {
		if (messageFlowObject != null && messageFlowObject.eIsProxy()) {
			InternalEObject oldMessageFlowObject = (InternalEObject)messageFlowObject;
			messageFlowObject = (Pool)eResolveProxy(oldMessageFlowObject);
			if (messageFlowObject != oldMessageFlowObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnPackage.MESSAGE_FLOW__MESSAGE_FLOW_OBJECT, oldMessageFlowObject, messageFlowObject));
			}
		}
		return messageFlowObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pool basicGetMessageFlowObject() {
		return messageFlowObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageFlowObject(Pool newMessageFlowObject) {
		Pool oldMessageFlowObject = messageFlowObject;
		messageFlowObject = newMessageFlowObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.MESSAGE_FLOW__MESSAGE_FLOW_OBJECT, oldMessageFlowObject, messageFlowObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BpmnPackage.MESSAGE_FLOW__MESSAGE_FLOW_OBJECT:
				if (resolve) return getMessageFlowObject();
				return basicGetMessageFlowObject();
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
			case BpmnPackage.MESSAGE_FLOW__MESSAGE_FLOW_OBJECT:
				setMessageFlowObject((Pool)newValue);
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
			case BpmnPackage.MESSAGE_FLOW__MESSAGE_FLOW_OBJECT:
				setMessageFlowObject((Pool)null);
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
			case BpmnPackage.MESSAGE_FLOW__MESSAGE_FLOW_OBJECT:
				return messageFlowObject != null;
		}
		return super.eIsSet(featureID);
	}

} //MessageFlowImpl
