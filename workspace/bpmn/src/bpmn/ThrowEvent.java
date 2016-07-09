/**
 */
package bpmn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Throw Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.ThrowEvent#getThrowEventDefinition <em>Throw Event Definition</em>}</li>
 *   <li>{@link bpmn.ThrowEvent#getThrowEventDefinitionRef <em>Throw Event Definition Ref</em>}</li>
 * </ul>
 *
 * @see bpmn.BpmnPackage#getThrowEvent()
 * @model abstract="true"
 * @generated
 */
public interface ThrowEvent extends Event {
	/**
	 * Returns the value of the '<em><b>Throw Event Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throw Event Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throw Event Definition</em>' containment reference.
	 * @see #setThrowEventDefinition(EventDefinition)
	 * @see bpmn.BpmnPackage#getThrowEvent_ThrowEventDefinition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EventDefinition getThrowEventDefinition();

	/**
	 * Sets the value of the '{@link bpmn.ThrowEvent#getThrowEventDefinition <em>Throw Event Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throw Event Definition</em>' containment reference.
	 * @see #getThrowEventDefinition()
	 * @generated
	 */
	void setThrowEventDefinition(EventDefinition value);

	/**
	 * Returns the value of the '<em><b>Throw Event Definition Ref</b></em>' reference list.
	 * The list contents are of type {@link bpmn.EventDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throw Event Definition Ref</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throw Event Definition Ref</em>' reference list.
	 * @see bpmn.BpmnPackage#getThrowEvent_ThrowEventDefinitionRef()
	 * @model required="true"
	 * @generated
	 */
	EList<EventDefinition> getThrowEventDefinitionRef();

} // ThrowEvent
