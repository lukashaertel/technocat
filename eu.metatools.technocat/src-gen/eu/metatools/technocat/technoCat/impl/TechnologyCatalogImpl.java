/**
 */
package eu.metatools.technocat.technoCat.impl;

import eu.metatools.technocat.technoCat.ED;
import eu.metatools.technocat.technoCat.ETD;
import eu.metatools.technocat.technoCat.Import;
import eu.metatools.technocat.technoCat.RD;
import eu.metatools.technocat.technoCat.RTD;
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
 *   <li>{@link eu.metatools.technocat.technoCat.impl.TechnologyCatalogImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link eu.metatools.technocat.technoCat.impl.TechnologyCatalogImpl#getEntityTypes <em>Entity Types</em>}</li>
 *   <li>{@link eu.metatools.technocat.technoCat.impl.TechnologyCatalogImpl#getRelationTypes <em>Relation Types</em>}</li>
 *   <li>{@link eu.metatools.technocat.technoCat.impl.TechnologyCatalogImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link eu.metatools.technocat.technoCat.impl.TechnologyCatalogImpl#getRelations <em>Relations</em>}</li>
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
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The cached value of the '{@link #getEntityTypes() <em>Entity Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntityTypes()
   * @generated
   * @ordered
   */
  protected EList<ETD> entityTypes;

  /**
   * The cached value of the '{@link #getRelationTypes() <em>Relation Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationTypes()
   * @generated
   * @ordered
   */
  protected EList<RTD> relationTypes;

  /**
   * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntities()
   * @generated
   * @ordered
   */
  protected EList<ED> entities;

  /**
   * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelations()
   * @generated
   * @ordered
   */
  protected EList<RD> relations;

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
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, TechnoCatPackage.TECHNOLOGY_CATALOG__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ETD> getEntityTypes()
  {
    if (entityTypes == null)
    {
      entityTypes = new EObjectContainmentEList<ETD>(ETD.class, this, TechnoCatPackage.TECHNOLOGY_CATALOG__ENTITY_TYPES);
    }
    return entityTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RTD> getRelationTypes()
  {
    if (relationTypes == null)
    {
      relationTypes = new EObjectContainmentEList<RTD>(RTD.class, this, TechnoCatPackage.TECHNOLOGY_CATALOG__RELATION_TYPES);
    }
    return relationTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ED> getEntities()
  {
    if (entities == null)
    {
      entities = new EObjectContainmentEList<ED>(ED.class, this, TechnoCatPackage.TECHNOLOGY_CATALOG__ENTITIES);
    }
    return entities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RD> getRelations()
  {
    if (relations == null)
    {
      relations = new EObjectContainmentEList<RD>(RD.class, this, TechnoCatPackage.TECHNOLOGY_CATALOG__RELATIONS);
    }
    return relations;
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
      case TechnoCatPackage.TECHNOLOGY_CATALOG__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case TechnoCatPackage.TECHNOLOGY_CATALOG__ENTITY_TYPES:
        return ((InternalEList<?>)getEntityTypes()).basicRemove(otherEnd, msgs);
      case TechnoCatPackage.TECHNOLOGY_CATALOG__RELATION_TYPES:
        return ((InternalEList<?>)getRelationTypes()).basicRemove(otherEnd, msgs);
      case TechnoCatPackage.TECHNOLOGY_CATALOG__ENTITIES:
        return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
      case TechnoCatPackage.TECHNOLOGY_CATALOG__RELATIONS:
        return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
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
      case TechnoCatPackage.TECHNOLOGY_CATALOG__IMPORTS:
        return getImports();
      case TechnoCatPackage.TECHNOLOGY_CATALOG__ENTITY_TYPES:
        return getEntityTypes();
      case TechnoCatPackage.TECHNOLOGY_CATALOG__RELATION_TYPES:
        return getRelationTypes();
      case TechnoCatPackage.TECHNOLOGY_CATALOG__ENTITIES:
        return getEntities();
      case TechnoCatPackage.TECHNOLOGY_CATALOG__RELATIONS:
        return getRelations();
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
      case TechnoCatPackage.TECHNOLOGY_CATALOG__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case TechnoCatPackage.TECHNOLOGY_CATALOG__ENTITY_TYPES:
        getEntityTypes().clear();
        getEntityTypes().addAll((Collection<? extends ETD>)newValue);
        return;
      case TechnoCatPackage.TECHNOLOGY_CATALOG__RELATION_TYPES:
        getRelationTypes().clear();
        getRelationTypes().addAll((Collection<? extends RTD>)newValue);
        return;
      case TechnoCatPackage.TECHNOLOGY_CATALOG__ENTITIES:
        getEntities().clear();
        getEntities().addAll((Collection<? extends ED>)newValue);
        return;
      case TechnoCatPackage.TECHNOLOGY_CATALOG__RELATIONS:
        getRelations().clear();
        getRelations().addAll((Collection<? extends RD>)newValue);
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
      case TechnoCatPackage.TECHNOLOGY_CATALOG__IMPORTS:
        getImports().clear();
        return;
      case TechnoCatPackage.TECHNOLOGY_CATALOG__ENTITY_TYPES:
        getEntityTypes().clear();
        return;
      case TechnoCatPackage.TECHNOLOGY_CATALOG__RELATION_TYPES:
        getRelationTypes().clear();
        return;
      case TechnoCatPackage.TECHNOLOGY_CATALOG__ENTITIES:
        getEntities().clear();
        return;
      case TechnoCatPackage.TECHNOLOGY_CATALOG__RELATIONS:
        getRelations().clear();
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
      case TechnoCatPackage.TECHNOLOGY_CATALOG__IMPORTS:
        return imports != null && !imports.isEmpty();
      case TechnoCatPackage.TECHNOLOGY_CATALOG__ENTITY_TYPES:
        return entityTypes != null && !entityTypes.isEmpty();
      case TechnoCatPackage.TECHNOLOGY_CATALOG__RELATION_TYPES:
        return relationTypes != null && !relationTypes.isEmpty();
      case TechnoCatPackage.TECHNOLOGY_CATALOG__ENTITIES:
        return entities != null && !entities.isEmpty();
      case TechnoCatPackage.TECHNOLOGY_CATALOG__RELATIONS:
        return relations != null && !relations.isEmpty();
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
