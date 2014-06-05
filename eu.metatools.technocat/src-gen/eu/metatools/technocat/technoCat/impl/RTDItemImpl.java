/**
 */
package eu.metatools.technocat.technoCat.impl;

import eu.metatools.technocat.technoCat.ETD;
import eu.metatools.technocat.technoCat.RTDItem;
import eu.metatools.technocat.technoCat.TechnoCatPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RTD Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.metatools.technocat.technoCat.impl.RTDItemImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link eu.metatools.technocat.technoCat.impl.RTDItemImpl#getCodomain <em>Codomain</em>}</li>
 *   <li>{@link eu.metatools.technocat.technoCat.impl.RTDItemImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RTDItemImpl extends MinimalEObjectImpl.Container implements RTDItem
{
  /**
   * The cached value of the '{@link #getDomain() <em>Domain</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDomain()
   * @generated
   * @ordered
   */
  protected ETD domain;

  /**
   * The cached value of the '{@link #getCodomain() <em>Codomain</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCodomain()
   * @generated
   * @ordered
   */
  protected ETD codomain;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RTDItemImpl()
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
    return TechnoCatPackage.Literals.RTD_ITEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETD getDomain()
  {
    if (domain != null && domain.eIsProxy())
    {
      InternalEObject oldDomain = (InternalEObject)domain;
      domain = (ETD)eResolveProxy(oldDomain);
      if (domain != oldDomain)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TechnoCatPackage.RTD_ITEM__DOMAIN, oldDomain, domain));
      }
    }
    return domain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETD basicGetDomain()
  {
    return domain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDomain(ETD newDomain)
  {
    ETD oldDomain = domain;
    domain = newDomain;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TechnoCatPackage.RTD_ITEM__DOMAIN, oldDomain, domain));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETD getCodomain()
  {
    if (codomain != null && codomain.eIsProxy())
    {
      InternalEObject oldCodomain = (InternalEObject)codomain;
      codomain = (ETD)eResolveProxy(oldCodomain);
      if (codomain != oldCodomain)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TechnoCatPackage.RTD_ITEM__CODOMAIN, oldCodomain, codomain));
      }
    }
    return codomain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ETD basicGetCodomain()
  {
    return codomain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCodomain(ETD newCodomain)
  {
    ETD oldCodomain = codomain;
    codomain = newCodomain;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TechnoCatPackage.RTD_ITEM__CODOMAIN, oldCodomain, codomain));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TechnoCatPackage.RTD_ITEM__VALUE, oldValue, value));
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
      case TechnoCatPackage.RTD_ITEM__DOMAIN:
        if (resolve) return getDomain();
        return basicGetDomain();
      case TechnoCatPackage.RTD_ITEM__CODOMAIN:
        if (resolve) return getCodomain();
        return basicGetCodomain();
      case TechnoCatPackage.RTD_ITEM__VALUE:
        return getValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TechnoCatPackage.RTD_ITEM__DOMAIN:
        setDomain((ETD)newValue);
        return;
      case TechnoCatPackage.RTD_ITEM__CODOMAIN:
        setCodomain((ETD)newValue);
        return;
      case TechnoCatPackage.RTD_ITEM__VALUE:
        setValue((String)newValue);
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
      case TechnoCatPackage.RTD_ITEM__DOMAIN:
        setDomain((ETD)null);
        return;
      case TechnoCatPackage.RTD_ITEM__CODOMAIN:
        setCodomain((ETD)null);
        return;
      case TechnoCatPackage.RTD_ITEM__VALUE:
        setValue(VALUE_EDEFAULT);
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
      case TechnoCatPackage.RTD_ITEM__DOMAIN:
        return domain != null;
      case TechnoCatPackage.RTD_ITEM__CODOMAIN:
        return codomain != null;
      case TechnoCatPackage.RTD_ITEM__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
    result.append(" (value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //RTDItemImpl
