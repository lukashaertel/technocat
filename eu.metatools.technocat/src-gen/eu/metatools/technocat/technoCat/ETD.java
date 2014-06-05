/**
 */
package eu.metatools.technocat.technoCat;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ETD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.metatools.technocat.technoCat.ETD#getBases <em>Bases</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.metatools.technocat.technoCat.TechnoCatPackage#getETD()
 * @model
 * @generated
 */
public interface ETD extends DefinitionElement
{
  /**
   * Returns the value of the '<em><b>Bases</b></em>' reference list.
   * The list contents are of type {@link eu.metatools.technocat.technoCat.ETD}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bases</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bases</em>' reference list.
   * @see eu.metatools.technocat.technoCat.TechnoCatPackage#getETD_Bases()
   * @model
   * @generated
   */
  EList<ETD> getBases();

} // ETD
