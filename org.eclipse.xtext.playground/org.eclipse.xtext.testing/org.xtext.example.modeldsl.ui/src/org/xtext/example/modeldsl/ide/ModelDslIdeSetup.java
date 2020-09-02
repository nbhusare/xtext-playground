/*
 * generated by Xtext 2.22.0
 */
package org.xtext.example.modeldsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.modeldsl.ModelDslRuntimeModule;
import org.xtext.example.modeldsl.ModelDslStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class ModelDslIdeSetup extends ModelDslStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new ModelDslRuntimeModule(), new ModelDslIdeModule()));
	}
	
}
