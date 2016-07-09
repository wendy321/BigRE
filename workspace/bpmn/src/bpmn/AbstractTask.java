/**
 */
package bpmn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.AbstractTask#getTaskBoundaryEventRefs <em>Task Boundary Event Refs</em>}</li>
 * </ul>
 *
 * @see bpmn.BpmnPackage#getAbstractTask()
 * @model abstract="true"
 * @generated
 */
public interface AbstractTask extends Activity {

	/**
	 * Returns the value of the '<em><b>Task Boundary Event Refs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Boundary Event Refs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Boundary Event Refs</em>' containment reference.
	 * @see #setTaskBoundaryEventRefs(BoundaryEvent)
	 * @see bpmn.BpmnPackage#getAbstractTask_TaskBoundaryEventRefs()
	 * @model containment="true"
	 * @generated
	 */
	BoundaryEvent getTaskBoundaryEventRefs();

	/**
	 * Sets the value of the '{@link bpmn.AbstractTask#getTaskBoundaryEventRefs <em>Task Boundary Event Refs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Boundary Event Refs</em>' containment reference.
	 * @see #getTaskBoundaryEventRefs()
	 * @generated
	 */
	void setTaskBoundaryEventRefs(BoundaryEvent value);
} // AbstractTask
