/**
 */
package bpmn.impl;

import bpmn.BpmnPackage;
import bpmn.IntermediateCatchEvent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intermediate Catch Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bpmn.impl.IntermediateCatchEventImpl#getIsInterrupt <em>Is Interrupt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntermediateCatchEventImpl extends CatchEventImpl implements IntermediateCatchEvent {
	/**
	 * The default value of the '{@link #getIsInterrupt() <em>Is Interrupt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsInterrupt()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_INTERRUPT_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getIsInterrupt() <em>Is Interrupt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsInterrupt()
	 * @generated
	 * @ordered
	 */
	protected Boolean isInterrupt = IS_INTERRUPT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntermediateCatchEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnPackage.Literals.INTERMEDIATE_CATCH_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsInterrupt() {
		return isInterrupt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInterrupt(Boolean newIsInterrupt) {
		Boolean oldIsInterrupt = isInterrupt;
		isInterrupt = newIsInterrupt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.INTERMEDIATE_CATCH_EVENT__IS_INTERRUPT, oldIsInterrupt, isInterrupt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BpmnPackage.INTERMEDIATE_CATCH_EVENT__IS_INTERRUPT:
				return getIsInterrupt();
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
			case BpmnPackage.INTERMEDIATE_CATCH_EVENT__IS_INTERRUPT:
				setIsInterrupt((Boolean)newValue);
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
			case BpmnPackage.INTERMEDIATE_CATCH_EVENT__IS_INTERRUPT:
				setIsInterrupt(IS_INTERRUPT_EDEFAULT);
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
			case BpmnPackage.INTERMEDIATE_CATCH_EVENT__IS_INTERRUPT:
				return IS_INTERRUPT_EDEFAULT == null ? isInterrupt != null : !IS_INTERRUPT_EDEFAULT.equals(isInterrupt);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isInterrupt: ");
		result.append(isInterrupt);
		result.append(')');
		return result.toString();
	}

} //IntermediateCatchEventImpl
