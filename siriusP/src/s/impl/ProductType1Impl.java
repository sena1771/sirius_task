/**
 */
package s.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import s.ProductType1;
import s.SPackage;
import s.product;
import s.productType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link s.impl.ProductType1Impl#getTypes <em>Types</em>}</li>
 *   <li>{@link s.impl.ProductType1Impl#getProducts <em>Products</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductType1Impl extends MinimalEObjectImpl.Container implements ProductType1 {
	/**
	 * The default value of the '{@link #getTypes() <em>Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected static final productType TYPES_EDEFAULT = productType.MEYVE_SEBZE;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected productType types = TYPES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProducts() <em>Products</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<product> products;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SPackage.Literals.PRODUCT_TYPE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public productType getTypes() {
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypes(productType newTypes) {
		productType oldTypes = types;
		types = newTypes == null ? TYPES_EDEFAULT : newTypes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SPackage.PRODUCT_TYPE1__TYPES, oldTypes, types));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<product> getProducts() {
		if (products == null) {
			products = new EObjectContainmentEList<product>(product.class, this, SPackage.PRODUCT_TYPE1__PRODUCTS);
		}
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SPackage.PRODUCT_TYPE1__PRODUCTS:
				return ((InternalEList<?>)getProducts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SPackage.PRODUCT_TYPE1__TYPES:
				return getTypes();
			case SPackage.PRODUCT_TYPE1__PRODUCTS:
				return getProducts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SPackage.PRODUCT_TYPE1__TYPES:
				setTypes((productType)newValue);
				return;
			case SPackage.PRODUCT_TYPE1__PRODUCTS:
				getProducts().clear();
				getProducts().addAll((Collection<? extends product>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SPackage.PRODUCT_TYPE1__TYPES:
				setTypes(TYPES_EDEFAULT);
				return;
			case SPackage.PRODUCT_TYPE1__PRODUCTS:
				getProducts().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SPackage.PRODUCT_TYPE1__TYPES:
				return types != TYPES_EDEFAULT;
			case SPackage.PRODUCT_TYPE1__PRODUCTS:
				return products != null && !products.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (types: ");
		result.append(types);
		result.append(')');
		return result.toString();
	}

} //ProductType1Impl
