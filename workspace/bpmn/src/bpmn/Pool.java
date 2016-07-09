/**
 */
package bpmn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.Pool#getContainLane <em>Contain Lane</em>}</li>
 * </ul>
 *
 * @see bpmn.BpmnPackage#getPool()
 * @model
 * @generated
 */
public interface Pool extends Swimlane {
	/**
	 * Returns the value of the '<em><b>Contain Lane</b></em>' containment reference list.
	 * The list contents are of type {@link bpmn.Lane}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contain Lane</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contain Lane</em>' containment reference list.
	 * @see bpmn.BpmnPackage#getPool_ContainLane()
	 * @model containment="true"
	 * @generated
	 */
	EList<Lane> getContainLane();

} // Pool
