/**
 */
package s;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>market</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link s.market#getSepetler <em>Sepetler</em>}</li>
 *   <li>{@link s.market#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see s.SPackage#getmarket()
 * @model
 * @generated
 */
public interface market extends EObject {
	/**
	 * Returns the value of the '<em><b>Sepetler</b></em>' containment reference list.
	 * The list contents are of type {@link s.sepet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sepetler</em>' containment reference list.
	 * @see s.SPackage#getmarket_Sepetler()
	 * @model containment="true"
	 * @generated
	 */
	EList<sepet> getSepetler();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see s.SPackage#getmarket_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link s.market#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // market
