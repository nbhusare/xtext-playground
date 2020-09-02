/*
 * generated by Xtext 2.22.0
 */
package org.xtext.example.uidsl.validation;

import org.eclipse.xtext.validation.Check;
import org.xtext.example.uidsl.uiDsl.UiDslPackage;
import org.xtext.example.uidsl.uiDsl.UiModel;
import org.xtext.example.uidsl.uiDsl.UiModelFile;

/**
 * This class contains custom validation rules.
 *
 * See
 * https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class UiDslValidator extends AbstractUiDslValidator {

//	public static final String INVALID_NAME = "invalidName";
//
//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital",
//					UiDslPackage.Literals.GREETING__NAME,
//					INVALID_NAME);
//		}
//	}

	@Check
	public void checkUiModels(UiModel uiModel) {
		if (uiModel.getModel().isAbstract()) {
			error("Cannot create ui-model for an abstract model", UiDslPackage.Literals.UI_MODEL__NAME);
		}
	}

}
