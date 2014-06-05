/**
 */
package eu.metatools.technocat.technoCat;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.metatools.technocat.technoCat.DefinitionElement#getName <em>Name</em>}</li>
 *   <li>{@link eu.metatools.technocat.technoCat.DefinitionElement#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.metatools.technocat.technoCat.TechnoCatPackage#getDefinitionElement()
 * @model
 * @generated
 */
public interface DefinitionElement extends ModelElement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see eu.metatools.technocat.technoCat.TechnoCatPackage#getDefinitionElement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link eu.metatools.technocat.technoCat.DefinitionElement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see eu.metatools.technocat.technoCat.TechnoCatPackage#getDefinitionElement_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link eu.metatools.technocat.technoCat.DefinitionElement#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // DefinitionElement
