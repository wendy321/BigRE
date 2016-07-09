/**
 */
package bpmn.impl;

import bpmn.BpmnPackage;
import bpmn.EventDefinition;
import bpmn.ThrowEvent;

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
 * An implementation of the model object '<em><b>Throw Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bpmn.impl.ThrowEventImpl#getThrowEventDefinition <em>Throw Event Definition</em>}</li>
 *   <li>{@link bpmn.impl.ThrowEventImpl#getThrowEventDefinitionRef <em>Throw Event Definition Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ThrowEventImpl extends EventImpl implements ThrowEvent {
	/**
	 * The cached value of the '{@link #getThrowEventDefinition() <em>Throw Event Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrowEventDefinition()
	 * @generated
	 * @ordered
	 */
	protected EventDefinition throwEventDefinition;

	/**
	 * The cached value of the '{@link #getThrowEventDefinitionRef() <em>Throw Event Definition Ref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrowEventDefinitionRef()
	 * @generated
	 * @ordered
	 */
	protected EList<EventDefinition> throwEventDefinitionRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThrowEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnPackage.Literals.THROW_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventDefinition getThrowEventDefinition() {
		return throwEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThrowEventDefinition(EventDefinition newThrowEventDefinition, NotificationChain msgs) {
		EventDefinition oldThrowEventDefinition = throwEventDefinition;
		throwEventDefinition = newThrowEventDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BpmnPackage.THROW_EVENT__THROW_EVENT_DEFINITION, oldThrowEventDefinition, newThrowEventDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThrowEventDefinition(EventDefinition newThrowEventDefinition) {
		if (newThrowEventDefinition != throwEventDefinition) {
			NotificationChain msgs = null;
			if (throwEventDefinition != null)
				msgs = ((InternalEObject)throwEventDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BpmnPackage.THROW_EVENT__THROW_EVENT_DEFINITION, null, msgs);
			if (newThrowEventDefinition != null)
				msgs = ((InternalEObject)newThrowEventDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BpmnPackage.THROW_EVENT__THROW_EVENT_DEFINITION, null, msgs);
			msgs = basicSetThrowEventDefinition(newThrowEventDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.THROW_EVENT__THROW_EVENT_DEFINITION, newThrowEventDefinition, newThrowEventDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventDefinition> getThrowEventDefinitionRef() {
		if (throwEventDefinitionRef == null) {
			throwEventDefinitionRef = new EObjectResolvingEList<EventDefinition>(EventDefinition.class, this, BpmnPackage.THROW_EVENT__THROW_EVENT_DEFINITION_REF);
		}
		return throwEventDefinitionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BpmnPackage.THROW_EVENT__THROW_EVENT_DEFINITION:
				return basicSetThrowEventDefinition(null, msgs);
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
			case BpmnPackage.THROW_EVENT__THROW_EVENT_DEFINITION:
				return getThrowEventDefinition();
			case BpmnPackage.THROW_EVENT__THROW_EVENT_DEFINITION_REF:
				return getThrowEventDefinitionRef();
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
			case BpmnPackage.THROW_EVENT__THROW_EVENT_DEFINITION:
				setThrowEventDefinition((EventDefinition)newValue);
				return;
			case BpmnPackage.THROW_EVENT__THROW_EVENT_DEFINITION_REF:
				getThrowEventDefinitionRef().clear();
				getThrowEventDefinitionRef().addAll((Collection<? extends EventDefinition>)newValue);
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
			case BpmnPackage.THROW_EVENT__THROW_EVENT_DEFINITION:
				setThrowEventDefinition((EventDefinition)null);
				return;
			case BpmnPackage.THROW_EVENT__THROW_EVENT_DEFINITION_REF:
				getThrowEventDefinitionRef().clear();
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
			case BpmnPackage.THROW_EVENT__THROW_EVENT_DEFINITION:
				return throwEventDefinition != null;
			case BpmnPackage.THROW_EVENT__THROW_EVENT_DEFINITION_REF:
				return throwEventDefinitionRef != null && !throwEventDefinitionRef.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ThrowEventImpl
