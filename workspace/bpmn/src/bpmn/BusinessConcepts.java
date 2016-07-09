/**
 */
package bpmn;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Concepts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.BusinessConcepts#getName <em>Name</em>}</li>
 *   <li>{@link bpmn.BusinessConcepts#getParent <em>Parent</em>}</li>
 *   <li>{@link bpmn.BusinessConcepts#getChild <em>Child</em>}</li>
 *   <li>{@link bpmn.BusinessConcepts#getContribTypeToParents <em>Contrib Type To Parents</em>}</li>
 *   <li>{@link bpmn.BusinessConcepts#getTopicChild <em>Topic Child</em>}</li>
 *   <li>{@link bpmn.BusinessConcepts#getTopic <em>Topic</em>}</li>
 * </ul>
 *
 * @see bpmn.BpmnPackage#getBusinessConcepts()
 * @model abstract="true"
 * @generated
 */
public interface BusinessConcepts extends EObject {

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
	 * @see bpmn.BpmnPackage#getBusinessConcepts_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bpmn.BusinessConcepts#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference list.
	 * The list contents are of type {@link bpmn.BusinessConcepts}.
	 * It is bidirectional and its opposite is '{@link bpmn.BusinessConcepts#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference list.
	 * @see bpmn.BpmnPackage#getBusinessConcepts_Parent()
	 * @see bpmn.BusinessConcepts#getChild
	 * @model opposite="child"
	 * @generated
	 */
	EList<BusinessConcepts> getParent();

	/**
	 * Returns the value of the '<em><b>Child</b></em>' reference list.
	 * The list contents are of type {@link bpmn.BusinessConcepts}.
	 * It is bidirectional and its opposite is '{@link bpmn.BusinessConcepts#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' reference list.
	 * @see bpmn.BpmnPackage#getBusinessConcepts_Child()
	 * @see bpmn.BusinessConcepts#getParent
	 * @model opposite="parent"
	 * @generated
	 */
	EList<BusinessConcepts> getChild();

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
	 * @see bpmn.BpmnPackage#getBusinessConcepts_ContribTypeToParents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Contribution> getContribTypeToParents();

	/**
	 * Returns the value of the '<em><b>Topic Child</b></em>' reference list.
	 * The list contents are of type {@link bpmn.GraphcialObject}.
	 * It is bidirectional and its opposite is '{@link bpmn.GraphcialObject#getBusinessconceptsParent <em>Businessconcepts Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topic Child</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic Child</em>' reference list.
	 * @see bpmn.BpmnPackage#getBusinessConcepts_TopicChild()
	 * @see bpmn.GraphcialObject#getBusinessconceptsParent
	 * @model opposite="businessconceptsParent"
	 * @generated
	 */
	EList<GraphcialObject> getTopicChild();

	/**
	 * Returns the value of the '<em><b>Topic</b></em>' reference list.
	 * The list contents are of type {@link bpmn.GraphcialObject}.
	 * It is bidirectional and its opposite is '{@link bpmn.GraphcialObject#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topic</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic</em>' reference list.
	 * @see bpmn.BpmnPackage#getBusinessConcepts_Topic()
	 * @see bpmn.GraphcialObject#getType
	 * @model opposite="type"
	 * @generated
	 */
	EList<GraphcialObject> getTopic();
} // BusinessConcepts
