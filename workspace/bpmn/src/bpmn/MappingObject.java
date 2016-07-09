/**
 */
package bpmn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.MappingObject#getBoundary <em>Boundary</em>}</li>
 *   <li>{@link bpmn.MappingObject#getActivation <em>Activation</em>}</li>
 *   <li>{@link bpmn.MappingObject#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link bpmn.MappingObject#getRelatedObjects <em>Related Objects</em>}</li>
 * </ul>
 *
 * @see bpmn.BpmnPackage#getMappingObject()
 * @model abstract="true"
 * @generated
 */
public interface MappingObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Boundary</b></em>' attribute.
	 * The default value is <code>"Undecided"</code>.
	 * The literals are from the enumeration {@link bpmn.SystemBoundaryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boundary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boundary</em>' attribute.
	 * @see bpmn.SystemBoundaryType
	 * @see #setBoundary(SystemBoundaryType)
	 * @see bpmn.BpmnPackage#getMappingObject_Boundary()
	 * @model default="Undecided"
	 * @generated
	 */
	SystemBoundaryType getBoundary();

	/**
	 * Sets the value of the '{@link bpmn.MappingObject#getBoundary <em>Boundary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boundary</em>' attribute.
	 * @see bpmn.SystemBoundaryType
	 * @see #getBoundary()
	 * @generated
	 */
	void setBoundary(SystemBoundaryType value);

	/**
	 * Returns the value of the '<em><b>Activation</b></em>' attribute.
	 * The default value is <code>"Undecided"</code>.
	 * The literals are from the enumeration {@link bpmn.ActivationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation</em>' attribute.
	 * @see bpmn.ActivationType
	 * @see #setActivation(ActivationType)
	 * @see bpmn.BpmnPackage#getMappingObject_Activation()
	 * @model default="Undecided"
	 * @generated
	 */
	ActivationType getActivation();

	/**
	 * Sets the value of the '{@link bpmn.MappingObject#getActivation <em>Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation</em>' attribute.
	 * @see bpmn.ActivationType
	 * @see #getActivation()
	 * @generated
	 */
	void setActivation(ActivationType value);

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' attribute.
	 * The default value is <code>"Undecided"</code>.
	 * The literals are from the enumeration {@link bpmn.RelationshipType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship</em>' attribute.
	 * @see bpmn.RelationshipType
	 * @see #setRelationship(RelationshipType)
	 * @see bpmn.BpmnPackage#getMappingObject_Relationship()
	 * @model default="Undecided"
	 * @generated
	 */
	RelationshipType getRelationship();

	/**
	 * Sets the value of the '{@link bpmn.MappingObject#getRelationship <em>Relationship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' attribute.
	 * @see bpmn.RelationshipType
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(RelationshipType value);

	/**
	 * Returns the value of the '<em><b>Related Objects</b></em>' reference list.
	 * The list contents are of type {@link bpmn.MappingObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Objects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Objects</em>' reference list.
	 * @see bpmn.BpmnPackage#getMappingObject_RelatedObjects()
	 * @model
	 * @generated
	 */
	EList<MappingObject> getRelatedObjects();

} // MappingObject
