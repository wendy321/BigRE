/**
 */
package bpmn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.MessageFlow#getMessageFlowObject <em>Message Flow Object</em>}</li>
 * </ul>
 *
 * @see bpmn.BpmnPackage#getMessageFlow()
 * @model
 * @generated
 */
public interface MessageFlow extends ConnectingObject {
	/**
	 * Returns the value of the '<em><b>Message Flow Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Flow Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Flow Object</em>' reference.
	 * @see #setMessageFlowObject(Pool)
	 * @see bpmn.BpmnPackage#getMessageFlow_MessageFlowObject()
	 * @model required="true"
	 * @generated
	 */
	Pool getMessageFlowObject();

	/**
	 * Sets the value of the '{@link bpmn.MessageFlow#getMessageFlowObject <em>Message Flow Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Flow Object</em>' reference.
	 * @see #getMessageFlowObject()
	 * @generated
	 */
	void setMessageFlowObject(Pool value);

} // MessageFlow
