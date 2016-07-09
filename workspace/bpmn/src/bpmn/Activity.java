/**
 */
package bpmn;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.Activity#getBoundaryEventRefs <em>Boundary Event Refs</em>}</li>
 * </ul>
 *
 * @see bpmn.BpmnPackage#getActivity()
 * @model abstract="true"
 * @generated
 */
public interface Activity extends FlowObject {

	/**
	 * Returns the value of the '<em><b>Boundary Event Refs</b></em>' reference list.
	 * The list contents are of type {@link bpmn.BoundaryEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boundary Event Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boundary Event Refs</em>' reference list.
	 * @see bpmn.BpmnPackage#getActivity_BoundaryEventRefs()
	 * @model
	 * @generated
	 */
	EList<BoundaryEvent> getBoundaryEventRefs();
} // Activity
