/*
 * generated by Xtext 2.22.0
 */
package org.xtext.example.modeldsl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractModelDslValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.xtext.example.modeldsl.modelDsl.ModelDslPackage.eINSTANCE);
		return result;
	}
}