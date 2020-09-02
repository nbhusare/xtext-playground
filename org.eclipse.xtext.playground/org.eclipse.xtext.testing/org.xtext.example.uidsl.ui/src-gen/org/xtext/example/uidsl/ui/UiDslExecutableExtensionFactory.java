/*
 * generated by Xtext 2.22.0
 */
package org.xtext.example.uidsl.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.example.uidsl.ui.internal.UidslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class UiDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(UidslActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		UidslActivator activator = UidslActivator.getInstance();
		return activator != null ? activator.getInjector(UidslActivator.ORG_XTEXT_EXAMPLE_UIDSL_UIDSL) : null;
	}

}