/**
 */
package eu.metatools.technocat.technoCat.util;

import eu.metatools.technocat.technoCat.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eu.metatools.technocat.technoCat.TechnoCatPackage
 * @generated
 */
public class TechnoCatAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TechnoCatPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TechnoCatAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = TechnoCatPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TechnoCatSwitch<Adapter> modelSwitch =
    new TechnoCatSwitch<Adapter>()
    {
      @Override
      public Adapter caseTechnologyCatalog(TechnologyCatalog object)
      {
        return createTechnologyCatalogAdapter();
      }
      @Override
      public Adapter caseElement(Element object)
      {
        return createElementAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseModelElement(ModelElement object)
      {
        return createModelElementAdapter();
      }
      @Override
      public Adapter caseDefinitionElement(DefinitionElement object)
      {
        return createDefinitionElementAdapter();
      }
      @Override
      public Adapter caseInstanceElement(InstanceElement object)
      {
        return createInstanceElementAdapter();
      }
      @Override
      public Adapter caseETD(ETD object)
      {
        return createETDAdapter();
      }
      @Override
      public Adapter caseRTD(RTD object)
      {
        return createRTDAdapter();
      }
      @Override
      public Adapter caseRTDItem(RTDItem object)
      {
        return createRTDItemAdapter();
      }
      @Override
      public Adapter caseED(ED object)
      {
        return createEDAdapter();
      }
      @Override
      public Adapter caseEDItem(EDItem object)
      {
        return createEDItemAdapter();
      }
      @Override
      public Adapter caseRD(RD object)
      {
        return createRDAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link eu.metatools.technocat.technoCat.TechnologyCatalog <em>Technology Catalog</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.metatools.technocat.technoCat.TechnologyCatalog
   * @generated
   */
  public Adapter createTechnologyCatalogAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.metatools.technocat.technoCat.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.metatools.technocat.technoCat.Element
   * @generated
   */
  public Adapter createElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.metatools.technocat.technoCat.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.metatools.technocat.technoCat.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.metatools.technocat.technoCat.ModelElement <em>Model Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.metatools.technocat.technoCat.ModelElement
   * @generated
   */
  public Adapter createModelElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.metatools.technocat.technoCat.DefinitionElement <em>Definition Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.metatools.technocat.technoCat.DefinitionElement
   * @generated
   */
  public Adapter createDefinitionElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.metatools.technocat.technoCat.InstanceElement <em>Instance Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.metatools.technocat.technoCat.InstanceElement
   * @generated
   */
  public Adapter createInstanceElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.metatools.technocat.technoCat.ETD <em>ETD</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.metatools.technocat.technoCat.ETD
   * @generated
   */
  public Adapter createETDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.metatools.technocat.technoCat.RTD <em>RTD</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.metatools.technocat.technoCat.RTD
   * @generated
   */
  public Adapter createRTDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.metatools.technocat.technoCat.RTDItem <em>RTD Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.metatools.technocat.technoCat.RTDItem
   * @generated
   */
  public Adapter createRTDItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.metatools.technocat.technoCat.ED <em>ED</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.metatools.technocat.technoCat.ED
   * @generated
   */
  public Adapter createEDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.metatools.technocat.technoCat.EDItem <em>ED Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.metatools.technocat.technoCat.EDItem
   * @generated
   */
  public Adapter createEDItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.metatools.technocat.technoCat.RD <em>RD</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.metatools.technocat.technoCat.RD
   * @generated
   */
  public Adapter createRDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //TechnoCatAdapterFactory
