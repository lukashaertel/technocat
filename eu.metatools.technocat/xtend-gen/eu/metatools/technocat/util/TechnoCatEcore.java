package eu.metatools.technocat.util;

import com.google.common.base.Objects;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

@SuppressWarnings("all")
public class TechnoCatEcore {
  public static int index(final EObject it) {
    EObject _eContainer = it.eContainer();
    boolean _equals = Objects.equal(_eContainer, null);
    if (_equals) {
      return (-1);
    }
    EClass _eClass = it.eClass();
    final EStructuralFeature f = _eClass.eContainingFeature();
    boolean _isMany = f.isMany();
    if (_isMany) {
      EObject _eContainer_1 = it.eContainer();
      EClass _eClass_1 = it.eClass();
      EStructuralFeature _eContainingFeature = _eClass_1.eContainingFeature();
      Object _eGet = _eContainer_1.eGet(_eContainingFeature);
      final List<? extends Object> l = ((List<?>) _eGet);
      return l.indexOf(it);
    } else {
      return 0;
    }
  }
}
