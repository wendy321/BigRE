/**
 */
package bpmn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.FlowObject#getSequenceFlows <em>Sequence Flows</em>}</li>
 * </ul>
 *
 * @see bpmn.BpmnPackage#getFlowObject()
 * @model abstract="true"
 * @generated
 */
public interface FlowObject extends GraphcialObject {
	/**
	 * Returns the value of the '<em><b>Sequence Flows</b></em>' containment reference list.
	 * The list contents are of type {@link bpmn.ConnectingObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Flows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Flows</em>' containment reference list.
	 * @see bpmn.BpmnPackage#getFlowObject_SequenceFlows()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConnectingObject> getSequenceFlows();

} // FlowObject
