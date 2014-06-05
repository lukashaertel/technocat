/**
 */
package eu.metatools.technocat.technoCat.impl;

import eu.metatools.technocat.technoCat.EDItem;
import eu.metatools.technocat.technoCat.RD;
import eu.metatools.technocat.technoCat.RTD;
import eu.metatools.technocat.technoCat.TechnoCatPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.metatools.technocat.technoCat.impl.RDImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link eu.metatools.technocat.technoCat.impl.RDImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link eu.metatools.technocat.technoCat.impl.RDImpl#getRight <em>Right</em>}</li>
 *   <li>{@link eu.metatools.technocat.technoCat.impl.RDImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RDImpl extends InstanceElementImpl implements RD
{
  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected EDItem left;

  /**
   * The cached value of the '{@link #getRelation() <em>Relation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelation()
   * @generated
   * @ordered
   */
  protected RTD relation;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected EDItem right;

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
  protected RDImpl()
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
    return TechnoCatPackage.Literals.RD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDItem getLeft()
  {
    if (left != null && left.eIsProxy())
    {
      InternalEObject oldLeft = (InternalEObject)left;
      left = (EDItem)eResolveProxy(oldLeft);
      if (left != oldLeft)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TechnoCatPackage.RD__LEFT, oldLeft, left));
      }
    }
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDItem basicGetLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(EDItem newLeft)
  {
    EDItem oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TechnoCatPackage.RD__LEFT, oldLeft, left));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RTD getRelation()
  {
    if (relation != null && relation.eIsProxy())
    {
      InternalEObject oldRelation = (InternalEObject)relation;
      relation = (RTD)eResolveProxy(oldRelation);
      if (relation != oldRelation)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TechnoCatPackage.RD__RELATION, oldRelation, relation));
      }
    }
    return relation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RTD basicGetRelation()
  {
    return relation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelation(RTD newRelation)
  {
    RTD oldRelation = relation;
    relation = newRelation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TechnoCatPackage.RD__RELATION, oldRelation, relation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDItem getRight()
  {
    if (right != null && right.eIsProxy())
    {
      InternalEObject oldRight = (InternalEObject)right;
      right = (EDItem)eResolveProxy(oldRight);
      if (right != oldRight)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TechnoCatPackage.RD__RIGHT, oldRight, right));
      }
    }
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDItem basicGetRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(EDItem newRight)
  {
    EDItem oldRight = right;
    right = newRight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TechnoCatPackage.RD__RIGHT, oldRight, right));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TechnoCatPackage.RD__VALUE, oldValue, value));
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
      case TechnoCatPackage.RD__LEFT:
        if (resolve) return getLeft();
        return basicGetLeft();
      case TechnoCatPackage.RD__RELATION:
        if (resolve) return getRelation();
        return basicGetRelation();
      case TechnoCatPackage.RD__RIGHT:
        if (resolve) return getRight();
        return basicGetRight();
      case TechnoCatPackage.RD__VALUE:
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
      case TechnoCatPackage.RD__LEFT:
        setLeft((EDItem)newValue);
        return;
      case TechnoCatPackage.RD__RELATION:
        setRelation((RTD)newValue);
        return;
      case TechnoCatPackage.RD__RIGHT:
        setRight((EDItem)newValue);
        return;
      case TechnoCatPackage.RD__VALUE:
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
      case TechnoCatPackage.RD__LEFT:
        setLeft((EDItem)null);
        return;
      case TechnoCatPackage.RD__RELATION:
        setRelation((RTD)null);
        return;
      case TechnoCatPackage.RD__RIGHT:
        setRight((EDItem)null);
        return;
      case TechnoCatPackage.RD__VALUE:
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
      case TechnoCatPackage.RD__LEFT:
        return left != null;
      case TechnoCatPackage.RD__RELATION:
        return relation != null;
      case TechnoCatPackage.RD__RIGHT:
        return right != null;
      case TechnoCatPackage.RD__VALUE:
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

} //RDImpl
