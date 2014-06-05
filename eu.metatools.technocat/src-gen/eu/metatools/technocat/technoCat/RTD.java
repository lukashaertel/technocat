/**
 */
package eu.metatools.technocat.technoCat;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RTD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.metatools.technocat.technoCat.RTD#getBases <em>Bases</em>}</li>
 *   <li>{@link eu.metatools.technocat.technoCat.RTD#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.metatools.technocat.technoCat.TechnoCatPackage#getRTD()
 * @model
 * @generated
 */
public interface RTD extends DefinitionElement
{
  /**
   * Returns the value of the '<em><b>Bases</b></em>' reference list.
   * The list contents are of type {@link eu.metatools.technocat.technoCat.RTD}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bases</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bases</em>' reference list.
   * @see eu.metatools.technocat.technoCat.TechnoCatPackage#getRTD_Bases()
   * @model
   * @generated
   */
  EList<RTD> getBases();

  /**
   * Returns the value of the '<em><b>Items</b></em>' containment reference list.
   * The list contents are of type {@link eu.metatools.technocat.technoCat.RTDItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Items</em>' containment reference list.
   * @see eu.metatools.technocat.technoCat.TechnoCatPackage#getRTD_Items()
   * @model containment="true"
   * @generated
   */
  EList<RTDItem> getItems();

} // RTD
