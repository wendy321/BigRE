/**
 */
package bpmn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Big Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.BigQuery#getPhenomenontype <em>Phenomenontype</em>}</li>
 * </ul>
 *
 * @see bpmn.BpmnPackage#getBigQuery()
 * @model
 * @generated
 */
public interface BigQuery extends BusinessConcepts {
	/**
	 * Returns the value of the '<em><b>Phenomenontype</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link bpmn.PhenomenonType#getBigquery <em>Bigquery</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phenomenontype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phenomenontype</em>' reference.
	 * @see #setPhenomenontype(PhenomenonType)
	 * @see bpmn.BpmnPackage#getBigQuery_Phenomenontype()
	 * @see bpmn.PhenomenonType#getBigquery
	 * @model opposite="bigquery"
	 * @generated
	 */
	PhenomenonType getPhenomenontype();

	/**
	 * Sets the value of the '{@link bpmn.BigQuery#getPhenomenontype <em>Phenomenontype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phenomenontype</em>' reference.
	 * @see #getPhenomenontype()
	 * @generated
	 */
	void setPhenomenontype(PhenomenonType value);

} // BigQuery
