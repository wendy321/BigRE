/**
 */
package bpmn.tests;

import bpmn.BpmnFactory;
import bpmn.ExclusiveGateway;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Exclusive Gateway</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExclusiveGatewayTest extends GatewayTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExclusiveGatewayTest.class);
	}

	/**
	 * Constructs a new Exclusive Gateway test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExclusiveGatewayTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Exclusive Gateway test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExclusiveGateway getFixture() {
		return (ExclusiveGateway)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BpmnFactory.eINSTANCE.createExclusiveGateway());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ExclusiveGatewayTest
