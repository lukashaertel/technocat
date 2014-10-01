package eu.metatools.technocat.util;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class TechnoCatStrings {
  public static CharSequence representation(final Iterable<?> c) {
    StringConcatenation _builder = new StringConcatenation();
    {
      int _size = IterableExtensions.size(c);
      boolean _equals = (_size == 1);
      if (_equals) {
        {
          for(final Object i : c) {
            _builder.append(i, "");
          }
        }
      } else {
        _builder.append("[");
        {
          boolean _hasElements = false;
          for(final Object i_1 : c) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(", ", "");
            }
            _builder.append(i_1, "");
          }
        }
        _builder.append("]");
      }
    }
    return _builder;
  }
}
