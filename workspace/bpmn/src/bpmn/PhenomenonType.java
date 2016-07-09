/**
 */
package bpmn;

import org.eclipse.emf.common.util.EList;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Phenomenon Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.PhenomenonType#getType <em>Type</em>}</li>
 *   <li>{@link bpmn.PhenomenonType#getLabel <em>Label</em>}</li>
 *   <li>{@link bpmn.PhenomenonType#getBigquery <em>Bigquery</em>}</li>
 *   <li>{@link bpmn.PhenomenonType#getGoal <em>Goal</em>}</li>
 * </ul>
 *
 * @see bpmn.BpmnPackage#getPhenomenonType()
 * @model abstract="true"
 * @generated
 */
public interface PhenomenonType extends BusinessConcepts {
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
	 * @see bpmn.BpmnPackage#getPhenomenonType_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link bpmn.PhenomenonType#getType <em>Type</em>}' attribute.
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
	 * @see bpmn.BpmnPackage#getPhenomenonType_Label()
	 * @model
	 * @generated
	 */
	SatisficingLabelType getLabel();

	/**
	 * Sets the value of the '{@link bpmn.PhenomenonType#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see bpmn.SatisficingLabelType
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(SatisficingLabelType value);

	/**
	 * Returns the value of the '<em><b>Bigquery</b></em>' reference list.
	 * The list contents are of type {@link bpmn.BigQuery}.
	 * It is bidirectional and its opposite is '{@link bpmn.BigQuery#getPhenomenontype <em>Phenomenontype</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bigquery</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bigquery</em>' reference list.
	 * @see bpmn.BpmnPackage#getPhenomenonType_Bigquery()
	 * @see bpmn.BigQuery#getPhenomenontype
	 * @model opposite="phenomenontype"
	 * @generated
	 */
	EList<BigQuery> getBigquery();

	/**
	 * Returns the value of the '<em><b>Goal</b></em>' reference list.
	 * The list contents are of type {@link bpmn.Goal}.
	 * It is bidirectional and its opposite is '{@link bpmn.Goal#getPhenomenontype <em>Phenomenontype</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' reference list.
	 * @see bpmn.BpmnPackage#getPhenomenonType_Goal()
	 * @see bpmn.Goal#getPhenomenontype
	 * @model opposite="phenomenontype"
	 * @generated
	 */
	EList<Goal> getGoal();

} // PhenomenonType
