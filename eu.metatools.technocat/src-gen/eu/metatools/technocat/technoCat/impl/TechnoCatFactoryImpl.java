/**
 */
package eu.metatools.technocat.technoCat.impl;

import eu.metatools.technocat.technoCat.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TechnoCatFactoryImpl extends EFactoryImpl implements TechnoCatFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TechnoCatFactory init()
  {
    try
    {
      TechnoCatFactory theTechnoCatFactory = (TechnoCatFactory)EPackage.Registry.INSTANCE.getEFactory(TechnoCatPackage.eNS_URI);
      if (theTechnoCatFactory != null)
      {
        return theTechnoCatFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TechnoCatFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TechnoCatFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case TechnoCatPackage.TECHNOLOGY_CATALOG: return createTechnologyCatalog();
      case TechnoCatPackage.ELEMENT: return createElement();
      case TechnoCatPackage.IMPORT: return createImport();
      case TechnoCatPackage.MODEL_ELEMENT: return createModelElement();
      case TechnoCatPackage.DEFINITION_ELEMENT: return createDefinitionElement();
      case TechnoCatPackage.INSTANCE_ELEMENT: return createInstanceElement();
      case TechnoCatPackage.ETD: return createETD();
      case TechnoCatPackage.RTD: return createRTD();
      case TechnoCatPackage.RTD_ITEM: return createRTDItem();
      case TechnoCatPackage.ED: return createED();
      case TechnoCatPackage.ED_ITEM: return createEDItem();
      case TechnoCatPackage.RD: return createRD();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TechnologyCatalog createTechnologyCatalog()
  {
    TechnologyCatalogImpl technologyCatalog = new TechnologyCatalogImpl();
    return technologyCatalog;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelElement createModelElement()
  {
    ModelElementImpl modelElement = new ModelElementImpl();
    return modelElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefinitionElement createDefinitionElement()
  {
    DefinitionElementImpl definitionElement = new DefinitionElementImpl();
    return definitionElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstanceElement createInstanceElement()
  {
    InstanceElementImpl instanceElement = new InstanceElementImpl();
    return instanceElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETD createETD()
  {
    ETDImpl etd = new ETDImpl();
    return etd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RTD createRTD()
  {
    RTDImpl rtd = new RTDImpl();
    return rtd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RTDItem createRTDItem()
  {
    RTDItemImpl rtdItem = new RTDItemImpl();
    return rtdItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ED createED()
  {
    EDImpl ed = new EDImpl();
    return ed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDItem createEDItem()
  {
    EDItemImpl edItem = new EDItemImpl();
    return edItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RD createRD()
  {
    RDImpl rd = new RDImpl();
    return rd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TechnoCatPackage getTechnoCatPackage()
  {
    return (TechnoCatPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TechnoCatPackage getPackage()
  {
    return TechnoCatPackage.eINSTANCE;
  }

} //TechnoCatFactoryImpl
