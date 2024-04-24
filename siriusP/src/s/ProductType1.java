/**
 */
package s;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link s.ProductType1#getTypes <em>Types</em>}</li>
 *   <li>{@link s.ProductType1#getProducts <em>Products</em>}</li>
 * </ul>
 *
 * @see s.SPackage#getProductType1()
 * @model
 * @generated
 */
public interface ProductType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' attribute.
	 * The literals are from the enumeration {@link s.productType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' attribute.
	 * @see s.productType
	 * @see #setTypes(productType)
	 * @see s.SPackage#getProductType1_Types()
	 * @model
	 * @generated
	 */
	productType getTypes();

	/**
	 * Sets the value of the '{@link s.ProductType1#getTypes <em>Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Types</em>' attribute.
	 * @see s.productType
	 * @see #getTypes()
	 * @generated
	 */
	void setTypes(productType value);

	/**
	 * Returns the value of the '<em><b>Products</b></em>' containment reference list.
	 * The list contents are of type {@link s.product}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' containment reference list.
	 * @see s.SPackage#getProductType1_Products()
	 * @model containment="true"
	 * @generated
	 */
	EList<product> getProducts();

} // ProductType1
