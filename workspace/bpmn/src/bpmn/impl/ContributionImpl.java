/**
 */
package bpmn.impl;

import bpmn.BpmnPackage;
import bpmn.BusinessConcepts;
import bpmn.Contribution;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bpmn.impl.ContributionImpl#getName <em>Name</em>}</li>
 *   <li>{@link bpmn.impl.ContributionImpl#getTargetBusinessConcept <em>Target Business Concept</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ContributionImpl extends MinimalEObjectImpl.Container implements Contribution {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTargetBusinessConcept() <em>Target Business Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetBusinessConcept()
	 * @generated
	 * @ordered
	 */
	protected BusinessConcepts targetBusinessConcept;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContributionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnPackage.Literals.CONTRIBUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.CONTRIBUTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessConcepts getTargetBusinessConcept() {
		if (targetBusinessConcept != null && targetBusinessConcept.eIsProxy()) {
			InternalEObject oldTargetBusinessConcept = (InternalEObject)targetBusinessConcept;
			targetBusinessConcept = (BusinessConcepts)eResolveProxy(oldTargetBusinessConcept);
			if (targetBusinessConcept != oldTargetBusinessConcept) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnPackage.CONTRIBUTION__TARGET_BUSINESS_CONCEPT, oldTargetBusinessConcept, targetBusinessConcept));
			}
		}
		return targetBusinessConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessConcepts basicGetTargetBusinessConcept() {
		return targetBusinessConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetBusinessConcept(BusinessConcepts newTargetBusinessConcept) {
		BusinessConcepts oldTargetBusinessConcept = targetBusinessConcept;
		targetBusinessConcept = newTargetBusinessConcept;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.CONTRIBUTION__TARGET_BUSINESS_CONCEPT, oldTargetBusinessConcept, targetBusinessConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BpmnPackage.CONTRIBUTION__NAME:
				return getName();
			case BpmnPackage.CONTRIBUTION__TARGET_BUSINESS_CONCEPT:
				if (resolve) return getTargetBusinessConcept();
				return basicGetTargetBusinessConcept();
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
			case BpmnPackage.CONTRIBUTION__NAME:
				setName((String)newValue);
				return;
			case BpmnPackage.CONTRIBUTION__TARGET_BUSINESS_CONCEPT:
				setTargetBusinessConcept((BusinessConcepts)newValue);
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
			case BpmnPackage.CONTRIBUTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BpmnPackage.CONTRIBUTION__TARGET_BUSINESS_CONCEPT:
				setTargetBusinessConcept((BusinessConcepts)null);
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
			case BpmnPackage.CONTRIBUTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BpmnPackage.CONTRIBUTION__TARGET_BUSINESS_CONCEPT:
				return targetBusinessConcept != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ContributionImpl
