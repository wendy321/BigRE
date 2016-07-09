/**
 */
package bpmn.tests;

import bpmn.BpmnFactory;
import bpmn.OperationalizingSoftsolution;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Operationalizing Softsolution</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperationalizingSoftsolutionTest extends SoftSolutionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OperationalizingSoftsolutionTest.class);
	}

	/**
	 * Constructs a new Operationalizing Softsolution test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalizingSoftsolutionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Operationalizing Softsolution test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OperationalizingSoftsolution getFixture() {
		return (OperationalizingSoftsolution)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BpmnFactory.eINSTANCE.createOperationalizingSoftsolution());
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

} //OperationalizingSoftsolutionTest
