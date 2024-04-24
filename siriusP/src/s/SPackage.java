/**
 */
package s;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see s.SFactory
 * @model kind="package"
 * @generated
 */
public interface SPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "s";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "s";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "s";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SPackage eINSTANCE = s.impl.SPackageImpl.init();

	/**
	 * The meta object id for the '{@link s.impl.marketImpl <em>market</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see s.impl.marketImpl
	 * @see s.impl.SPackageImpl#getmarket()
	 * @generated
	 */
	int MARKET = 0;

	/**
	 * The feature id for the '<em><b>Sepetler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET__SEPETLER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET__NAME = 1;

	/**
	 * The number of structural features of the '<em>market</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>market</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link s.impl.sepetImpl <em>sepet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see s.impl.sepetImpl
	 * @see s.impl.SPackageImpl#getsepet()
	 * @generated
	 */
	int SEPET = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPET__TYPES = 1;

	/**
	 * The feature id for the '<em><b>Total Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPET__TOTAL_PRICE = 2;

	/**
	 * The number of structural features of the '<em>sepet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPET_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>sepet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link s.impl.productImpl <em>product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see s.impl.productImpl
	 * @see s.impl.SPackageImpl#getproduct()
	 * @generated
	 */
	int PRODUCT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRICE = 1;

	/**
	 * The number of structural features of the '<em>product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link s.impl.ProductType1Impl <em>Product Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see s.impl.ProductType1Impl
	 * @see s.impl.SPackageImpl#getProductType1()
	 * @generated
	 */
	int PRODUCT_TYPE1 = 3;

	/**
	 * The feature id for the '<em><b>Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE1__TYPES = 0;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE1__PRODUCTS = 1;

	/**
	 * The number of structural features of the '<em>Product Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Product Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link s.productType <em>product Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see s.productType
	 * @see s.impl.SPackageImpl#getproductType()
	 * @generated
	 */
	int PRODUCT_TYPE = 4;


	/**
	 * Returns the meta object for class '{@link s.market <em>market</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>market</em>'.
	 * @see s.market
	 * @generated
	 */
	EClass getmarket();

	/**
	 * Returns the meta object for the containment reference list '{@link s.market#getSepetler <em>Sepetler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sepetler</em>'.
	 * @see s.market#getSepetler()
	 * @see #getmarket()
	 * @generated
	 */
	EReference getmarket_Sepetler();

	/**
	 * Returns the meta object for the attribute '{@link s.market#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see s.market#getName()
	 * @see #getmarket()
	 * @generated
	 */
	EAttribute getmarket_Name();

	/**
	 * Returns the meta object for class '{@link s.sepet <em>sepet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>sepet</em>'.
	 * @see s.sepet
	 * @generated
	 */
	EClass getsepet();

	/**
	 * Returns the meta object for the attribute '{@link s.sepet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see s.sepet#getName()
	 * @see #getsepet()
	 * @generated
	 */
	EAttribute getsepet_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link s.sepet#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see s.sepet#getTypes()
	 * @see #getsepet()
	 * @generated
	 */
	EReference getsepet_Types();

	/**
	 * Returns the meta object for the attribute '{@link s.sepet#getTotalPrice <em>Total Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Price</em>'.
	 * @see s.sepet#getTotalPrice()
	 * @see #getsepet()
	 * @generated
	 */
	EAttribute getsepet_TotalPrice();

	/**
	 * Returns the meta object for class '{@link s.product <em>product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>product</em>'.
	 * @see s.product
	 * @generated
	 */
	EClass getproduct();

	/**
	 * Returns the meta object for the attribute '{@link s.product#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see s.product#getName()
	 * @see #getproduct()
	 * @generated
	 */
	EAttribute getproduct_Name();

	/**
	 * Returns the meta object for the attribute '{@link s.product#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see s.product#getPrice()
	 * @see #getproduct()
	 * @generated
	 */
	EAttribute getproduct_Price();

	/**
	 * Returns the meta object for class '{@link s.ProductType1 <em>Product Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Type1</em>'.
	 * @see s.ProductType1
	 * @generated
	 */
	EClass getProductType1();

	/**
	 * Returns the meta object for the attribute '{@link s.ProductType1#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Types</em>'.
	 * @see s.ProductType1#getTypes()
	 * @see #getProductType1()
	 * @generated
	 */
	EAttribute getProductType1_Types();

	/**
	 * Returns the meta object for the containment reference list '{@link s.ProductType1#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see s.ProductType1#getProducts()
	 * @see #getProductType1()
	 * @generated
	 */
	EReference getProductType1_Products();

	/**
	 * Returns the meta object for enum '{@link s.productType <em>product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>product Type</em>'.
	 * @see s.productType
	 * @generated
	 */
	EEnum getproductType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SFactory getSFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link s.impl.marketImpl <em>market</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see s.impl.marketImpl
		 * @see s.impl.SPackageImpl#getmarket()
		 * @generated
		 */
		EClass MARKET = eINSTANCE.getmarket();

		/**
		 * The meta object literal for the '<em><b>Sepetler</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKET__SEPETLER = eINSTANCE.getmarket_Sepetler();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET__NAME = eINSTANCE.getmarket_Name();

		/**
		 * The meta object literal for the '{@link s.impl.sepetImpl <em>sepet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see s.impl.sepetImpl
		 * @see s.impl.SPackageImpl#getsepet()
		 * @generated
		 */
		EClass SEPET = eINSTANCE.getsepet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEPET__NAME = eINSTANCE.getsepet_Name();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEPET__TYPES = eINSTANCE.getsepet_Types();

		/**
		 * The meta object literal for the '<em><b>Total Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEPET__TOTAL_PRICE = eINSTANCE.getsepet_TotalPrice();

		/**
		 * The meta object literal for the '{@link s.impl.productImpl <em>product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see s.impl.productImpl
		 * @see s.impl.SPackageImpl#getproduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getproduct();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__NAME = eINSTANCE.getproduct_Name();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__PRICE = eINSTANCE.getproduct_Price();

		/**
		 * The meta object literal for the '{@link s.impl.ProductType1Impl <em>Product Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see s.impl.ProductType1Impl
		 * @see s.impl.SPackageImpl#getProductType1()
		 * @generated
		 */
		EClass PRODUCT_TYPE1 = eINSTANCE.getProductType1();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_TYPE1__TYPES = eINSTANCE.getProductType1_Types();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_TYPE1__PRODUCTS = eINSTANCE.getProductType1_Products();

		/**
		 * The meta object literal for the '{@link s.productType <em>product Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see s.productType
		 * @see s.impl.SPackageImpl#getproductType()
		 * @generated
		 */
		EEnum PRODUCT_TYPE = eINSTANCE.getproductType();

	}

} //SPackage
