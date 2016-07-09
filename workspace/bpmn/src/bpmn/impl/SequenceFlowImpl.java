/**
 */
package bpmn.impl;

import bpmn.BpmnPackage;
import bpmn.FlowObject;
import bpmn.SequenceFlow;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bpmn.impl.SequenceFlowImpl#getTargetFlowObject <em>Target Flow Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SequenceFlowImpl extends ConnectingObjectImpl implements SequenceFlow {
	/**
	 * The cached value of the '{@link #getTargetFlowObject() <em>Target Flow Object</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFlowObject()
	 * @generated
	 * @ordered
	 */
	protected EList<FlowObject> targetFlowObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnPackage.Literals.SEQUENCE_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FlowObject> getTargetFlowObject() {
		if (targetFlowObject == null) {
			targetFlowObject = new EObjectResolvingEList<FlowObject>(FlowObject.class, this, BpmnPackage.SEQUENCE_FLOW__TARGET_FLOW_OBJECT);
		}
		return targetFlowObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BpmnPackage.SEQUENCE_FLOW__TARGET_FLOW_OBJECT:
				return getTargetFlowObject();
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
			case BpmnPackage.SEQUENCE_FLOW__TARGET_FLOW_OBJECT:
				getTargetFlowObject().clear();
				getTargetFlowObject().addAll((Collection<? extends FlowObject>)newValue);
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
			case BpmnPackage.SEQUENCE_FLOW__TARGET_FLOW_OBJECT:
				getTargetFlowObject().clear();
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
			case BpmnPackage.SEQUENCE_FLOW__TARGET_FLOW_OBJECT:
				return targetFlowObject != null && !targetFlowObject.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SequenceFlowImpl
