/**
 * generated by Xtext 2.22.0
 */
package org.xtext.example.uidsl.tests;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.example.uidsl.tests.UiDslInjectorProvider;
import org.xtext.example.uidsl.tests.helper.SmartParseHelper;

@RunWith(XtextRunner.class)
@InjectWith(UiDslInjectorProvider.class)
@SuppressWarnings("all")
public class UiDslParsingTest {
  @Inject
  @Extension
  private SmartParseHelper _smartParseHelper;
  
  @Inject
  private Provider<XtextResourceSet> resourceSetProvider;
  
  @Test
  public void loadModel() {
    try {
      final XtextResourceSet rs = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("model Account");
      final EObject model = this._smartParseHelper.parse(_builder, rs, "model");
      Assert.assertNotNull(model);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("ui AccountUi for Account");
      final EObject uiModel = this._smartParseHelper.parse(_builder_1, rs, "ui");
      Assert.assertNotNull(uiModel);
      EcoreUtil.resolveAll(rs);
      Resource _eResource = uiModel.eResource();
      Assert.assertTrue(((XtextResource) _eResource).getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void loadModelWithErrors() {
    try {
      final XtextResourceSet rs = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("model Account");
      final EObject model = this._smartParseHelper.parse(_builder, rs, "model");
      Assert.assertNotNull(model);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("ui AccountUi for NoAccount");
      final EObject uiModel = this._smartParseHelper.parse(_builder_1, rs, "ui");
      Assert.assertNotNull(uiModel);
      EcoreUtil.resolveAll(rs);
      Resource _eResource = uiModel.eResource();
      Assert.assertFalse(((XtextResource) _eResource).getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
