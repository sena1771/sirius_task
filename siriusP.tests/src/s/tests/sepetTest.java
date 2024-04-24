/**
 */
package s.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import s.SFactory;
import s.sepet;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>sepet</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class sepetTest extends TestCase {

	/**
	 * The fixture for this sepet test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected sepet fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(sepetTest.class);
	}

	/**
	 * Constructs a new sepet test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sepetTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this sepet test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(sepet fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this sepet test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected sepet getFixture() {
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
		setFixture(SFactory.eINSTANCE.createsepet());
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

} //sepetTest
