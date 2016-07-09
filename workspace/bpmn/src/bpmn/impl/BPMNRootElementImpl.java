/**
 */
package bpmn.impl;

import bpmn.BPMNRootElement;
import bpmn.BpmnPackage;
import bpmn.BusinessConcepts;
import bpmn.GraphcialObject;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BPMN Root Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bpmn.impl.BPMNRootElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link bpmn.impl.BPMNRootElementImpl#getBPMNReference <em>BPMN Reference</em>}</li>
 *   <li>{@link bpmn.impl.BPMNRootElementImpl#getBusinessConceptEReference <em>Business Concept EReference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BPMNRootElementImpl extends MinimalEObjectImpl.Container implements BPMNRootElement {
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
	 * The cached value of the '{@link #getBPMNReference() <em>BPMN Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPMNReference()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphcialObject> bpmnReference;

	/**
	 * The cached value of the '{@link #getBusinessConceptEReference() <em>Business Concept EReference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessConceptEReference()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessConcepts> businessConceptEReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPMNRootElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnPackage.Literals.BPMN_ROOT_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.BPMN_ROOT_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GraphcialObject> getBPMNReference() {
		if (bpmnReference == null) {
			bpmnReference = new EObjectContainmentEList<GraphcialObject>(GraphcialObject.class, this, BpmnPackage.BPMN_ROOT_ELEMENT__BPMN_REFERENCE);
		}
		return bpmnReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessConcepts> getBusinessConceptEReference() {
		if (businessConceptEReference == null) {
			businessConceptEReference = new EObjectContainmentEList<BusinessConcepts>(BusinessConcepts.class, this, BpmnPackage.BPMN_ROOT_ELEMENT__BUSINESS_CONCEPT_EREFERENCE);
		}
		return businessConceptEReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BpmnPackage.BPMN_ROOT_ELEMENT__BPMN_REFERENCE:
				return ((InternalEList<?>)getBPMNReference()).basicRemove(otherEnd, msgs);
			case BpmnPackage.BPMN_ROOT_ELEMENT__BUSINESS_CONCEPT_EREFERENCE:
				return ((InternalEList<?>)getBusinessConceptEReference()).basicRemove(otherEnd, msgs);
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
			case BpmnPackage.BPMN_ROOT_ELEMENT__NAME:
				return getName();
			case BpmnPackage.BPMN_ROOT_ELEMENT__BPMN_REFERENCE:
				return getBPMNReference();
			case BpmnPackage.BPMN_ROOT_ELEMENT__BUSINESS_CONCEPT_EREFERENCE:
				return getBusinessConceptEReference();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BpmnPackage.BPMN_ROOT_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case BpmnPackage.BPMN_ROOT_ELEMENT__BPMN_REFERENCE:
				getBPMNReference().clear();
				getBPMNReference().addAll((Collection<? extends GraphcialObject>)newValue);
				return;
			case BpmnPackage.BPMN_ROOT_ELEMENT__BUSINESS_CONCEPT_EREFERENCE:
				getBusinessConceptEReference().clear();
				getBusinessConceptEReference().addAll((Collection<? extends BusinessConcepts>)newValue);
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
			case BpmnPackage.BPMN_ROOT_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BpmnPackage.BPMN_ROOT_ELEMENT__BPMN_REFERENCE:
				getBPMNReference().clear();
				return;
			case BpmnPackage.BPMN_ROOT_ELEMENT__BUSINESS_CONCEPT_EREFERENCE:
				getBusinessConceptEReference().clear();
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
			case BpmnPackage.BPMN_ROOT_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BpmnPackage.BPMN_ROOT_ELEMENT__BPMN_REFERENCE:
				return bpmnReference != null && !bpmnReference.isEmpty();
			case BpmnPackage.BPMN_ROOT_ELEMENT__BUSINESS_CONCEPT_EREFERENCE:
				return businessConceptEReference != null && !businessConceptEReference.isEmpty();
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

} //BPMNRootElementImpl
