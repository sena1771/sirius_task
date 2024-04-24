/**
 */
package s.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import s.SFactory;
import s.product;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>product</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class productTest extends TestCase {

	/**
	 * The fixture for this product test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected product fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(productTest.class);
	}

	/**
	 * Constructs a new product test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public productTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this product test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(product fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this product test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected product getFixture() {
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
		setFixture(SFactory.eINSTANCE.createproduct());
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

} //productTest
