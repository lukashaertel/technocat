/**
 */
package eu.metatools.technocat.technoCat.util;

import eu.metatools.technocat.technoCat.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see eu.metatools.technocat.technoCat.TechnoCatPackage
 * @generated
 */
public class TechnoCatSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TechnoCatPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TechnoCatSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = TechnoCatPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case TechnoCatPackage.TECHNOLOGY_CATALOG:
      {
        TechnologyCatalog technologyCatalog = (TechnologyCatalog)theEObject;
        T result = caseTechnologyCatalog(technologyCatalog);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TechnoCatPackage.ELEMENT:
      {
        Element element = (Element)theEObject;
        T result = caseElement(element);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TechnoCatPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = caseElement(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TechnoCatPackage.MODEL_ELEMENT:
      {
        ModelElement modelElement = (ModelElement)theEObject;
        T result = caseModelElement(modelElement);
        if (result == null) result = caseElement(modelElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TechnoCatPackage.DEFINITION_ELEMENT:
      {
        DefinitionElement definitionElement = (DefinitionElement)theEObject;
        T result = caseDefinitionElement(definitionElement);
        if (result == null) result = caseModelElement(definitionElement);
        if (result == null) result = caseElement(definitionElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TechnoCatPackage.INSTANCE_ELEMENT:
      {
        InstanceElement instanceElement = (InstanceElement)theEObject;
        T result = caseInstanceElement(instanceElement);
        if (result == null) result = caseModelElement(instanceElement);
        if (result == null) result = caseElement(instanceElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TechnoCatPackage.ETD:
      {
        ETD etd = (ETD)theEObject;
        T result = caseETD(etd);
        if (result == null) result = caseDefinitionElement(etd);
        if (result == null) result = caseModelElement(etd);
        if (result == null) result = caseElement(etd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TechnoCatPackage.RTD:
      {
        RTD rtd = (RTD)theEObject;
        T result = caseRTD(rtd);
        if (result == null) result = caseDefinitionElement(rtd);
        if (result == null) result = caseModelElement(rtd);
        if (result == null) result = caseElement(rtd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TechnoCatPackage.RTD_ITEM:
      {
        RTDItem rtdItem = (RTDItem)theEObject;
        T result = caseRTDItem(rtdItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TechnoCatPackage.ED:
      {
        ED ed = (ED)theEObject;
        T result = caseED(ed);
        if (result == null) result = caseInstanceElement(ed);
        if (result == null) result = caseModelElement(ed);
        if (result == null) result = caseElement(ed);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TechnoCatPackage.ED_ITEM:
      {
        EDItem edItem = (EDItem)theEObject;
        T result = caseEDItem(edItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TechnoCatPackage.RD:
      {
        RD rd = (RD)theEObject;
        T result = caseRD(rd);
        if (result == null) result = caseInstanceElement(rd);
        if (result == null) result = caseModelElement(rd);
        if (result == null) result = caseElement(rd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Technology Catalog</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Technology Catalog</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTechnologyCatalog(TechnologyCatalog object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElement(Element object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelElement(ModelElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Definition Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Definition Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefinitionElement(DefinitionElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instance Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instance Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstanceElement(InstanceElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ETD</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ETD</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETD(ETD object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RTD</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RTD</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRTD(RTD object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RTD Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RTD Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRTDItem(RTDItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ED</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ED</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseED(ED object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ED Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ED Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEDItem(EDItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RD</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RD</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRD(RD object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //TechnoCatSwitch
