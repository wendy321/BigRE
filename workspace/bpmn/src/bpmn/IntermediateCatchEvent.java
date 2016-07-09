/**
 */
package bpmn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intermediate Catch Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.IntermediateCatchEvent#getIsInterrupt <em>Is Interrupt</em>}</li>
 * </ul>
 *
 * @see bpmn.BpmnPackage#getIntermediateCatchEvent()
 * @model
 * @generated
 */
public interface IntermediateCatchEvent extends CatchEvent {
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
	 * @see bpmn.BpmnPackage#getIntermediateCatchEvent_IsInterrupt()
	 * @model default="true"
	 * @generated
	 */
	Boolean getIsInterrupt();

	/**
	 * Sets the value of the '{@link bpmn.IntermediateCatchEvent#getIsInterrupt <em>Is Interrupt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Interrupt</em>' attribute.
	 * @see #getIsInterrupt()
	 * @generated
	 */
	void setIsInterrupt(Boolean value);

} // IntermediateCatchEvent
