/**
 */
package s;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>product Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see s.SPackage#getproductType()
 * @model
 * @generated
 */
public enum productType implements Enumerator {
	/**
	 * The '<em><b>Meyve Sebze</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEYVE_SEBZE_VALUE
	 * @generated
	 * @ordered
	 */
	MEYVE_SEBZE(1, "meyveSebze", "meyveSebze"),

	/**
	 * The '<em><b>Kiyafet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KIYAFET_VALUE
	 * @generated
	 * @ordered
	 */
	KIYAFET(2, "kiyafet", "kiyafet"),

	/**
	 * The '<em><b>Cerez</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CEREZ_VALUE
	 * @generated
	 * @ordered
	 */
	CEREZ(3, "cerez", "cerez");

	/**
	 * The '<em><b>Meyve Sebze</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEYVE_SEBZE
	 * @model name="meyveSebze"
	 * @generated
	 * @ordered
	 */
	public static final int MEYVE_SEBZE_VALUE = 1;

	/**
	 * The '<em><b>Kiyafet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KIYAFET
	 * @model name="kiyafet"
	 * @generated
	 * @ordered
	 */
	public static final int KIYAFET_VALUE = 2;

	/**
	 * The '<em><b>Cerez</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CEREZ
	 * @model name="cerez"
	 * @generated
	 * @ordered
	 */
	public static final int CEREZ_VALUE = 3;

	/**
	 * An array of all the '<em><b>product Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final productType[] VALUES_ARRAY =
		new productType[] {
			MEYVE_SEBZE,
			KIYAFET,
			CEREZ,
		};

	/**
	 * A public read-only list of all the '<em><b>product Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<productType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>product Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static productType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			productType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>product Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static productType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			productType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>product Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static productType get(int value) {
		switch (value) {
			case MEYVE_SEBZE_VALUE: return MEYVE_SEBZE;
			case KIYAFET_VALUE: return KIYAFET;
			case CEREZ_VALUE: return CEREZ;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private productType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //productType
