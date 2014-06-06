/**
 */
package eu.metatools.technocat.technoCat.impl;

import eu.metatools.technocat.technoCat.DefinitionElement;
import eu.metatools.technocat.technoCat.EDItem;
import eu.metatools.technocat.technoCat.Element;
import eu.metatools.technocat.technoCat.Import;
import eu.metatools.technocat.technoCat.InstanceElement;
import eu.metatools.technocat.technoCat.ModelElement;
import eu.metatools.technocat.technoCat.RTDItem;
import eu.metatools.technocat.technoCat.TechnoCatFactory;
import eu.metatools.technocat.technoCat.TechnoCatPackage;
import eu.metatools.technocat.technoCat.TechnologyCatalog;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TechnoCatPackageImpl extends EPackageImpl implements TechnoCatPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass technologyCatalogEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass definitionElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instanceElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass etdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rtdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rtdItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass edEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass edItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rdEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see eu.metatools.technocat.technoCat.TechnoCatPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private TechnoCatPackageImpl()
  {
    super(eNS_URI, TechnoCatFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link TechnoCatPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static TechnoCatPackage init()
  {
    if (isInited) return (TechnoCatPackage)EPackage.Registry.INSTANCE.getEPackage(TechnoCatPackage.eNS_URI);

    // Obtain or create and register package
    TechnoCatPackageImpl theTechnoCatPackage = (TechnoCatPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TechnoCatPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TechnoCatPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theTechnoCatPackage.createPackageContents();

    // Initialize created meta-data
    theTechnoCatPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theTechnoCatPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(TechnoCatPackage.eNS_URI, theTechnoCatPackage);
    return theTechnoCatPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTechnologyCatalog()
  {
    return technologyCatalogEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTechnologyCatalog_Name()
  {
    return (EAttribute)technologyCatalogEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTechnologyCatalog_Imports()
  {
    return (EReference)technologyCatalogEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTechnologyCatalog_EntityTypes()
  {
    return (EReference)technologyCatalogEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTechnologyCatalog_RelationTypes()
  {
    return (EReference)technologyCatalogEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTechnologyCatalog_Entities()
  {
    return (EReference)technologyCatalogEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTechnologyCatalog_Relations()
  {
    return (EReference)technologyCatalogEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElement()
  {
    return elementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImport_Ref()
  {
    return (EReference)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelElement()
  {
    return modelElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefinitionElement()
  {
    return definitionElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDefinitionElement_Name()
  {
    return (EAttribute)definitionElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDefinitionElement_Value()
  {
    return (EAttribute)definitionElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstanceElement()
  {
    return instanceElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getETD()
  {
    return etdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getETD_Bases()
  {
    return (EReference)etdEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRTD()
  {
    return rtdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRTD_Bases()
  {
    return (EReference)rtdEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRTD_Items()
  {
    return (EReference)rtdEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRTDItem()
  {
    return rtdItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRTDItem_Domain()
  {
    return (EReference)rtdItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRTDItem_Codomain()
  {
    return (EReference)rtdItemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRTDItem_Value()
  {
    return (EAttribute)rtdItemEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getED()
  {
    return edEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getED_Type()
  {
    return (EReference)edEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getED_Items()
  {
    return (EReference)edEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEDItem()
  {
    return edItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEDItem_Name()
  {
    return (EAttribute)edItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEDItem_Value()
  {
    return (EAttribute)edItemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRD()
  {
    return rdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRD_Left()
  {
    return (EReference)rdEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRD_Relation()
  {
    return (EReference)rdEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRD_Right()
  {
    return (EReference)rdEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRD_Value()
  {
    return (EAttribute)rdEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TechnoCatFactory getTechnoCatFactory()
  {
    return (TechnoCatFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    technologyCatalogEClass = createEClass(TECHNOLOGY_CATALOG);
    createEAttribute(technologyCatalogEClass, TECHNOLOGY_CATALOG__NAME);
    createEReference(technologyCatalogEClass, TECHNOLOGY_CATALOG__IMPORTS);
    createEReference(technologyCatalogEClass, TECHNOLOGY_CATALOG__ENTITY_TYPES);
    createEReference(technologyCatalogEClass, TECHNOLOGY_CATALOG__RELATION_TYPES);
    createEReference(technologyCatalogEClass, TECHNOLOGY_CATALOG__ENTITIES);
    createEReference(technologyCatalogEClass, TECHNOLOGY_CATALOG__RELATIONS);

    elementEClass = createEClass(ELEMENT);

    importEClass = createEClass(IMPORT);
    createEReference(importEClass, IMPORT__REF);

    modelElementEClass = createEClass(MODEL_ELEMENT);

    definitionElementEClass = createEClass(DEFINITION_ELEMENT);
    createEAttribute(definitionElementEClass, DEFINITION_ELEMENT__NAME);
    createEAttribute(definitionElementEClass, DEFINITION_ELEMENT__VALUE);

    instanceElementEClass = createEClass(INSTANCE_ELEMENT);

    etdEClass = createEClass(ETD);
    createEReference(etdEClass, ETD__BASES);

    rtdEClass = createEClass(RTD);
    createEReference(rtdEClass, RTD__BASES);
    createEReference(rtdEClass, RTD__ITEMS);

    rtdItemEClass = createEClass(RTD_ITEM);
    createEReference(rtdItemEClass, RTD_ITEM__DOMAIN);
    createEReference(rtdItemEClass, RTD_ITEM__CODOMAIN);
    createEAttribute(rtdItemEClass, RTD_ITEM__VALUE);

    edEClass = createEClass(ED);
    createEReference(edEClass, ED__TYPE);
    createEReference(edEClass, ED__ITEMS);

    edItemEClass = createEClass(ED_ITEM);
    createEAttribute(edItemEClass, ED_ITEM__NAME);
    createEAttribute(edItemEClass, ED_ITEM__VALUE);

    rdEClass = createEClass(RD);
    createEReference(rdEClass, RD__LEFT);
    createEReference(rdEClass, RD__RELATION);
    createEReference(rdEClass, RD__RIGHT);
    createEAttribute(rdEClass, RD__VALUE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    importEClass.getESuperTypes().add(this.getElement());
    modelElementEClass.getESuperTypes().add(this.getElement());
    definitionElementEClass.getESuperTypes().add(this.getModelElement());
    instanceElementEClass.getESuperTypes().add(this.getModelElement());
    etdEClass.getESuperTypes().add(this.getDefinitionElement());
    rtdEClass.getESuperTypes().add(this.getDefinitionElement());
    edEClass.getESuperTypes().add(this.getInstanceElement());
    rdEClass.getESuperTypes().add(this.getInstanceElement());

    // Initialize classes and features; add operations and parameters
    initEClass(technologyCatalogEClass, TechnologyCatalog.class, "TechnologyCatalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTechnologyCatalog_Name(), ecorePackage.getEString(), "name", null, 0, 1, TechnologyCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTechnologyCatalog_Imports(), this.getImport(), null, "imports", null, 0, -1, TechnologyCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTechnologyCatalog_EntityTypes(), this.getETD(), null, "entityTypes", null, 0, -1, TechnologyCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTechnologyCatalog_RelationTypes(), this.getRTD(), null, "relationTypes", null, 0, -1, TechnologyCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTechnologyCatalog_Entities(), this.getED(), null, "entities", null, 0, -1, TechnologyCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTechnologyCatalog_Relations(), this.getRD(), null, "relations", null, 0, -1, TechnologyCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getImport_Ref(), this.getTechnologyCatalog(), null, "ref", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modelElementEClass, ModelElement.class, "ModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(definitionElementEClass, DefinitionElement.class, "DefinitionElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDefinitionElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, DefinitionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDefinitionElement_Value(), ecorePackage.getEString(), "value", null, 0, 1, DefinitionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instanceElementEClass, InstanceElement.class, "InstanceElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(etdEClass, eu.metatools.technocat.technoCat.ETD.class, "ETD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getETD_Bases(), this.getETD(), null, "bases", null, 0, -1, eu.metatools.technocat.technoCat.ETD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rtdEClass, eu.metatools.technocat.technoCat.RTD.class, "RTD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRTD_Bases(), this.getRTD(), null, "bases", null, 0, -1, eu.metatools.technocat.technoCat.RTD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRTD_Items(), this.getRTDItem(), null, "items", null, 0, -1, eu.metatools.technocat.technoCat.RTD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rtdItemEClass, RTDItem.class, "RTDItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRTDItem_Domain(), this.getETD(), null, "domain", null, 0, 1, RTDItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRTDItem_Codomain(), this.getETD(), null, "codomain", null, 0, 1, RTDItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRTDItem_Value(), ecorePackage.getEString(), "value", null, 0, 1, RTDItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(edEClass, eu.metatools.technocat.technoCat.ED.class, "ED", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getED_Type(), this.getETD(), null, "type", null, 0, 1, eu.metatools.technocat.technoCat.ED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getED_Items(), this.getEDItem(), null, "items", null, 0, -1, eu.metatools.technocat.technoCat.ED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(edItemEClass, EDItem.class, "EDItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEDItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, EDItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEDItem_Value(), ecorePackage.getEString(), "value", null, 0, 1, EDItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rdEClass, eu.metatools.technocat.technoCat.RD.class, "RD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRD_Left(), this.getEDItem(), null, "left", null, 0, 1, eu.metatools.technocat.technoCat.RD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRD_Relation(), this.getRTD(), null, "relation", null, 0, 1, eu.metatools.technocat.technoCat.RD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRD_Right(), this.getEDItem(), null, "right", null, 0, 1, eu.metatools.technocat.technoCat.RD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRD_Value(), ecorePackage.getEString(), "value", null, 0, 1, eu.metatools.technocat.technoCat.RD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //TechnoCatPackageImpl
