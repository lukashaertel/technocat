/**
 */
package eu.metatools.technocat.technoCat;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ED</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.metatools.technocat.technoCat.ED#getType <em>Type</em>}</li>
 *   <li>{@link eu.metatools.technocat.technoCat.ED#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.metatools.technocat.technoCat.TechnoCatPackage#getED()
 * @model
 * @generated
 */
public interface ED extends InstanceElement
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(ETD)
   * @see eu.metatools.technocat.technoCat.TechnoCatPackage#getED_Type()
   * @model
   * @generated
   */
  ETD getType();

  /**
   * Sets the value of the '{@link eu.metatools.technocat.technoCat.ED#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(ETD value);

  /**
   * Returns the value of the '<em><b>Items</b></em>' containment reference list.
   * The list contents are of type {@link eu.metatools.technocat.technoCat.EDItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Items</em>' containment reference list.
   * @see eu.metatools.technocat.technoCat.TechnoCatPackage#getED_Items()
   * @model containment="true"
   * @generated
   */
  EList<EDItem> getItems();

} // ED
