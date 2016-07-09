/**
 */
package bpmn.tests;

import bpmn.BpmnFactory;
import bpmn.UndesirableSituation;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Undesirable Situation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UndesirableSituationTest extends SoftProblemTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UndesirableSituationTest.class);
	}

	/**
	 * Constructs a new Undesirable Situation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UndesirableSituationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Undesirable Situation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UndesirableSituation getFixture() {
		return (UndesirableSituation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BpmnFactory.eINSTANCE.createUndesirableSituation());
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

} //UndesirableSituationTest
