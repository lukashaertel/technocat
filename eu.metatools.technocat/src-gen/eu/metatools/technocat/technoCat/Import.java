/**
 */
package eu.metatools.technocat.technoCat;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.metatools.technocat.technoCat.Import#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.metatools.technocat.technoCat.TechnoCatPackage#getImport()
 * @model
 * @generated
 */
public interface Import extends Element
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(TechnologyCatalog)
   * @see eu.metatools.technocat.technoCat.TechnoCatPackage#getImport_Ref()
   * @model
   * @generated
   */
  TechnologyCatalog getRef();

  /**
   * Sets the value of the '{@link eu.metatools.technocat.technoCat.Import#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(TechnologyCatalog value);

} // Import
