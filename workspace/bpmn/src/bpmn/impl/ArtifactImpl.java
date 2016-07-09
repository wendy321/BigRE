/**
 */
package bpmn.impl;

import bpmn.Artifact;
import bpmn.BpmnPackage;
import bpmn.GraphcialObject;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bpmn.impl.ArtifactImpl#getContribTypeToParent <em>Contrib Type To Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ArtifactImpl extends GraphcialObjectImpl implements Artifact {
	/**
	 * The cached value of the '{@link #getContribTypeToParent() <em>Contrib Type To Parent</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContribTypeToParent()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphcialObject> contribTypeToParent;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnPackage.Literals.ARTIFACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GraphcialObject> getContribTypeToParent() {
		if (contribTypeToParent == null) {
			contribTypeToParent = new EObjectWithInverseResolvingEList.ManyInverse<GraphcialObject>(GraphcialObject.class, this, BpmnPackage.ARTIFACT__CONTRIB_TYPE_TO_PARENT, BpmnPackage.GRAPHCIAL_OBJECT__ARTIFACT);
		}
		return contribTypeToParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BpmnPackage.ARTIFACT__CONTRIB_TYPE_TO_PARENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContribTypeToParent()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BpmnPackage.ARTIFACT__CONTRIB_TYPE_TO_PARENT:
				return ((InternalEList<?>)getContribTypeToParent()).basicRemove(otherEnd, msgs);
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
			case BpmnPackage.ARTIFACT__CONTRIB_TYPE_TO_PARENT:
				return getContribTypeToParent();
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
			case BpmnPackage.ARTIFACT__CONTRIB_TYPE_TO_PARENT:
				getContribTypeToParent().clear();
				getContribTypeToParent().addAll((Collection<? extends GraphcialObject>)newValue);
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
			case BpmnPackage.ARTIFACT__CONTRIB_TYPE_TO_PARENT:
				getContribTypeToParent().clear();
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
			case BpmnPackage.ARTIFACT__CONTRIB_TYPE_TO_PARENT:
				return contribTypeToParent != null && !contribTypeToParent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArtifactImpl
