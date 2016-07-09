/**
 */
package bpmn;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graphcial Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.GraphcialObject#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link bpmn.GraphcialObject#getLabel <em>Label</em>}</li>
 *   <li>{@link bpmn.GraphcialObject#getBusinessconceptsParent <em>Businessconcepts Parent</em>}</li>
 *   <li>{@link bpmn.GraphcialObject#getType <em>Type</em>}</li>
 *   <li>{@link bpmn.GraphcialObject#getName <em>Name</em>}</li>
 *   <li>{@link bpmn.GraphcialObject#getLocalBusinessConcept <em>Local Business Concept</em>}</li>
 *   <li>{@link bpmn.GraphcialObject#getContribTypeToParents <em>Contrib Type To Parents</em>}</li>
 * </ul>
 *
 * @see bpmn.BpmnPackage#getGraphcialObject()
 * @model abstract="true"
 * @generated
 */
public interface GraphcialObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Artifact</b></em>' reference list.
	 * The list contents are of type {@link bpmn.Artifact}.
	 * It is bidirectional and its opposite is '{@link bpmn.Artifact#getContribTypeToParent <em>Contrib Type To Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact</em>' reference list.
	 * @see bpmn.BpmnPackage#getGraphcialObject_Artifact()
	 * @see bpmn.Artifact#getContribTypeToParent
	 * @model opposite="contribTypeToParent"
	 * @generated
	 */
	EList<Artifact> getArtifact();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * The literals are from the enumeration {@link bpmn.SatisficingLabelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see bpmn.SatisficingLabelType
	 * @see #setLabel(SatisficingLabelType)
	 * @see bpmn.BpmnPackage#getGraphcialObject_Label()
	 * @model
	 * @generated
	 */
	SatisficingLabelType getLabel();

	/**
	 * Sets the value of the '{@link bpmn.GraphcialObject#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see bpmn.SatisficingLabelType
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(SatisficingLabelType value);

	/**
	 * Returns the value of the '<em><b>Businessconcepts Parent</b></em>' reference list.
	 * The list contents are of type {@link bpmn.BusinessConcepts}.
	 * It is bidirectional and its opposite is '{@link bpmn.BusinessConcepts#getTopicChild <em>Topic Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Businessconcepts Parent</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Businessconcepts Parent</em>' reference list.
	 * @see bpmn.BpmnPackage#getGraphcialObject_BusinessconceptsParent()
	 * @see bpmn.BusinessConcepts#getTopicChild
	 * @model opposite="topicChild"
	 * @generated
	 */
	EList<BusinessConcepts> getBusinessconceptsParent();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference list.
	 * The list contents are of type {@link bpmn.BusinessConcepts}.
	 * It is bidirectional and its opposite is '{@link bpmn.BusinessConcepts#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference list.
	 * @see bpmn.BpmnPackage#getGraphcialObject_Type()
	 * @see bpmn.BusinessConcepts#getTopic
	 * @model opposite="topic"
	 * @generated
	 */
	EList<BusinessConcepts> getType();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see bpmn.BpmnPackage#getGraphcialObject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bpmn.GraphcialObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Local Business Concept</b></em>' containment reference list.
	 * The list contents are of type {@link bpmn.BusinessConcepts}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Business Concept</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Business Concept</em>' containment reference list.
	 * @see bpmn.BpmnPackage#getGraphcialObject_LocalBusinessConcept()
	 * @model containment="true"
	 * @generated
	 */
	EList<BusinessConcepts> getLocalBusinessConcept();

	/**
	 * Returns the value of the '<em><b>Contrib Type To Parents</b></em>' containment reference list.
	 * The list contents are of type {@link bpmn.Contribution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contrib Type To Parents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contrib Type To Parents</em>' containment reference list.
	 * @see bpmn.BpmnPackage#getGraphcialObject_ContribTypeToParents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Contribution> getContribTypeToParents();

} // GraphcialObject
