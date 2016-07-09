/**
 */
package bpmn;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.SubProcess#getChildren <em>Children</em>}</li>
 *   <li>{@link bpmn.SubProcess#getIsCollapsed <em>Is Collapsed</em>}</li>
 * </ul>
 *
 * @see bpmn.BpmnPackage#getSubProcess()
 * @model
 * @generated
 */
public interface SubProcess extends Activity {

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link bpmn.GraphcialObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see bpmn.BpmnPackage#getSubProcess_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<GraphcialObject> getChildren();

	/**
	 * Returns the value of the '<em><b>Is Collapsed</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Collapsed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Collapsed</em>' attribute.
	 * @see #setIsCollapsed(Boolean)
	 * @see bpmn.BpmnPackage#getSubProcess_IsCollapsed()
	 * @model default="true"
	 * @generated
	 */
	Boolean getIsCollapsed();

	/**
	 * Sets the value of the '{@link bpmn.SubProcess#getIsCollapsed <em>Is Collapsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Collapsed</em>' attribute.
	 * @see #getIsCollapsed()
	 * @generated
	 */
	void setIsCollapsed(Boolean value);
} // SubProcess
