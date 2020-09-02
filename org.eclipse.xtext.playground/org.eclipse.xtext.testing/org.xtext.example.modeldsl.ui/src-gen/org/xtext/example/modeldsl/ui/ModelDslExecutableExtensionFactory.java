/*
 * generated by Xtext 2.22.0
 */
package org.xtext.example.modeldsl.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.example.modeldsl.ui.internal.ModeldslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ModelDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(ModeldslActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		ModeldslActivator activator = ModeldslActivator.getInstance();
		return activator != null ? activator.getInjector(ModeldslActivator.ORG_XTEXT_EXAMPLE_MODELDSL_MODELDSL) : null;
	}

}
