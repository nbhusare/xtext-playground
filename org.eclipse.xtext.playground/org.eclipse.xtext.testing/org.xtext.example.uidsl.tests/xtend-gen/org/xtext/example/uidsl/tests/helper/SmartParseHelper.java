package org.xtext.example.uidsl.tests.helper;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IntegerRange;

@SuppressWarnings("all")
public class SmartParseHelper<T extends EObject> extends ParseHelper<T> {
  public T parse(final CharSequence text, final ResourceSet resourceSetToUse, final String fileExtension) throws Exception {
    T _parse = this.parse(this.getAsStream(text), this.computeUnusedUri(resourceSetToUse, fileExtension), null, resourceSetToUse);
    return ((T) _parse);
  }
  
  public URI computeUnusedUri(final ResourceSet resourceSet, final String fileExtension) {
    final String name = "__synthetic";
    IntegerRange _upTo = new IntegerRange(0, Integer.MAX_VALUE);
    for (final Integer i : _upTo) {
      {
        final URI syntheticUri = URI.createURI((((name + i) + ".") + fileExtension));
        Resource _resource = resourceSet.getResource(syntheticUri, false);
        boolean _tripleEquals = (_resource == null);
        if (_tripleEquals) {
          return syntheticUri;
        }
      }
    }
    throw new IllegalStateException();
  }
  
  @Override
  public T parse(final InputStream in, final URI uriToUse, final Map<?, ?> options, final ResourceSet resourceSet) {
    final Resource resource = resourceSet.createResource(uriToUse);
    try {
      resource.load(in, options);
      T _xifexpression = null;
      boolean _isEmpty = resource.getContents().isEmpty();
      if (_isEmpty) {
        _xifexpression = null;
      } else {
        EObject _get = resource.getContents().get(0);
        _xifexpression = ((T) _get);
      }
      final T root = _xifexpression;
      return root;
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        throw new WrappedException(e);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
