/**
 */
package bpmn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.StartEvent#getIsInterrupt <em>Is Interrupt</em>}</li>
 * </ul>
 *
 * @see bpmn.BpmnPackage#getStartEvent()
 * @model
 * @generated
 */
public interface StartEvent extends CatchEvent {

	/**
	 * Returns the value of the '<em><b>Is Interrupt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Interrupt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Interrupt</em>' attribute.
	 * @see #setIsInterrupt(Boolean)
	 * @see bpmn.BpmnPackage#getStartEvent_IsInterrupt()
	 * @model
	 * @generated
	 */
	Boolean getIsInterrupt();

	/**
	 * Sets the value of the '{@link bpmn.StartEvent#getIsInterrupt <em>Is Interrupt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Interrupt</em>' attribute.
	 * @see #getIsInterrupt()
	 * @generated
	 */
	void setIsInterrupt(Boolean value);
} // StartEvent
