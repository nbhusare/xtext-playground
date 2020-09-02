/**
 * generated by Xtext 2.22.0
 */
package org.xtext.example.uidsl.uiDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.uidsl.uiDsl.UiDslPackage;
import org.xtext.example.uidsl.uiDsl.UiModel;
import org.xtext.example.uidsl.uiDsl.UiModelFile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ui Model File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.uidsl.uiDsl.impl.UiModelFileImpl#getUiModels <em>Ui Models</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UiModelFileImpl extends MinimalEObjectImpl.Container implements UiModelFile
{
  /**
   * The cached value of the '{@link #getUiModels() <em>Ui Models</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUiModels()
   * @generated
   * @ordered
   */
  protected EList<UiModel> uiModels;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UiModelFileImpl()
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
    return UiDslPackage.Literals.UI_MODEL_FILE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<UiModel> getUiModels()
  {
    if (uiModels == null)
    {
      uiModels = new EObjectContainmentEList<UiModel>(UiModel.class, this, UiDslPackage.UI_MODEL_FILE__UI_MODELS);
    }
    return uiModels;
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
      case UiDslPackage.UI_MODEL_FILE__UI_MODELS:
        return ((InternalEList<?>)getUiModels()).basicRemove(otherEnd, msgs);
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
      case UiDslPackage.UI_MODEL_FILE__UI_MODELS:
        return getUiModels();
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
      case UiDslPackage.UI_MODEL_FILE__UI_MODELS:
        getUiModels().clear();
        getUiModels().addAll((Collection<? extends UiModel>)newValue);
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
      case UiDslPackage.UI_MODEL_FILE__UI_MODELS:
        getUiModels().clear();
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
      case UiDslPackage.UI_MODEL_FILE__UI_MODELS:
        return uiModels != null && !uiModels.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //UiModelFileImpl