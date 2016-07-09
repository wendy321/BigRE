/**
 */
package bpmn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catch Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.CatchEvent#getParallelMultiple <em>Parallel Multiple</em>}</li>
 *   <li>{@link bpmn.CatchEvent#getCatchEventDefinition <em>Catch Event Definition</em>}</li>
 *   <li>{@link bpmn.CatchEvent#getCatchEventDefinitionRef <em>Catch Event Definition Ref</em>}</li>
 * </ul>
 *
 * @see bpmn.BpmnPackage#getCatchEvent()
 * @model abstract="true"
 * @generated
 */
public interface CatchEvent extends Event {
	/**
	 * Returns the value of the '<em><b>Parallel Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parallel Multiple</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parallel Multiple</em>' attribute.
	 * @see #setParallelMultiple(Boolean)
	 * @see bpmn.BpmnPackage#getCatchEvent_ParallelMultiple()
	 * @model
	 * @generated
	 */
	Boolean getParallelMultiple();

	/**
	 * Sets the value of the '{@link bpmn.CatchEvent#getParallelMultiple <em>Parallel Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parallel Multiple</em>' attribute.
	 * @see #getParallelMultiple()
	 * @generated
	 */
	void setParallelMultiple(Boolean value);

	/**
	 * Returns the value of the '<em><b>Catch Event Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catch Event Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catch Event Definition</em>' containment reference.
	 * @see #setCatchEventDefinition(EventDefinition)
	 * @see bpmn.BpmnPackage#getCatchEvent_CatchEventDefinition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EventDefinition getCatchEventDefinition();

	/**
	 * Sets the value of the '{@link bpmn.CatchEvent#getCatchEventDefinition <em>Catch Event Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catch Event Definition</em>' containment reference.
	 * @see #getCatchEventDefinition()
	 * @generated
	 */
	void setCatchEventDefinition(EventDefinition value);

	/**
	 * Returns the value of the '<em><b>Catch Event Definition Ref</b></em>' reference list.
	 * The list contents are of type {@link bpmn.EventDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catch Event Definition Ref</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catch Event Definition Ref</em>' reference list.
	 * @see bpmn.BpmnPackage#getCatchEvent_CatchEventDefinitionRef()
	 * @model required="true"
	 * @generated
	 */
	EList<EventDefinition> getCatchEventDefinitionRef();

} // CatchEvent
