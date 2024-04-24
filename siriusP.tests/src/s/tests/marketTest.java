/**
 */
package s.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import s.SFactory;
import s.market;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>market</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class marketTest extends TestCase {

	/**
	 * The fixture for this market test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected market fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(marketTest.class);
	}

	/**
	 * Constructs a new market test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public marketTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this market test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(market fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this market test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected market getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SFactory.eINSTANCE.createmarket());
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

} //marketTest
