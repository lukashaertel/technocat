/**
 */
package eu.metatools.technocat.technoCat;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.metatools.technocat.technoCat.TechnoCatPackage
 * @generated
 */
public interface TechnoCatFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TechnoCatFactory eINSTANCE = eu.metatools.technocat.technoCat.impl.TechnoCatFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Technology Catalog</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Technology Catalog</em>'.
   * @generated
   */
  TechnologyCatalog createTechnologyCatalog();

  /**
   * Returns a new object of class '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element</em>'.
   * @generated
   */
  Element createElement();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Model Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Element</em>'.
   * @generated
   */
  ModelElement createModelElement();

  /**
   * Returns a new object of class '<em>Definition Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Definition Element</em>'.
   * @generated
   */
  DefinitionElement createDefinitionElement();

  /**
   * Returns a new object of class '<em>Instance Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instance Element</em>'.
   * @generated
   */
  InstanceElement createInstanceElement();

  /**
   * Returns a new object of class '<em>ETD</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ETD</em>'.
   * @generated
   */
  ETD createETD();

  /**
   * Returns a new object of class '<em>RTD</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>RTD</em>'.
   * @generated
   */
  RTD createRTD();

  /**
   * Returns a new object of class '<em>RTD Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>RTD Item</em>'.
   * @generated
   */
  RTDItem createRTDItem();

  /**
   * Returns a new object of class '<em>ED</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ED</em>'.
   * @generated
   */
  ED createED();

  /**
   * Returns a new object of class '<em>ED Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ED Item</em>'.
   * @generated
   */
  EDItem createEDItem();

  /**
   * Returns a new object of class '<em>RD</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>RD</em>'.
   * @generated
   */
  RD createRD();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  TechnoCatPackage getTechnoCatPackage();

} //TechnoCatFactory
