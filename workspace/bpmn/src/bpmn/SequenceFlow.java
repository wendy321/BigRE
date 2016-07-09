/**
 */
package bpmn;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.SequenceFlow#getTargetFlowObject <em>Target Flow Object</em>}</li>
 * </ul>
 *
 * @see bpmn.BpmnPackage#getSequenceFlow()
 * @model
 * @generated
 */
public interface SequenceFlow extends ConnectingObject {

	/**
	 * Returns the value of the '<em><b>Target Flow Object</b></em>' reference list.
	 * The list contents are of type {@link bpmn.FlowObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Flow Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Flow Object</em>' reference list.
	 * @see bpmn.BpmnPackage#getSequenceFlow_TargetFlowObject()
	 * @model required="true"
	 * @generated
	 */
	EList<FlowObject> getTargetFlowObject();

} // SequenceFlow
