/**
 */
package bpmn.tests;

import bpmn.BpmnFactory;
import bpmn.NFRSoftsolution;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>NFR Softsolution</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NFRSoftsolutionTest extends SoftSolutionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NFRSoftsolutionTest.class);
	}

	/**
	 * Constructs a new NFR Softsolution test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFRSoftsolutionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this NFR Softsolution test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NFRSoftsolution getFixture() {
		return (NFRSoftsolution)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BpmnFactory.eINSTANCE.createNFRSoftsolution());
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

} //NFRSoftsolutionTest
