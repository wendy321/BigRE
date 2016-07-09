/**
 */
package bpmn.tests;

import bpmn.BpmnFactory;
import bpmn.ClaimSoftsolution;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Claim Softsolution</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClaimSoftsolutionTest extends SoftSolutionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClaimSoftsolutionTest.class);
	}

	/**
	 * Constructs a new Claim Softsolution test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimSoftsolutionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Claim Softsolution test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ClaimSoftsolution getFixture() {
		return (ClaimSoftsolution)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BpmnFactory.eINSTANCE.createClaimSoftsolution());
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

} //ClaimSoftsolutionTest
