/**
 */
package bpmn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.Goal#getPhenomenontype <em>Phenomenontype</em>}</li>
 *   <li>{@link bpmn.Goal#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see bpmn.BpmnPackage#getGoal()
 * @model abstract="true"
 * @generated
 */
public interface Goal extends BusinessConcepts {
	/**
	 * Returns the value of the '<em><b>Phenomenontype</b></em>' reference list.
	 * The list contents are of type {@link bpmn.PhenomenonType}.
	 * It is bidirectional and its opposite is '{@link bpmn.PhenomenonType#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phenomenontype</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phenomenontype</em>' reference list.
	 * @see bpmn.BpmnPackage#getGoal_Phenomenontype()
	 * @see bpmn.PhenomenonType#getGoal
	 * @model opposite="goal"
	 * @generated
	 */
	EList<PhenomenonType> getPhenomenontype();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * The default value is <code>"Undecided"</code>.
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
	 * @see bpmn.BpmnPackage#getGoal_Label()
	 * @model default="Undecided"
	 * @generated
	 */
	SatisficingLabelType getLabel();

	/**
	 * Sets the value of the '{@link bpmn.Goal#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see bpmn.SatisficingLabelType
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(SatisficingLabelType value);

} // Goal
