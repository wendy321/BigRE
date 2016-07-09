/**
 */
package bpmn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intermediate End Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.IntermediateEndEvent#getIsInterrupt <em>Is Interrupt</em>}</li>
 * </ul>
 *
 * @see bpmn.BpmnPackage#getIntermediateEndEvent()
 * @model
 * @generated
 */
public interface IntermediateEndEvent extends ThrowEvent {
	/**
	 * Returns the value of the '<em><b>Is Interrupt</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Interrupt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Interrupt</em>' attribute.
	 * @see #setIsInterrupt(Boolean)
	 * @see bpmn.BpmnPackage#getIntermediateEndEvent_IsInterrupt()
	 * @model default="true"
	 * @generated
	 */
	Boolean getIsInterrupt();

	/**
	 * Sets the value of the '{@link bpmn.IntermediateEndEvent#getIsInterrupt <em>Is Interrupt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Interrupt</em>' attribute.
	 * @see #getIsInterrupt()
	 * @generated
	 */
	void setIsInterrupt(Boolean value);

} // IntermediateEndEvent
