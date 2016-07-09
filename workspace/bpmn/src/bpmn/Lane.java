/**
 */
package bpmn;

import org.eclipse.emf.common.util.EList;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.Lane#getGraphicObj <em>Graphic Obj</em>}</li>
 * </ul>
 *
 * @see bpmn.BpmnPackage#getLane()
 * @model
 * @generated
 */
public interface Lane extends Swimlane {

	/**
	 * Returns the value of the '<em><b>Graphic Obj</b></em>' containment reference list.
	 * The list contents are of type {@link bpmn.GraphcialObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graphic Obj</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graphic Obj</em>' containment reference list.
	 * @see bpmn.BpmnPackage#getLane_GraphicObj()
	 * @model containment="true"
	 * @generated
	 */
	EList<GraphcialObject> getGraphicObj();

} // Lane
