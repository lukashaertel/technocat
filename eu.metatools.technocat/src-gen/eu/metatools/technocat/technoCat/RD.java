/**
 */
package eu.metatools.technocat.technoCat;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.metatools.technocat.technoCat.RD#getLeft <em>Left</em>}</li>
 *   <li>{@link eu.metatools.technocat.technoCat.RD#getRelation <em>Relation</em>}</li>
 *   <li>{@link eu.metatools.technocat.technoCat.RD#getRight <em>Right</em>}</li>
 *   <li>{@link eu.metatools.technocat.technoCat.RD#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.metatools.technocat.technoCat.TechnoCatPackage#getRD()
 * @model
 * @generated
 */
public interface RD extends InstanceElement
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' reference.
   * @see #setLeft(EDItem)
   * @see eu.metatools.technocat.technoCat.TechnoCatPackage#getRD_Left()
   * @model
   * @generated
   */
  EDItem getLeft();

  /**
   * Sets the value of the '{@link eu.metatools.technocat.technoCat.RD#getLeft <em>Left</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(EDItem value);

  /**
   * Returns the value of the '<em><b>Relation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relation</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relation</em>' reference.
   * @see #setRelation(RTD)
   * @see eu.metatools.technocat.technoCat.TechnoCatPackage#getRD_Relation()
   * @model
   * @generated
   */
  RTD getRelation();

  /**
   * Sets the value of the '{@link eu.metatools.technocat.technoCat.RD#getRelation <em>Relation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relation</em>' reference.
   * @see #getRelation()
   * @generated
   */
  void setRelation(RTD value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' reference.
   * @see #setRight(EDItem)
   * @see eu.metatools.technocat.technoCat.TechnoCatPackage#getRD_Right()
   * @model
   * @generated
   */
  EDItem getRight();

  /**
   * Sets the value of the '{@link eu.metatools.technocat.technoCat.RD#getRight <em>Right</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' reference.
   * @see #getRight()
   * @generated
   */
  void setRight(EDItem value);

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
   * @see eu.metatools.technocat.technoCat.TechnoCatPackage#getRD_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link eu.metatools.technocat.technoCat.RD#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // RD
