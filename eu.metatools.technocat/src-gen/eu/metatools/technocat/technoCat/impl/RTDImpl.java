/**
 */
package eu.metatools.technocat.technoCat.impl;

import eu.metatools.technocat.technoCat.RTD;
import eu.metatools.technocat.technoCat.RTDItem;
import eu.metatools.technocat.technoCat.TechnoCatPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RTD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.metatools.technocat.technoCat.impl.RTDImpl#getBases <em>Bases</em>}</li>
 *   <li>{@link eu.metatools.technocat.technoCat.impl.RTDImpl#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RTDImpl extends DefinitionElementImpl implements RTD
{
  /**
   * The cached value of the '{@link #getBases() <em>Bases</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBases()
   * @generated
   * @ordered
   */
  protected EList<RTD> bases;

  /**
   * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItems()
   * @generated
   * @ordered
   */
  protected EList<RTDItem> items;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RTDImpl()
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
    return TechnoCatPackage.Literals.RTD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RTD> getBases()
  {
    if (bases == null)
    {
      bases = new EObjectResolvingEList<RTD>(RTD.class, this, TechnoCatPackage.RTD__BASES);
    }
    return bases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RTDItem> getItems()
  {
    if (items == null)
    {
      items = new EObjectContainmentEList<RTDItem>(RTDItem.class, this, TechnoCatPackage.RTD__ITEMS);
    }
    return items;
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
      case TechnoCatPackage.RTD__ITEMS:
        return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
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
      case TechnoCatPackage.RTD__BASES:
        return getBases();
      case TechnoCatPackage.RTD__ITEMS:
        return getItems();
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
      case TechnoCatPackage.RTD__BASES:
        getBases().clear();
        getBases().addAll((Collection<? extends RTD>)newValue);
        return;
      case TechnoCatPackage.RTD__ITEMS:
        getItems().clear();
        getItems().addAll((Collection<? extends RTDItem>)newValue);
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
      case TechnoCatPackage.RTD__BASES:
        getBases().clear();
        return;
      case TechnoCatPackage.RTD__ITEMS:
        getItems().clear();
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
      case TechnoCatPackage.RTD__BASES:
        return bases != null && !bases.isEmpty();
      case TechnoCatPackage.RTD__ITEMS:
        return items != null && !items.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RTDImpl
