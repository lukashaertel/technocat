/**
 */
package eu.metatools.technocat.technoCat.impl;

import eu.metatools.technocat.technoCat.Element;
import eu.metatools.technocat.technoCat.TechnoCatPackage;
import eu.metatools.technocat.technoCat.TechnologyCatalog;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Technology Catalog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.metatools.technocat.technoCat.impl.TechnologyCatalogImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.metatools.technocat.technoCat.impl.TechnologyCatalogImpl#getModelElements <em>Model Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TechnologyCatalogImpl extends MinimalEObjectImpl.Container implements TechnologyCatalog
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getModelElements() <em>Model Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelElements()
   * @generated
   * @ordered
   */
  protected EList<Element> modelElements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TechnologyCatalogImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TechnoCatPackage.Literals.TECHNOLOGY_CATALOG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TechnoCatPackage.TECHNOLOGY_CATALOG__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Element> getModelElements()
  {
    if (modelElements == null)
    {
      modelElements = new EObjectContainmentEList<Element>(Element.class, this, TechnoCatPackage.TECHNOLOGY_CATALOG__MODEL_ELEMENTS);
    }
    return modelElements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TechnoCatPackage.TECHNOLOGY_CATALOG__MODEL_ELEMENTS:
        return ((InternalEList<?>)getModelElements()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TechnoCatPackage.TECHNOLOGY_CATALOG__NAME:
        return getName();
      case TechnoCatPackage.TECHNOLOGY_CATALOG__MODEL_ELEMENTS:
        return getModelElements();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TechnoCatPackage.TECHNOLOGY_CATALOG__NAME:
        setName((String)newValue);
        return;
      case TechnoCatPackage.TECHNOLOGY_CATALOG__MODEL_ELEMENTS:
        getModelElements().clear();
        getModelElements().addAll((Collection<? extends Element>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TechnoCatPackage.TECHNOLOGY_CATALOG__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TechnoCatPackage.TECHNOLOGY_CATALOG__MODEL_ELEMENTS:
        getModelElements().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TechnoCatPackage.TECHNOLOGY_CATALOG__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TechnoCatPackage.TECHNOLOGY_CATALOG__MODEL_ELEMENTS:
        return modelElements != null && !modelElements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //TechnologyCatalogImpl
