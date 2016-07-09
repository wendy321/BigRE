/**
 */
package bpmn.impl;

import bpmn.BpmnPackage;
import bpmn.ConnectingObject;
import bpmn.FlowObject;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bpmn.impl.FlowObjectImpl#getSequenceFlows <em>Sequence Flows</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FlowObjectImpl extends GraphcialObjectImpl implements FlowObject {
	/**
	 * The cached value of the '{@link #getSequenceFlows() <em>Sequence Flows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectingObject> sequenceFlows;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnPackage.Literals.FLOW_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectingObject> getSequenceFlows() {
		if (sequenceFlows == null) {
			sequenceFlows = new EObjectContainmentEList<ConnectingObject>(ConnectingObject.class, this, BpmnPackage.FLOW_OBJECT__SEQUENCE_FLOWS);
		}
		return sequenceFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BpmnPackage.FLOW_OBJECT__SEQUENCE_FLOWS:
				return ((InternalEList<?>)getSequenceFlows()).basicRemove(otherEnd, msgs);
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
			case BpmnPackage.FLOW_OBJECT__SEQUENCE_FLOWS:
				return getSequenceFlows();
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
			case BpmnPackage.FLOW_OBJECT__SEQUENCE_FLOWS:
				getSequenceFlows().clear();
				getSequenceFlows().addAll((Collection<? extends ConnectingObject>)newValue);
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
			case BpmnPackage.FLOW_OBJECT__SEQUENCE_FLOWS:
				getSequenceFlows().clear();
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
			case BpmnPackage.FLOW_OBJECT__SEQUENCE_FLOWS:
				return sequenceFlows != null && !sequenceFlows.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FlowObjectImpl
