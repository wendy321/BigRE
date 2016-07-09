/**
 */
package bpmn.impl;

import bpmn.BpmnPackage;
import bpmn.CatchEvent;
import bpmn.EventDefinition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catch Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bpmn.impl.CatchEventImpl#getParallelMultiple <em>Parallel Multiple</em>}</li>
 *   <li>{@link bpmn.impl.CatchEventImpl#getCatchEventDefinition <em>Catch Event Definition</em>}</li>
 *   <li>{@link bpmn.impl.CatchEventImpl#getCatchEventDefinitionRef <em>Catch Event Definition Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CatchEventImpl extends EventImpl implements CatchEvent {
	/**
	 * The default value of the '{@link #getParallelMultiple() <em>Parallel Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallelMultiple()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PARALLEL_MULTIPLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParallelMultiple() <em>Parallel Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallelMultiple()
	 * @generated
	 * @ordered
	 */
	protected Boolean parallelMultiple = PARALLEL_MULTIPLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCatchEventDefinition() <em>Catch Event Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatchEventDefinition()
	 * @generated
	 * @ordered
	 */
	protected EventDefinition catchEventDefinition;

	/**
	 * The cached value of the '{@link #getCatchEventDefinitionRef() <em>Catch Event Definition Ref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatchEventDefinitionRef()
	 * @generated
	 * @ordered
	 */
	protected EList<EventDefinition> catchEventDefinitionRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatchEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnPackage.Literals.CATCH_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getParallelMultiple() {
		return parallelMultiple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParallelMultiple(Boolean newParallelMultiple) {
		Boolean oldParallelMultiple = parallelMultiple;
		parallelMultiple = newParallelMultiple;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.CATCH_EVENT__PARALLEL_MULTIPLE, oldParallelMultiple, parallelMultiple));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventDefinition getCatchEventDefinition() {
		return catchEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCatchEventDefinition(EventDefinition newCatchEventDefinition, NotificationChain msgs) {
		EventDefinition oldCatchEventDefinition = catchEventDefinition;
		catchEventDefinition = newCatchEventDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BpmnPackage.CATCH_EVENT__CATCH_EVENT_DEFINITION, oldCatchEventDefinition, newCatchEventDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatchEventDefinition(EventDefinition newCatchEventDefinition) {
		if (newCatchEventDefinition != catchEventDefinition) {
			NotificationChain msgs = null;
			if (catchEventDefinition != null)
				msgs = ((InternalEObject)catchEventDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BpmnPackage.CATCH_EVENT__CATCH_EVENT_DEFINITION, null, msgs);
			if (newCatchEventDefinition != null)
				msgs = ((InternalEObject)newCatchEventDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BpmnPackage.CATCH_EVENT__CATCH_EVENT_DEFINITION, null, msgs);
			msgs = basicSetCatchEventDefinition(newCatchEventDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.CATCH_EVENT__CATCH_EVENT_DEFINITION, newCatchEventDefinition, newCatchEventDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventDefinition> getCatchEventDefinitionRef() {
		if (catchEventDefinitionRef == null) {
			catchEventDefinitionRef = new EObjectResolvingEList<EventDefinition>(EventDefinition.class, this, BpmnPackage.CATCH_EVENT__CATCH_EVENT_DEFINITION_REF);
		}
		return catchEventDefinitionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BpmnPackage.CATCH_EVENT__CATCH_EVENT_DEFINITION:
				return basicSetCatchEventDefinition(null, msgs);
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
			case BpmnPackage.CATCH_EVENT__PARALLEL_MULTIPLE:
				return getParallelMultiple();
			case BpmnPackage.CATCH_EVENT__CATCH_EVENT_DEFINITION:
				return getCatchEventDefinition();
			case BpmnPackage.CATCH_EVENT__CATCH_EVENT_DEFINITION_REF:
				return getCatchEventDefinitionRef();
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
			case BpmnPackage.CATCH_EVENT__PARALLEL_MULTIPLE:
				setParallelMultiple((Boolean)newValue);
				return;
			case BpmnPackage.CATCH_EVENT__CATCH_EVENT_DEFINITION:
				setCatchEventDefinition((EventDefinition)newValue);
				return;
			case BpmnPackage.CATCH_EVENT__CATCH_EVENT_DEFINITION_REF:
				getCatchEventDefinitionRef().clear();
				getCatchEventDefinitionRef().addAll((Collection<? extends EventDefinition>)newValue);
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
			case BpmnPackage.CATCH_EVENT__PARALLEL_MULTIPLE:
				setParallelMultiple(PARALLEL_MULTIPLE_EDEFAULT);
				return;
			case BpmnPackage.CATCH_EVENT__CATCH_EVENT_DEFINITION:
				setCatchEventDefinition((EventDefinition)null);
				return;
			case BpmnPackage.CATCH_EVENT__CATCH_EVENT_DEFINITION_REF:
				getCatchEventDefinitionRef().clear();
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
			case BpmnPackage.CATCH_EVENT__PARALLEL_MULTIPLE:
				return PARALLEL_MULTIPLE_EDEFAULT == null ? parallelMultiple != null : !PARALLEL_MULTIPLE_EDEFAULT.equals(parallelMultiple);
			case BpmnPackage.CATCH_EVENT__CATCH_EVENT_DEFINITION:
				return catchEventDefinition != null;
			case BpmnPackage.CATCH_EVENT__CATCH_EVENT_DEFINITION_REF:
				return catchEventDefinitionRef != null && !catchEventDefinitionRef.isEmpty();
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
		result.append(" (parallelMultiple: ");
		result.append(parallelMultiple);
		result.append(')');
		return result.toString();
	}

} //CatchEventImpl
