/**
 */
package eu.metatools.technocat.technoCat;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Technology Catalog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.metatools.technocat.technoCat.TechnologyCatalog#getName <em>Name</em>}</li>
 *   <li>{@link eu.metatools.technocat.technoCat.TechnologyCatalog#getModelElements <em>Model Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.metatools.technocat.technoCat.TechnoCatPackage#getTechnologyCatalog()
 * @model
 * @generated
 */
public interface TechnologyCatalog extends EObject
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
   * @see eu.metatools.technocat.technoCat.TechnoCatPackage#getTechnologyCatalog_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link eu.metatools.technocat.technoCat.TechnologyCatalog#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Model Elements</b></em>' containment reference list.
   * The list contents are of type {@link eu.metatools.technocat.technoCat.Element}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model Elements</em>' containment reference list.
   * @see eu.metatools.technocat.technoCat.TechnoCatPackage#getTechnologyCatalog_ModelElements()
   * @model containment="true"
   * @generated
   */
  EList<Element> getModelElements();

} // TechnologyCatalog
