/**
 */
package bpmn.tests;

import bpmn.BpmnFactory;
import bpmn.CausalAttribution;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Causal Attribution</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CausalAttributionTest extends SoftProblemTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CausalAttributionTest.class);
	}

	/**
	 * Constructs a new Causal Attribution test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CausalAttributionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Causal Attribution test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CausalAttribution getFixture() {
		return (CausalAttribution)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BpmnFactory.eINSTANCE.createCausalAttribution());
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

} //CausalAttributionTest
