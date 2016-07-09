/**
 */
package bpmn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KPI Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.KPIGoal#getKpi <em>Kpi</em>}</li>
 * </ul>
 *
 * @see bpmn.BpmnPackage#getKPIGoal()
 * @model
 * @generated
 */
public interface KPIGoal extends Goal, BusinessConcepts {
	/**
	 * Returns the value of the '<em><b>Kpi</b></em>' reference list.
	 * The list contents are of type {@link bpmn.KPI}.
	 * It is bidirectional and its opposite is '{@link bpmn.KPI#getKpigoal <em>Kpigoal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kpi</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kpi</em>' reference list.
	 * @see bpmn.BpmnPackage#getKPIGoal_Kpi()
	 * @see bpmn.KPI#getKpigoal
	 * @model opposite="kpigoal"
	 * @generated
	 */
	EList<KPI> getKpi();

} // KPIGoal
