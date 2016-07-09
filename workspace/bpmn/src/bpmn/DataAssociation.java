/**
 */
package bpmn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.DataAssociation#getDataAssociateObject <em>Data Associate Object</em>}</li>
 * </ul>
 *
 * @see bpmn.BpmnPackage#getDataAssociation()
 * @model
 * @generated
 */
public interface DataAssociation extends ConnectingObject {
	/**
	 * Returns the value of the '<em><b>Data Associate Object</b></em>' reference list.
	 * The list contents are of type {@link bpmn.DataObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Associate Object</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Associate Object</em>' reference list.
	 * @see bpmn.BpmnPackage#getDataAssociation_DataAssociateObject()
	 * @model required="true"
	 * @generated
	 */
	EList<DataObject> getDataAssociateObject();

} // DataAssociation
