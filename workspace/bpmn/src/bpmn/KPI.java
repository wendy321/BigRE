/**
 */
package bpmn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KPI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.KPI#getKpigoal <em>Kpigoal</em>}</li>
 * </ul>
 *
 * @see bpmn.BpmnPackage#getKPI()
 * @model
 * @generated
 */
public interface KPI extends BusinessConcepts {
	/**
	 * Returns the value of the '<em><b>Kpigoal</b></em>' reference list.
	 * The list contents are of type {@link bpmn.KPIGoal}.
	 * It is bidirectional and its opposite is '{@link bpmn.KPIGoal#getKpi <em>Kpi</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kpigoal</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kpigoal</em>' reference list.
	 * @see bpmn.BpmnPackage#getKPI_Kpigoal()
	 * @see bpmn.KPIGoal#getKpi
	 * @model opposite="kpi"
	 * @generated
	 */
	EList<KPIGoal> getKpigoal();

} // KPI
