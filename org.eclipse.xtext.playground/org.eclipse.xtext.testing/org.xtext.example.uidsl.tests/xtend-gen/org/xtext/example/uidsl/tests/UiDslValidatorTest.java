/**
 * Copyright (C) 2020 Gyaltso Technologies (https://gyaltso.com)
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 */
package org.xtext.example.uidsl.tests;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.example.uidsl.tests.UiDslInjectorProvider;
import org.xtext.example.uidsl.tests.helper.SmartParseHelper;
import org.xtext.example.uidsl.uiDsl.UiDslPackage;
import org.xtext.example.uidsl.uiDsl.UiModel;
import org.xtext.example.uidsl.uiDsl.UiModelFile;

@RunWith(XtextRunner.class)
@InjectWith(UiDslInjectorProvider.class)
@SuppressWarnings("all")
public class UiDslValidatorTest {
  @Inject
  @Extension
  private SmartParseHelper _smartParseHelper;
  
  @Inject
  private Provider<XtextResourceSet> resourceSetProvider;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void validateModel() {
    try {
      final XtextResourceSet rs = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("abstract model Account");
      final EObject model = this._smartParseHelper.parse(_builder, rs, "model");
      Assert.assertNotNull(model);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("ui AccountUi for Account");
      EObject _parse = this._smartParseHelper.parse(_builder_1, rs, "ui");
      final UiModelFile uiModelFile = ((UiModelFile) _parse);
      Assert.assertNotNull(uiModelFile);
      UiModel _head = IterableExtensions.<UiModel>head(uiModelFile.getUiModels());
      final Procedure1<UiModel> _function = (UiModel it) -> {
        this._validationTestHelper.assertError(it, UiDslPackage.Literals.UI_MODEL, "", "Cannot create ui-model for an abstract model");
      };
      ObjectExtensions.<UiModel>operator_doubleArrow(_head, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
