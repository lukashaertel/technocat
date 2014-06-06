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
 *   <li>{@link eu.metatools.technocat.technoCat.TechnologyCatalog#getImports <em>Imports</em>}</li>
 *   <li>{@link eu.metatools.technocat.technoCat.TechnologyCatalog#getEntityTypes <em>Entity Types</em>}</li>
 *   <li>{@link eu.metatools.technocat.technoCat.TechnologyCatalog#getRelationTypes <em>Relation Types</em>}</li>
 *   <li>{@link eu.metatools.technocat.technoCat.TechnologyCatalog#getEntities <em>Entities</em>}</li>
 *   <li>{@link eu.metatools.technocat.technoCat.TechnologyCatalog#getRelations <em>Relations</em>}</li>
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
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link eu.metatools.technocat.technoCat.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see eu.metatools.technocat.technoCat.TechnoCatPackage#getTechnologyCatalog_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Entity Types</b></em>' containment reference list.
   * The list contents are of type {@link eu.metatools.technocat.technoCat.ETD}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity Types</em>' containment reference list.
   * @see eu.metatools.technocat.technoCat.TechnoCatPackage#getTechnologyCatalog_EntityTypes()
   * @model containment="true"
   * @generated
   */
  EList<ETD> getEntityTypes();

  /**
   * Returns the value of the '<em><b>Relation Types</b></em>' containment reference list.
   * The list contents are of type {@link eu.metatools.technocat.technoCat.RTD}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relation Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relation Types</em>' containment reference list.
   * @see eu.metatools.technocat.technoCat.TechnoCatPackage#getTechnologyCatalog_RelationTypes()
   * @model containment="true"
   * @generated
   */
  EList<RTD> getRelationTypes();

  /**
   * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
   * The list contents are of type {@link eu.metatools.technocat.technoCat.ED}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entities</em>' containment reference list.
   * @see eu.metatools.technocat.technoCat.TechnoCatPackage#getTechnologyCatalog_Entities()
   * @model containment="true"
   * @generated
   */
  EList<ED> getEntities();

  /**
   * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
   * The list contents are of type {@link eu.metatools.technocat.technoCat.RD}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relations</em>' containment reference list.
   * @see eu.metatools.technocat.technoCat.TechnoCatPackage#getTechnologyCatalog_Relations()
   * @model containment="true"
   * @generated
   */
  EList<RD> getRelations();

} // TechnologyCatalog
