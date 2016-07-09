/**
 */
package bpmn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Phenomenon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmn.Phenomenon#getName <em>Name</em>}</li>
 *   <li>{@link bpmn.Phenomenon#getType <em>Type</em>}</li>
 *   <li>{@link bpmn.Phenomenon#getLabel <em>Label</em>}</li>
 *   <li>{@link bpmn.Phenomenon#getParents <em>Parents</em>}</li>
 *   <li>{@link bpmn.Phenomenon#getChild <em>Child</em>}</li>
 *   <li>{@link bpmn.Phenomenon#getContribTypeToParent <em>Contrib Type To Parent</em>}</li>
 *   <li>{@link bpmn.Phenomenon#getTopic <em>Topic</em>}</li>
 *   <li>{@link bpmn.Phenomenon#getGraphcialobjectChild <em>Graphcialobject Child</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmn.BpmnPackage#getPhenomenon()
 * @model abstract="true"
 * @generated
 */
public interface Phenomenon extends EObject {
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
	 * @see bpmn.BpmnPackage#getPhenomenon_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bpmn.Phenomenon#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see bpmn.BpmnPackage#getPhenomenon_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link bpmn.Phenomenon#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

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
	 * @see bpmn.BpmnPackage#getPhenomenon_Label()
	 * @model
	 * @generated
	 */
	SatisficingLabelType getLabel();

	/**
	 * Sets the value of the '{@link bpmn.Phenomenon#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see bpmn.SatisficingLabelType
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(SatisficingLabelType value);

	/**
	 * Returns the value of the '<em><b>Parents</b></em>' reference list.
	 * The list contents are of type {@link bpmn.Phenomenon}.
	 * It is bidirectional and its opposite is '{@link bpmn.Phenomenon#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parents</em>' reference list.
	 * @see bpmn.BpmnPackage#getPhenomenon_Parents()
	 * @see bpmn.Phenomenon#getChild
	 * @model opposite="child"
	 * @generated
	 */
	EList<Phenomenon> getParents();

	/**
	 * Returns the value of the '<em><b>Child</b></em>' reference list.
	 * The list contents are of type {@link bpmn.Phenomenon}.
	 * It is bidirectional and its opposite is '{@link bpmn.Phenomenon#getParents <em>Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' reference list.
	 * @see bpmn.BpmnPackage#getPhenomenon_Child()
	 * @see bpmn.Phenomenon#getParents
	 * @model opposite="parents"
	 * @generated
	 */
	EList<Phenomenon> getChild();

	/**
	 * Returns the value of the '<em><b>Contrib Type To Parent</b></em>' containment reference list.
	 * The list contents are of type {@link bpmn.Contribution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contrib Type To Parent</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contrib Type To Parent</em>' containment reference list.
	 * @see bpmn.BpmnPackage#getPhenomenon_ContribTypeToParent()
	 * @model containment="true"
	 * @generated
	 */
	EList<Contribution> getContribTypeToParent();

	/**
	 * Returns the value of the '<em><b>Topic</b></em>' reference list.
	 * The list contents are of type {@link bpmn.GraphcialObject}.
	 * It is bidirectional and its opposite is '{@link bpmn.GraphcialObject#getPhenomenon <em>Phenomenon</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topic</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic</em>' reference list.
	 * @see bpmn.BpmnPackage#getPhenomenon_Topic()
	 * @see bpmn.GraphcialObject#getPhenomenon
	 * @model opposite="phenomenon"
	 * @generated
	 */
	EList<GraphcialObject> getTopic();

	/**
	 * Returns the value of the '<em><b>Graphcialobject Child</b></em>' reference list.
	 * The list contents are of type {@link bpmn.GraphcialObject}.
	 * It is bidirectional and its opposite is '{@link bpmn.GraphcialObject#getPhenomenonParent <em>Phenomenon Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graphcialobject Child</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graphcialobject Child</em>' reference list.
	 * @see bpmn.BpmnPackage#getPhenomenon_GraphcialobjectChild()
	 * @see bpmn.GraphcialObject#getPhenomenonParent
	 * @model opposite="phenomenonParent"
	 * @generated
	 */
	EList<GraphcialObject> getGraphcialobjectChild();

} // Phenomenon
