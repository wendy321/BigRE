/**
 */
package bpmn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evenbased Gateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bpmn.EvenbasedGateway#getEventGatewayType <em>Event Gateway Type</em>}</li>
 *   <li>{@link bpmn.EvenbasedGateway#isIsInstanciate <em>Is Instanciate</em>}</li>
 * </ul>
 *
 * @see bpmn.BpmnPackage#getEvenbasedGateway()
 * @model
 * @generated
 */
public interface EvenbasedGateway extends Gateway {
	/**
	 * Returns the value of the '<em><b>Event Gateway Type</b></em>' attribute.
	 * The literals are from the enumeration {@link bpmn.eventBasedGatewayType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Gateway Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Gateway Type</em>' attribute.
	 * @see bpmn.eventBasedGatewayType
	 * @see #setEventGatewayType(eventBasedGatewayType)
	 * @see bpmn.BpmnPackage#getEvenbasedGateway_EventGatewayType()
	 * @model
	 * @generated
	 */
	eventBasedGatewayType getEventGatewayType();

	/**
	 * Sets the value of the '{@link bpmn.EvenbasedGateway#getEventGatewayType <em>Event Gateway Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Gateway Type</em>' attribute.
	 * @see bpmn.eventBasedGatewayType
	 * @see #getEventGatewayType()
	 * @generated
	 */
	void setEventGatewayType(eventBasedGatewayType value);

	/**
	 * Returns the value of the '<em><b>Is Instanciate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Instanciate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Instanciate</em>' attribute.
	 * @see #setIsInstanciate(boolean)
	 * @see bpmn.BpmnPackage#getEvenbasedGateway_IsInstanciate()
	 * @model
	 * @generated
	 */
	boolean isIsInstanciate();

	/**
	 * Sets the value of the '{@link bpmn.EvenbasedGateway#isIsInstanciate <em>Is Instanciate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Instanciate</em>' attribute.
	 * @see #isIsInstanciate()
	 * @generated
	 */
	void setIsInstanciate(boolean value);

} // EvenbasedGateway
