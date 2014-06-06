/**
 */
package eu.metatools.technocat.technoCat;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eu.metatools.technocat.technoCat.TechnoCatFactory
 * @model kind="package"
 * @generated
 */
public interface TechnoCatPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "technoCat";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.metatools.eu/technocat/TechnoCat";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "technoCat";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TechnoCatPackage eINSTANCE = eu.metatools.technocat.technoCat.impl.TechnoCatPackageImpl.init();

  /**
   * The meta object id for the '{@link eu.metatools.technocat.technoCat.impl.TechnologyCatalogImpl <em>Technology Catalog</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.metatools.technocat.technoCat.impl.TechnologyCatalogImpl
   * @see eu.metatools.technocat.technoCat.impl.TechnoCatPackageImpl#getTechnologyCatalog()
   * @generated
   */
  int TECHNOLOGY_CATALOG = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TECHNOLOGY_CATALOG__NAME = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TECHNOLOGY_CATALOG__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Entity Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TECHNOLOGY_CATALOG__ENTITY_TYPES = 2;

  /**
   * The feature id for the '<em><b>Relation Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TECHNOLOGY_CATALOG__RELATION_TYPES = 3;

  /**
   * The feature id for the '<em><b>Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TECHNOLOGY_CATALOG__ENTITIES = 4;

  /**
   * The feature id for the '<em><b>Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TECHNOLOGY_CATALOG__RELATIONS = 5;

  /**
   * The number of structural features of the '<em>Technology Catalog</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TECHNOLOGY_CATALOG_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link eu.metatools.technocat.technoCat.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.metatools.technocat.technoCat.impl.ElementImpl
   * @see eu.metatools.technocat.technoCat.impl.TechnoCatPackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 1;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link eu.metatools.technocat.technoCat.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.metatools.technocat.technoCat.impl.ImportImpl
   * @see eu.metatools.technocat.technoCat.impl.TechnoCatPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 2;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__REF = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.metatools.technocat.technoCat.impl.ModelElementImpl <em>Model Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.metatools.technocat.technoCat.impl.ModelElementImpl
   * @see eu.metatools.technocat.technoCat.impl.TechnoCatPackageImpl#getModelElement()
   * @generated
   */
  int MODEL_ELEMENT = 3;

  /**
   * The number of structural features of the '<em>Model Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.metatools.technocat.technoCat.impl.DefinitionElementImpl <em>Definition Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.metatools.technocat.technoCat.impl.DefinitionElementImpl
   * @see eu.metatools.technocat.technoCat.impl.TechnoCatPackageImpl#getDefinitionElement()
   * @generated
   */
  int DEFINITION_ELEMENT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION_ELEMENT__NAME = MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION_ELEMENT__VALUE = MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Definition Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION_ELEMENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.metatools.technocat.technoCat.impl.InstanceElementImpl <em>Instance Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.metatools.technocat.technoCat.impl.InstanceElementImpl
   * @see eu.metatools.technocat.technoCat.impl.TechnoCatPackageImpl#getInstanceElement()
   * @generated
   */
  int INSTANCE_ELEMENT = 5;

  /**
   * The number of structural features of the '<em>Instance Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_ELEMENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.metatools.technocat.technoCat.impl.ETDImpl <em>ETD</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.metatools.technocat.technoCat.impl.ETDImpl
   * @see eu.metatools.technocat.technoCat.impl.TechnoCatPackageImpl#getETD()
   * @generated
   */
  int ETD = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ETD__NAME = DEFINITION_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ETD__VALUE = DEFINITION_ELEMENT__VALUE;

  /**
   * The feature id for the '<em><b>Bases</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ETD__BASES = DEFINITION_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ETD</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ETD_FEATURE_COUNT = DEFINITION_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.metatools.technocat.technoCat.impl.RTDImpl <em>RTD</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.metatools.technocat.technoCat.impl.RTDImpl
   * @see eu.metatools.technocat.technoCat.impl.TechnoCatPackageImpl#getRTD()
   * @generated
   */
  int RTD = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RTD__NAME = DEFINITION_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RTD__VALUE = DEFINITION_ELEMENT__VALUE;

  /**
   * The feature id for the '<em><b>Bases</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RTD__BASES = DEFINITION_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RTD__ITEMS = DEFINITION_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>RTD</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RTD_FEATURE_COUNT = DEFINITION_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.metatools.technocat.technoCat.impl.RTDItemImpl <em>RTD Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.metatools.technocat.technoCat.impl.RTDItemImpl
   * @see eu.metatools.technocat.technoCat.impl.TechnoCatPackageImpl#getRTDItem()
   * @generated
   */
  int RTD_ITEM = 8;

  /**
   * The feature id for the '<em><b>Domain</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RTD_ITEM__DOMAIN = 0;

  /**
   * The feature id for the '<em><b>Codomain</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RTD_ITEM__CODOMAIN = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RTD_ITEM__VALUE = 2;

  /**
   * The number of structural features of the '<em>RTD Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RTD_ITEM_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link eu.metatools.technocat.technoCat.impl.EDImpl <em>ED</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.metatools.technocat.technoCat.impl.EDImpl
   * @see eu.metatools.technocat.technoCat.impl.TechnoCatPackageImpl#getED()
   * @generated
   */
  int ED = 9;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ED__TYPE = INSTANCE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ED__ITEMS = INSTANCE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ED</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ED_FEATURE_COUNT = INSTANCE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.metatools.technocat.technoCat.impl.EDItemImpl <em>ED Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.metatools.technocat.technoCat.impl.EDItemImpl
   * @see eu.metatools.technocat.technoCat.impl.TechnoCatPackageImpl#getEDItem()
   * @generated
   */
  int ED_ITEM = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ED_ITEM__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ED_ITEM__VALUE = 1;

  /**
   * The number of structural features of the '<em>ED Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ED_ITEM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link eu.metatools.technocat.technoCat.impl.RDImpl <em>RD</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.metatools.technocat.technoCat.impl.RDImpl
   * @see eu.metatools.technocat.technoCat.impl.TechnoCatPackageImpl#getRD()
   * @generated
   */
  int RD = 11;

  /**
   * The feature id for the '<em><b>Left</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RD__LEFT = INSTANCE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Relation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RD__RELATION = INSTANCE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RD__RIGHT = INSTANCE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RD__VALUE = INSTANCE_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>RD</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RD_FEATURE_COUNT = INSTANCE_ELEMENT_FEATURE_COUNT + 4;


  /**
   * Returns the meta object for class '{@link eu.metatools.technocat.technoCat.TechnologyCatalog <em>Technology Catalog</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Technology Catalog</em>'.
   * @see eu.metatools.technocat.technoCat.TechnologyCatalog
   * @generated
   */
  EClass getTechnologyCatalog();

  /**
   * Returns the meta object for the attribute '{@link eu.metatools.technocat.technoCat.TechnologyCatalog#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.metatools.technocat.technoCat.TechnologyCatalog#getName()
   * @see #getTechnologyCatalog()
   * @generated
   */
  EAttribute getTechnologyCatalog_Name();

  /**
   * Returns the meta object for the containment reference list '{@link eu.metatools.technocat.technoCat.TechnologyCatalog#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see eu.metatools.technocat.technoCat.TechnologyCatalog#getImports()
   * @see #getTechnologyCatalog()
   * @generated
   */
  EReference getTechnologyCatalog_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link eu.metatools.technocat.technoCat.TechnologyCatalog#getEntityTypes <em>Entity Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entity Types</em>'.
   * @see eu.metatools.technocat.technoCat.TechnologyCatalog#getEntityTypes()
   * @see #getTechnologyCatalog()
   * @generated
   */
  EReference getTechnologyCatalog_EntityTypes();

  /**
   * Returns the meta object for the containment reference list '{@link eu.metatools.technocat.technoCat.TechnologyCatalog#getRelationTypes <em>Relation Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Relation Types</em>'.
   * @see eu.metatools.technocat.technoCat.TechnologyCatalog#getRelationTypes()
   * @see #getTechnologyCatalog()
   * @generated
   */
  EReference getTechnologyCatalog_RelationTypes();

  /**
   * Returns the meta object for the containment reference list '{@link eu.metatools.technocat.technoCat.TechnologyCatalog#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entities</em>'.
   * @see eu.metatools.technocat.technoCat.TechnologyCatalog#getEntities()
   * @see #getTechnologyCatalog()
   * @generated
   */
  EReference getTechnologyCatalog_Entities();

  /**
   * Returns the meta object for the containment reference list '{@link eu.metatools.technocat.technoCat.TechnologyCatalog#getRelations <em>Relations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Relations</em>'.
   * @see eu.metatools.technocat.technoCat.TechnologyCatalog#getRelations()
   * @see #getTechnologyCatalog()
   * @generated
   */
  EReference getTechnologyCatalog_Relations();

  /**
   * Returns the meta object for class '{@link eu.metatools.technocat.technoCat.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see eu.metatools.technocat.technoCat.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for class '{@link eu.metatools.technocat.technoCat.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see eu.metatools.technocat.technoCat.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the reference '{@link eu.metatools.technocat.technoCat.Import#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see eu.metatools.technocat.technoCat.Import#getRef()
   * @see #getImport()
   * @generated
   */
  EReference getImport_Ref();

  /**
   * Returns the meta object for class '{@link eu.metatools.technocat.technoCat.ModelElement <em>Model Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Element</em>'.
   * @see eu.metatools.technocat.technoCat.ModelElement
   * @generated
   */
  EClass getModelElement();

  /**
   * Returns the meta object for class '{@link eu.metatools.technocat.technoCat.DefinitionElement <em>Definition Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Definition Element</em>'.
   * @see eu.metatools.technocat.technoCat.DefinitionElement
   * @generated
   */
  EClass getDefinitionElement();

  /**
   * Returns the meta object for the attribute '{@link eu.metatools.technocat.technoCat.DefinitionElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.metatools.technocat.technoCat.DefinitionElement#getName()
   * @see #getDefinitionElement()
   * @generated
   */
  EAttribute getDefinitionElement_Name();

  /**
   * Returns the meta object for the attribute '{@link eu.metatools.technocat.technoCat.DefinitionElement#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see eu.metatools.technocat.technoCat.DefinitionElement#getValue()
   * @see #getDefinitionElement()
   * @generated
   */
  EAttribute getDefinitionElement_Value();

  /**
   * Returns the meta object for class '{@link eu.metatools.technocat.technoCat.InstanceElement <em>Instance Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instance Element</em>'.
   * @see eu.metatools.technocat.technoCat.InstanceElement
   * @generated
   */
  EClass getInstanceElement();

  /**
   * Returns the meta object for class '{@link eu.metatools.technocat.technoCat.ETD <em>ETD</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ETD</em>'.
   * @see eu.metatools.technocat.technoCat.ETD
   * @generated
   */
  EClass getETD();

  /**
   * Returns the meta object for the reference list '{@link eu.metatools.technocat.technoCat.ETD#getBases <em>Bases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Bases</em>'.
   * @see eu.metatools.technocat.technoCat.ETD#getBases()
   * @see #getETD()
   * @generated
   */
  EReference getETD_Bases();

  /**
   * Returns the meta object for class '{@link eu.metatools.technocat.technoCat.RTD <em>RTD</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RTD</em>'.
   * @see eu.metatools.technocat.technoCat.RTD
   * @generated
   */
  EClass getRTD();

  /**
   * Returns the meta object for the reference list '{@link eu.metatools.technocat.technoCat.RTD#getBases <em>Bases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Bases</em>'.
   * @see eu.metatools.technocat.technoCat.RTD#getBases()
   * @see #getRTD()
   * @generated
   */
  EReference getRTD_Bases();

  /**
   * Returns the meta object for the containment reference list '{@link eu.metatools.technocat.technoCat.RTD#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see eu.metatools.technocat.technoCat.RTD#getItems()
   * @see #getRTD()
   * @generated
   */
  EReference getRTD_Items();

  /**
   * Returns the meta object for class '{@link eu.metatools.technocat.technoCat.RTDItem <em>RTD Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RTD Item</em>'.
   * @see eu.metatools.technocat.technoCat.RTDItem
   * @generated
   */
  EClass getRTDItem();

  /**
   * Returns the meta object for the reference '{@link eu.metatools.technocat.technoCat.RTDItem#getDomain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Domain</em>'.
   * @see eu.metatools.technocat.technoCat.RTDItem#getDomain()
   * @see #getRTDItem()
   * @generated
   */
  EReference getRTDItem_Domain();

  /**
   * Returns the meta object for the reference '{@link eu.metatools.technocat.technoCat.RTDItem#getCodomain <em>Codomain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Codomain</em>'.
   * @see eu.metatools.technocat.technoCat.RTDItem#getCodomain()
   * @see #getRTDItem()
   * @generated
   */
  EReference getRTDItem_Codomain();

  /**
   * Returns the meta object for the attribute '{@link eu.metatools.technocat.technoCat.RTDItem#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see eu.metatools.technocat.technoCat.RTDItem#getValue()
   * @see #getRTDItem()
   * @generated
   */
  EAttribute getRTDItem_Value();

  /**
   * Returns the meta object for class '{@link eu.metatools.technocat.technoCat.ED <em>ED</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ED</em>'.
   * @see eu.metatools.technocat.technoCat.ED
   * @generated
   */
  EClass getED();

  /**
   * Returns the meta object for the reference '{@link eu.metatools.technocat.technoCat.ED#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see eu.metatools.technocat.technoCat.ED#getType()
   * @see #getED()
   * @generated
   */
  EReference getED_Type();

  /**
   * Returns the meta object for the containment reference list '{@link eu.metatools.technocat.technoCat.ED#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see eu.metatools.technocat.technoCat.ED#getItems()
   * @see #getED()
   * @generated
   */
  EReference getED_Items();

  /**
   * Returns the meta object for class '{@link eu.metatools.technocat.technoCat.EDItem <em>ED Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ED Item</em>'.
   * @see eu.metatools.technocat.technoCat.EDItem
   * @generated
   */
  EClass getEDItem();

  /**
   * Returns the meta object for the attribute '{@link eu.metatools.technocat.technoCat.EDItem#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.metatools.technocat.technoCat.EDItem#getName()
   * @see #getEDItem()
   * @generated
   */
  EAttribute getEDItem_Name();

  /**
   * Returns the meta object for the attribute '{@link eu.metatools.technocat.technoCat.EDItem#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see eu.metatools.technocat.technoCat.EDItem#getValue()
   * @see #getEDItem()
   * @generated
   */
  EAttribute getEDItem_Value();

  /**
   * Returns the meta object for class '{@link eu.metatools.technocat.technoCat.RD <em>RD</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RD</em>'.
   * @see eu.metatools.technocat.technoCat.RD
   * @generated
   */
  EClass getRD();

  /**
   * Returns the meta object for the reference '{@link eu.metatools.technocat.technoCat.RD#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Left</em>'.
   * @see eu.metatools.technocat.technoCat.RD#getLeft()
   * @see #getRD()
   * @generated
   */
  EReference getRD_Left();

  /**
   * Returns the meta object for the reference '{@link eu.metatools.technocat.technoCat.RD#getRelation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Relation</em>'.
   * @see eu.metatools.technocat.technoCat.RD#getRelation()
   * @see #getRD()
   * @generated
   */
  EReference getRD_Relation();

  /**
   * Returns the meta object for the reference '{@link eu.metatools.technocat.technoCat.RD#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Right</em>'.
   * @see eu.metatools.technocat.technoCat.RD#getRight()
   * @see #getRD()
   * @generated
   */
  EReference getRD_Right();

  /**
   * Returns the meta object for the attribute '{@link eu.metatools.technocat.technoCat.RD#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see eu.metatools.technocat.technoCat.RD#getValue()
   * @see #getRD()
   * @generated
   */
  EAttribute getRD_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TechnoCatFactory getTechnoCatFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link eu.metatools.technocat.technoCat.impl.TechnologyCatalogImpl <em>Technology Catalog</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.metatools.technocat.technoCat.impl.TechnologyCatalogImpl
     * @see eu.metatools.technocat.technoCat.impl.TechnoCatPackageImpl#getTechnologyCatalog()
     * @generated
     */
    EClass TECHNOLOGY_CATALOG = eINSTANCE.getTechnologyCatalog();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TECHNOLOGY_CATALOG__NAME = eINSTANCE.getTechnologyCatalog_Name();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TECHNOLOGY_CATALOG__IMPORTS = eINSTANCE.getTechnologyCatalog_Imports();

    /**
     * The meta object literal for the '<em><b>Entity Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TECHNOLOGY_CATALOG__ENTITY_TYPES = eINSTANCE.getTechnologyCatalog_EntityTypes();

    /**
     * The meta object literal for the '<em><b>Relation Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TECHNOLOGY_CATALOG__RELATION_TYPES = eINSTANCE.getTechnologyCatalog_RelationTypes();

    /**
     * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TECHNOLOGY_CATALOG__ENTITIES = eINSTANCE.getTechnologyCatalog_Entities();

    /**
     * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TECHNOLOGY_CATALOG__RELATIONS = eINSTANCE.getTechnologyCatalog_Relations();

    /**
     * The meta object literal for the '{@link eu.metatools.technocat.technoCat.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.metatools.technocat.technoCat.impl.ElementImpl
     * @see eu.metatools.technocat.technoCat.impl.TechnoCatPackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '{@link eu.metatools.technocat.technoCat.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.metatools.technocat.technoCat.impl.ImportImpl
     * @see eu.metatools.technocat.technoCat.impl.TechnoCatPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPORT__REF = eINSTANCE.getImport_Ref();

    /**
     * The meta object literal for the '{@link eu.metatools.technocat.technoCat.impl.ModelElementImpl <em>Model Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.metatools.technocat.technoCat.impl.ModelElementImpl
     * @see eu.metatools.technocat.technoCat.impl.TechnoCatPackageImpl#getModelElement()
     * @generated
     */
    EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

    /**
     * The meta object literal for the '{@link eu.metatools.technocat.technoCat.impl.DefinitionElementImpl <em>Definition Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.metatools.technocat.technoCat.impl.DefinitionElementImpl
     * @see eu.metatools.technocat.technoCat.impl.TechnoCatPackageImpl#getDefinitionElement()
     * @generated
     */
    EClass DEFINITION_ELEMENT = eINSTANCE.getDefinitionElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFINITION_ELEMENT__NAME = eINSTANCE.getDefinitionElement_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFINITION_ELEMENT__VALUE = eINSTANCE.getDefinitionElement_Value();

    /**
     * The meta object literal for the '{@link eu.metatools.technocat.technoCat.impl.InstanceElementImpl <em>Instance Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.metatools.technocat.technoCat.impl.InstanceElementImpl
     * @see eu.metatools.technocat.technoCat.impl.TechnoCatPackageImpl#getInstanceElement()
     * @generated
     */
    EClass INSTANCE_ELEMENT = eINSTANCE.getInstanceElement();

    /**
     * The meta object literal for the '{@link eu.metatools.technocat.technoCat.impl.ETDImpl <em>ETD</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.metatools.technocat.technoCat.impl.ETDImpl
     * @see eu.metatools.technocat.technoCat.impl.TechnoCatPackageImpl#getETD()
     * @generated
     */
    EClass ETD = eINSTANCE.getETD();

    /**
     * The meta object literal for the '<em><b>Bases</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ETD__BASES = eINSTANCE.getETD_Bases();

    /**
     * The meta object literal for the '{@link eu.metatools.technocat.technoCat.impl.RTDImpl <em>RTD</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.metatools.technocat.technoCat.impl.RTDImpl
     * @see eu.metatools.technocat.technoCat.impl.TechnoCatPackageImpl#getRTD()
     * @generated
     */
    EClass RTD = eINSTANCE.getRTD();

    /**
     * The meta object literal for the '<em><b>Bases</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RTD__BASES = eINSTANCE.getRTD_Bases();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RTD__ITEMS = eINSTANCE.getRTD_Items();

    /**
     * The meta object literal for the '{@link eu.metatools.technocat.technoCat.impl.RTDItemImpl <em>RTD Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.metatools.technocat.technoCat.impl.RTDItemImpl
     * @see eu.metatools.technocat.technoCat.impl.TechnoCatPackageImpl#getRTDItem()
     * @generated
     */
    EClass RTD_ITEM = eINSTANCE.getRTDItem();

    /**
     * The meta object literal for the '<em><b>Domain</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RTD_ITEM__DOMAIN = eINSTANCE.getRTDItem_Domain();

    /**
     * The meta object literal for the '<em><b>Codomain</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RTD_ITEM__CODOMAIN = eINSTANCE.getRTDItem_Codomain();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RTD_ITEM__VALUE = eINSTANCE.getRTDItem_Value();

    /**
     * The meta object literal for the '{@link eu.metatools.technocat.technoCat.impl.EDImpl <em>ED</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.metatools.technocat.technoCat.impl.EDImpl
     * @see eu.metatools.technocat.technoCat.impl.TechnoCatPackageImpl#getED()
     * @generated
     */
    EClass ED = eINSTANCE.getED();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ED__TYPE = eINSTANCE.getED_Type();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ED__ITEMS = eINSTANCE.getED_Items();

    /**
     * The meta object literal for the '{@link eu.metatools.technocat.technoCat.impl.EDItemImpl <em>ED Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.metatools.technocat.technoCat.impl.EDItemImpl
     * @see eu.metatools.technocat.technoCat.impl.TechnoCatPackageImpl#getEDItem()
     * @generated
     */
    EClass ED_ITEM = eINSTANCE.getEDItem();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ED_ITEM__NAME = eINSTANCE.getEDItem_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ED_ITEM__VALUE = eINSTANCE.getEDItem_Value();

    /**
     * The meta object literal for the '{@link eu.metatools.technocat.technoCat.impl.RDImpl <em>RD</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.metatools.technocat.technoCat.impl.RDImpl
     * @see eu.metatools.technocat.technoCat.impl.TechnoCatPackageImpl#getRD()
     * @generated
     */
    EClass RD = eINSTANCE.getRD();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RD__LEFT = eINSTANCE.getRD_Left();

    /**
     * The meta object literal for the '<em><b>Relation</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RD__RELATION = eINSTANCE.getRD_Relation();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RD__RIGHT = eINSTANCE.getRD_Right();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RD__VALUE = eINSTANCE.getRD_Value();

  }

} //TechnoCatPackage
