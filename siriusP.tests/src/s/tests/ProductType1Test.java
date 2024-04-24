/**
 */
package s.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import s.ProductType1;
import s.SFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Product Type1</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProductType1Test extends TestCase {

	/**
	 * The fixture for this Product Type1 test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductType1 fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProductType1Test.class);
	}

	/**
	 * Constructs a new Product Type1 test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductType1Test(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Product Type1 test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ProductType1 fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Product Type1 test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductType1 getFixture() {
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
		setFixture(SFactory.eINSTANCE.createProductType1());
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

} //ProductType1Test
