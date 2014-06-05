/**
 */
package eu.metatools.technocat.technoCat;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RTD Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.metatools.technocat.technoCat.RTDItem#getDomain <em>Domain</em>}</li>
 *   <li>{@link eu.metatools.technocat.technoCat.RTDItem#getCodomain <em>Codomain</em>}</li>
 *   <li>{@link eu.metatools.technocat.technoCat.RTDItem#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.metatools.technocat.technoCat.TechnoCatPackage#getRTDItem()
 * @model
 * @generated
 */
public interface RTDItem extends EObject
{
  /**
   * Returns the value of the '<em><b>Domain</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Domain</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Domain</em>' reference.
   * @see #setDomain(ETD)
   * @see eu.metatools.technocat.technoCat.TechnoCatPackage#getRTDItem_Domain()
   * @model
   * @generated
   */
  ETD getDomain();

  /**
   * Sets the value of the '{@link eu.metatools.technocat.technoCat.RTDItem#getDomain <em>Domain</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Domain</em>' reference.
   * @see #getDomain()
   * @generated
   */
  void setDomain(ETD value);

  /**
   * Returns the value of the '<em><b>Codomain</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Codomain</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Codomain</em>' reference.
   * @see #setCodomain(ETD)
   * @see eu.metatools.technocat.technoCat.TechnoCatPackage#getRTDItem_Codomain()
   * @model
   * @generated
   */
  ETD getCodomain();

  /**
   * Sets the value of the '{@link eu.metatools.technocat.technoCat.RTDItem#getCodomain <em>Codomain</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Codomain</em>' reference.
   * @see #getCodomain()
   * @generated
   */
  void setCodomain(ETD value);

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
   * @see eu.metatools.technocat.technoCat.TechnoCatPackage#getRTDItem_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link eu.metatools.technocat.technoCat.RTDItem#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // RTDItem
