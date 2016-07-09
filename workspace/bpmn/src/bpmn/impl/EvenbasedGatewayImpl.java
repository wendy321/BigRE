/**
 */
package bpmn.impl;

import bpmn.BpmnPackage;
import bpmn.EvenbasedGateway;
import bpmn.eventBasedGatewayType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evenbased Gateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bpmn.impl.EvenbasedGatewayImpl#getEventGatewayType <em>Event Gateway Type</em>}</li>
 *   <li>{@link bpmn.impl.EvenbasedGatewayImpl#isIsInstanciate <em>Is Instanciate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvenbasedGatewayImpl extends GatewayImpl implements EvenbasedGateway {
	/**
	 * The default value of the '{@link #getEventGatewayType() <em>Event Gateway Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventGatewayType()
	 * @generated
	 * @ordered
	 */
	protected static final eventBasedGatewayType EVENT_GATEWAY_TYPE_EDEFAULT = eventBasedGatewayType.EXCLUSIVE;

	/**
	 * The cached value of the '{@link #getEventGatewayType() <em>Event Gateway Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventGatewayType()
	 * @generated
	 * @ordered
	 */
	protected eventBasedGatewayType eventGatewayType = EVENT_GATEWAY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsInstanciate() <em>Is Instanciate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInstanciate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INSTANCIATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsInstanciate() <em>Is Instanciate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInstanciate()
	 * @generated
	 * @ordered
	 */
	protected boolean isInstanciate = IS_INSTANCIATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvenbasedGatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnPackage.Literals.EVENBASED_GATEWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public eventBasedGatewayType getEventGatewayType() {
		return eventGatewayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventGatewayType(eventBasedGatewayType newEventGatewayType) {
		eventBasedGatewayType oldEventGatewayType = eventGatewayType;
		eventGatewayType = newEventGatewayType == null ? EVENT_GATEWAY_TYPE_EDEFAULT : newEventGatewayType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.EVENBASED_GATEWAY__EVENT_GATEWAY_TYPE, oldEventGatewayType, eventGatewayType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsInstanciate() {
		return isInstanciate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInstanciate(boolean newIsInstanciate) {
		boolean oldIsInstanciate = isInstanciate;
		isInstanciate = newIsInstanciate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.EVENBASED_GATEWAY__IS_INSTANCIATE, oldIsInstanciate, isInstanciate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BpmnPackage.EVENBASED_GATEWAY__EVENT_GATEWAY_TYPE:
				return getEventGatewayType();
			case BpmnPackage.EVENBASED_GATEWAY__IS_INSTANCIATE:
				return isIsInstanciate();
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
			case BpmnPackage.EVENBASED_GATEWAY__EVENT_GATEWAY_TYPE:
				setEventGatewayType((eventBasedGatewayType)newValue);
				return;
			case BpmnPackage.EVENBASED_GATEWAY__IS_INSTANCIATE:
				setIsInstanciate((Boolean)newValue);
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
			case BpmnPackage.EVENBASED_GATEWAY__EVENT_GATEWAY_TYPE:
				setEventGatewayType(EVENT_GATEWAY_TYPE_EDEFAULT);
				return;
			case BpmnPackage.EVENBASED_GATEWAY__IS_INSTANCIATE:
				setIsInstanciate(IS_INSTANCIATE_EDEFAULT);
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
			case BpmnPackage.EVENBASED_GATEWAY__EVENT_GATEWAY_TYPE:
				return eventGatewayType != EVENT_GATEWAY_TYPE_EDEFAULT;
			case BpmnPackage.EVENBASED_GATEWAY__IS_INSTANCIATE:
				return isInstanciate != IS_INSTANCIATE_EDEFAULT;
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
		result.append(" (eventGatewayType: ");
		result.append(eventGatewayType);
		result.append(", isInstanciate: ");
		result.append(isInstanciate);
		result.append(')');
		return result.toString();
	}

} //EvenbasedGatewayImpl
