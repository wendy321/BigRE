/**
 */
package bpmn.impl;

import bpmn.Artifact;
import bpmn.BpmnPackage;
import bpmn.BusinessConcepts;
import bpmn.Contribution;
import bpmn.GraphcialObject;
import bpmn.SatisficingLabelType;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graphcial Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bpmn.impl.GraphcialObjectImpl#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link bpmn.impl.GraphcialObjectImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link bpmn.impl.GraphcialObjectImpl#getBusinessconceptsParent <em>Businessconcepts Parent</em>}</li>
 *   <li>{@link bpmn.impl.GraphcialObjectImpl#getType <em>Type</em>}</li>
 *   <li>{@link bpmn.impl.GraphcialObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link bpmn.impl.GraphcialObjectImpl#getLocalBusinessConcept <em>Local Business Concept</em>}</li>
 *   <li>{@link bpmn.impl.GraphcialObjectImpl#getContribTypeToParents <em>Contrib Type To Parents</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GraphcialObjectImpl extends MinimalEObjectImpl.Container implements GraphcialObject {
	/**
	 * The cached value of the '{@link #getArtifact() <em>Artifact</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifact()
	 * @generated
	 * @ordered
	 */
	protected EList<Artifact> artifact;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final SatisficingLabelType LABEL_EDEFAULT = SatisficingLabelType.UNDECIDED;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected SatisficingLabelType label = LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBusinessconceptsParent() <em>Businessconcepts Parent</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessconceptsParent()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessConcepts> businessconceptsParent;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessConcepts> type;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocalBusinessConcept() <em>Local Business Concept</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalBusinessConcept()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessConcepts> localBusinessConcept;

	/**
	 * The cached value of the '{@link #getContribTypeToParents() <em>Contrib Type To Parents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContribTypeToParents()
	 * @generated
	 * @ordered
	 */
	protected EList<Contribution> contribTypeToParents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphcialObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnPackage.Literals.GRAPHCIAL_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Artifact> getArtifact() {
		if (artifact == null) {
			artifact = new EObjectWithInverseResolvingEList.ManyInverse<Artifact>(Artifact.class, this, BpmnPackage.GRAPHCIAL_OBJECT__ARTIFACT, BpmnPackage.ARTIFACT__CONTRIB_TYPE_TO_PARENT);
		}
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SatisficingLabelType getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(SatisficingLabelType newLabel) {
		SatisficingLabelType oldLabel = label;
		label = newLabel == null ? LABEL_EDEFAULT : newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.GRAPHCIAL_OBJECT__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessConcepts> getBusinessconceptsParent() {
		if (businessconceptsParent == null) {
			businessconceptsParent = new EObjectWithInverseResolvingEList.ManyInverse<BusinessConcepts>(BusinessConcepts.class, this, BpmnPackage.GRAPHCIAL_OBJECT__BUSINESSCONCEPTS_PARENT, BpmnPackage.BUSINESS_CONCEPTS__TOPIC_CHILD);
		}
		return businessconceptsParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessConcepts> getType() {
		if (type == null) {
			type = new EObjectWithInverseResolvingEList.ManyInverse<BusinessConcepts>(BusinessConcepts.class, this, BpmnPackage.GRAPHCIAL_OBJECT__TYPE, BpmnPackage.BUSINESS_CONCEPTS__TOPIC);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.GRAPHCIAL_OBJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessConcepts> getLocalBusinessConcept() {
		if (localBusinessConcept == null) {
			localBusinessConcept = new EObjectContainmentEList<BusinessConcepts>(BusinessConcepts.class, this, BpmnPackage.GRAPHCIAL_OBJECT__LOCAL_BUSINESS_CONCEPT);
		}
		return localBusinessConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Contribution> getContribTypeToParents() {
		if (contribTypeToParents == null) {
			contribTypeToParents = new EObjectContainmentEList<Contribution>(Contribution.class, this, BpmnPackage.GRAPHCIAL_OBJECT__CONTRIB_TYPE_TO_PARENTS);
		}
		return contribTypeToParents;
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
			case BpmnPackage.GRAPHCIAL_OBJECT__ARTIFACT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getArtifact()).basicAdd(otherEnd, msgs);
			case BpmnPackage.GRAPHCIAL_OBJECT__BUSINESSCONCEPTS_PARENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBusinessconceptsParent()).basicAdd(otherEnd, msgs);
			case BpmnPackage.GRAPHCIAL_OBJECT__TYPE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getType()).basicAdd(otherEnd, msgs);
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
			case BpmnPackage.GRAPHCIAL_OBJECT__ARTIFACT:
				return ((InternalEList<?>)getArtifact()).basicRemove(otherEnd, msgs);
			case BpmnPackage.GRAPHCIAL_OBJECT__BUSINESSCONCEPTS_PARENT:
				return ((InternalEList<?>)getBusinessconceptsParent()).basicRemove(otherEnd, msgs);
			case BpmnPackage.GRAPHCIAL_OBJECT__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case BpmnPackage.GRAPHCIAL_OBJECT__LOCAL_BUSINESS_CONCEPT:
				return ((InternalEList<?>)getLocalBusinessConcept()).basicRemove(otherEnd, msgs);
			case BpmnPackage.GRAPHCIAL_OBJECT__CONTRIB_TYPE_TO_PARENTS:
				return ((InternalEList<?>)getContribTypeToParents()).basicRemove(otherEnd, msgs);
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
			case BpmnPackage.GRAPHCIAL_OBJECT__ARTIFACT:
				return getArtifact();
			case BpmnPackage.GRAPHCIAL_OBJECT__LABEL:
				return getLabel();
			case BpmnPackage.GRAPHCIAL_OBJECT__BUSINESSCONCEPTS_PARENT:
				return getBusinessconceptsParent();
			case BpmnPackage.GRAPHCIAL_OBJECT__TYPE:
				return getType();
			case BpmnPackage.GRAPHCIAL_OBJECT__NAME:
				return getName();
			case BpmnPackage.GRAPHCIAL_OBJECT__LOCAL_BUSINESS_CONCEPT:
				return getLocalBusinessConcept();
			case BpmnPackage.GRAPHCIAL_OBJECT__CONTRIB_TYPE_TO_PARENTS:
				return getContribTypeToParents();
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
			case BpmnPackage.GRAPHCIAL_OBJECT__ARTIFACT:
				getArtifact().clear();
				getArtifact().addAll((Collection<? extends Artifact>)newValue);
				return;
			case BpmnPackage.GRAPHCIAL_OBJECT__LABEL:
				setLabel((SatisficingLabelType)newValue);
				return;
			case BpmnPackage.GRAPHCIAL_OBJECT__BUSINESSCONCEPTS_PARENT:
				getBusinessconceptsParent().clear();
				getBusinessconceptsParent().addAll((Collection<? extends BusinessConcepts>)newValue);
				return;
			case BpmnPackage.GRAPHCIAL_OBJECT__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends BusinessConcepts>)newValue);
				return;
			case BpmnPackage.GRAPHCIAL_OBJECT__NAME:
				setName((String)newValue);
				return;
			case BpmnPackage.GRAPHCIAL_OBJECT__LOCAL_BUSINESS_CONCEPT:
				getLocalBusinessConcept().clear();
				getLocalBusinessConcept().addAll((Collection<? extends BusinessConcepts>)newValue);
				return;
			case BpmnPackage.GRAPHCIAL_OBJECT__CONTRIB_TYPE_TO_PARENTS:
				getContribTypeToParents().clear();
				getContribTypeToParents().addAll((Collection<? extends Contribution>)newValue);
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
			case BpmnPackage.GRAPHCIAL_OBJECT__ARTIFACT:
				getArtifact().clear();
				return;
			case BpmnPackage.GRAPHCIAL_OBJECT__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case BpmnPackage.GRAPHCIAL_OBJECT__BUSINESSCONCEPTS_PARENT:
				getBusinessconceptsParent().clear();
				return;
			case BpmnPackage.GRAPHCIAL_OBJECT__TYPE:
				getType().clear();
				return;
			case BpmnPackage.GRAPHCIAL_OBJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BpmnPackage.GRAPHCIAL_OBJECT__LOCAL_BUSINESS_CONCEPT:
				getLocalBusinessConcept().clear();
				return;
			case BpmnPackage.GRAPHCIAL_OBJECT__CONTRIB_TYPE_TO_PARENTS:
				getContribTypeToParents().clear();
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
			case BpmnPackage.GRAPHCIAL_OBJECT__ARTIFACT:
				return artifact != null && !artifact.isEmpty();
			case BpmnPackage.GRAPHCIAL_OBJECT__LABEL:
				return label != LABEL_EDEFAULT;
			case BpmnPackage.GRAPHCIAL_OBJECT__BUSINESSCONCEPTS_PARENT:
				return businessconceptsParent != null && !businessconceptsParent.isEmpty();
			case BpmnPackage.GRAPHCIAL_OBJECT__TYPE:
				return type != null && !type.isEmpty();
			case BpmnPackage.GRAPHCIAL_OBJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BpmnPackage.GRAPHCIAL_OBJECT__LOCAL_BUSINESS_CONCEPT:
				return localBusinessConcept != null && !localBusinessConcept.isEmpty();
			case BpmnPackage.GRAPHCIAL_OBJECT__CONTRIB_TYPE_TO_PARENTS:
				return contribTypeToParents != null && !contribTypeToParents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (label: ");
		result.append(label);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //GraphcialObjectImpl
