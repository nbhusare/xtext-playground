/**
 * generated by Xtext 2.22.0
 */
package org.xtext.example.modeldsl.modelDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.modeldsl.modelDsl.ModelDslPackage
 * @generated
 */
public interface ModelDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ModelDslFactory eINSTANCE = org.xtext.example.modeldsl.modelDsl.impl.ModelDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model File</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model File</em>'.
   * @generated
   */
  ModelFile createModelFile();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ModelDslPackage getModelDslPackage();

} //ModelDslFactory
