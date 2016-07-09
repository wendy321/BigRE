/**
 */
package bpmn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Satisficing Label Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see bpmn.BpmnPackage#getSatisficingLabelType()
 * @model
 * @generated
 */
public enum SatisficingLabelType implements Enumerator {
	/**
	 * The '<em><b>Undecided</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDECIDED_VALUE
	 * @generated
	 * @ordered
	 */
	UNDECIDED(0, "Undecided", "Undecided"),

	/**
	 * The '<em><b>Satisficed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SATISFICED_VALUE
	 * @generated
	 * @ordered
	 */
	SATISFICED(1, "Satisficed", "Satisficed"),

	/**
	 * The '<em><b>Weakly Satisficed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEAKLY_SATISFICED_VALUE
	 * @generated
	 * @ordered
	 */
	WEAKLY_SATISFICED(2, "WeaklySatisficed", "WeaklySatisficed"),

	/**
	 * The '<em><b>Weakly Denied</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEAKLY_DENIED_VALUE
	 * @generated
	 * @ordered
	 */
	WEAKLY_DENIED(3, "WeaklyDenied", "WeaklyDenied"),

	/**
	 * The '<em><b>Denied</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DENIED_VALUE
	 * @generated
	 * @ordered
	 */
	DENIED(4, "Denied", "Denied"),

	/**
	 * The '<em><b>Conflict</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFLICT_VALUE
	 * @generated
	 * @ordered
	 */
	CONFLICT(5, "Conflict", "Conflict");

	/**
	 * The '<em><b>Undecided</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Undecided</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNDECIDED
	 * @model name="Undecided"
	 * @generated
	 * @ordered
	 */
	public static final int UNDECIDED_VALUE = 0;

	/**
	 * The '<em><b>Satisficed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Satisficed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SATISFICED
	 * @model name="Satisficed"
	 * @generated
	 * @ordered
	 */
	public static final int SATISFICED_VALUE = 1;

	/**
	 * The '<em><b>Weakly Satisficed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Weakly Satisficed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEAKLY_SATISFICED
	 * @model name="WeaklySatisficed"
	 * @generated
	 * @ordered
	 */
	public static final int WEAKLY_SATISFICED_VALUE = 2;

	/**
	 * The '<em><b>Weakly Denied</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Weakly Denied</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEAKLY_DENIED
	 * @model name="WeaklyDenied"
	 * @generated
	 * @ordered
	 */
	public static final int WEAKLY_DENIED_VALUE = 3;

	/**
	 * The '<em><b>Denied</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Denied</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DENIED
	 * @model name="Denied"
	 * @generated
	 * @ordered
	 */
	public static final int DENIED_VALUE = 4;

	/**
	 * The '<em><b>Conflict</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Conflict</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONFLICT
	 * @model name="Conflict"
	 * @generated
	 * @ordered
	 */
	public static final int CONFLICT_VALUE = 5;

	/**
	 * An array of all the '<em><b>Satisficing Label Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SatisficingLabelType[] VALUES_ARRAY =
		new SatisficingLabelType[] {
			UNDECIDED,
			SATISFICED,
			WEAKLY_SATISFICED,
			WEAKLY_DENIED,
			DENIED,
			CONFLICT,
		};

	/**
	 * A public read-only list of all the '<em><b>Satisficing Label Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SatisficingLabelType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Satisficing Label Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SatisficingLabelType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SatisficingLabelType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Satisficing Label Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SatisficingLabelType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SatisficingLabelType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Satisficing Label Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SatisficingLabelType get(int value) {
		switch (value) {
			case UNDECIDED_VALUE: return UNDECIDED;
			case SATISFICED_VALUE: return SATISFICED;
			case WEAKLY_SATISFICED_VALUE: return WEAKLY_SATISFICED;
			case WEAKLY_DENIED_VALUE: return WEAKLY_DENIED;
			case DENIED_VALUE: return DENIED;
			case CONFLICT_VALUE: return CONFLICT;
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
	private SatisficingLabelType(int value, String name, String literal) {
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
	
} //SatisficingLabelType
