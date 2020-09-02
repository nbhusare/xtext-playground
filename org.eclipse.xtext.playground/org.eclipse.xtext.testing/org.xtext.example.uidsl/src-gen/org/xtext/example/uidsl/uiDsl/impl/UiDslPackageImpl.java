/**
 * generated by Xtext 2.22.0
 */
package org.xtext.example.uidsl.uiDsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.example.modeldsl.modelDsl.ModelDslPackage;

import org.xtext.example.uidsl.uiDsl.UiDslFactory;
import org.xtext.example.uidsl.uiDsl.UiDslPackage;
import org.xtext.example.uidsl.uiDsl.UiModel;
import org.xtext.example.uidsl.uiDsl.UiModelFile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UiDslPackageImpl extends EPackageImpl implements UiDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uiModelFileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uiModelEClass = null;

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
   * @see org.xtext.example.uidsl.uiDsl.UiDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private UiDslPackageImpl()
  {
    super(eNS_URI, UiDslFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link UiDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static UiDslPackage init()
  {
    if (isInited) return (UiDslPackage)EPackage.Registry.INSTANCE.getEPackage(UiDslPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredUiDslPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    UiDslPackageImpl theUiDslPackage = registeredUiDslPackage instanceof UiDslPackageImpl ? (UiDslPackageImpl)registeredUiDslPackage : new UiDslPackageImpl();

    isInited = true;

    // Initialize simple dependencies
    ModelDslPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theUiDslPackage.createPackageContents();

    // Initialize created meta-data
    theUiDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theUiDslPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(UiDslPackage.eNS_URI, theUiDslPackage);
    return theUiDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getUiModelFile()
  {
    return uiModelFileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getUiModelFile_UiModels()
  {
    return (EReference)uiModelFileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getUiModel()
  {
    return uiModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getUiModel_Name()
  {
    return (EAttribute)uiModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getUiModel_Model()
  {
    return (EReference)uiModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UiDslFactory getUiDslFactory()
  {
    return (UiDslFactory)getEFactoryInstance();
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
    uiModelFileEClass = createEClass(UI_MODEL_FILE);
    createEReference(uiModelFileEClass, UI_MODEL_FILE__UI_MODELS);

    uiModelEClass = createEClass(UI_MODEL);
    createEAttribute(uiModelEClass, UI_MODEL__NAME);
    createEReference(uiModelEClass, UI_MODEL__MODEL);
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

    // Obtain other dependent packages
    ModelDslPackage theModelDslPackage = (ModelDslPackage)EPackage.Registry.INSTANCE.getEPackage(ModelDslPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(uiModelFileEClass, UiModelFile.class, "UiModelFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUiModelFile_UiModels(), this.getUiModel(), null, "uiModels", null, 0, -1, UiModelFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uiModelEClass, UiModel.class, "UiModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUiModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, UiModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUiModel_Model(), theModelDslPackage.getModel(), null, "model", null, 0, 1, UiModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //UiDslPackageImpl