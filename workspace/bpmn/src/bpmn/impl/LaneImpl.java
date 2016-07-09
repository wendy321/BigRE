/**
 */
package bpmn.impl;

import bpmn.BpmnPackage;
import bpmn.GraphcialObject;
import bpmn.Lane;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lane</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bpmn.impl.LaneImpl#getGraphicObj <em>Graphic Obj</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LaneImpl extends SwimlaneImpl implements Lane {
	/**
	 * The cached value of the '{@link #getGraphicObj() <em>Graphic Obj</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphicObj()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphcialObject> graphicObj;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LaneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnPackage.Literals.LANE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GraphcialObject> getGraphicObj() {
		if (graphicObj == null) {
			graphicObj = new EObjectContainmentEList<GraphcialObject>(GraphcialObject.class, this, BpmnPackage.LANE__GRAPHIC_OBJ);
		}
		return graphicObj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BpmnPackage.LANE__GRAPHIC_OBJ:
				return ((InternalEList<?>)getGraphicObj()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BpmnPackage.LANE__GRAPHIC_OBJ:
				return getGraphicObj();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BpmnPackage.LANE__GRAPHIC_OBJ:
				getGraphicObj().clear();
				getGraphicObj().addAll((Collection<? extends GraphcialObject>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BpmnPackage.LANE__GRAPHIC_OBJ:
				getGraphicObj().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BpmnPackage.LANE__GRAPHIC_OBJ:
				return graphicObj != null && !graphicObj.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LaneImpl
