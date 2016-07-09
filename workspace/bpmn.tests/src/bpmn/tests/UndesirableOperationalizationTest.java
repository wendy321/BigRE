/**
 */
package bpmn.tests;

import bpmn.BpmnFactory;
import bpmn.UndesirableOperationalization;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Undesirable Operationalization</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UndesirableOperationalizationTest extends SoftProblemTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UndesirableOperationalizationTest.class);
	}

	/**
	 * Constructs a new Undesirable Operationalization test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UndesirableOperationalizationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Undesirable Operationalization test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UndesirableOperationalization getFixture() {
		return (UndesirableOperationalization)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BpmnFactory.eINSTANCE.createUndesirableOperationalization());
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

} //UndesirableOperationalizationTest
