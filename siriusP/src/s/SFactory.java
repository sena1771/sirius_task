/**
 */
package s;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see s.SPackage
 * @generated
 */
public interface SFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SFactory eINSTANCE = s.impl.SFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>market</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>market</em>'.
	 * @generated
	 */
	market createmarket();

	/**
	 * Returns a new object of class '<em>sepet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>sepet</em>'.
	 * @generated
	 */
	sepet createsepet();

	/**
	 * Returns a new object of class '<em>product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>product</em>'.
	 * @generated
	 */
	product createproduct();

	/**
	 * Returns a new object of class '<em>Product Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Type1</em>'.
	 * @generated
	 */
	ProductType1 createProductType1();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SPackage getSPackage();

} //SFactory
