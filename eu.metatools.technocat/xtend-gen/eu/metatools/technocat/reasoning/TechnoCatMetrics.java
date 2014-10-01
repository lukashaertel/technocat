package eu.metatools.technocat.reasoning;

import com.google.common.base.Objects;
import eu.metatools.technocat.reasoning.TechnoCatExtensions;
import eu.metatools.technocat.technoCat.ED;
import eu.metatools.technocat.technoCat.EDItem;
import eu.metatools.technocat.technoCat.ETD;
import eu.metatools.technocat.technoCat.RD;
import eu.metatools.technocat.technoCat.RTD;
import eu.metatools.technocat.technoCat.TechnologyCatalog;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class TechnoCatMetrics {
  public static int hashEPrime(final TechnologyCatalog t) {
    EList<ETD> _entityTypes = t.getEntityTypes();
    return _entityTypes.size();
  }
  
  public static int hashRPrime(final TechnologyCatalog t) {
    EList<RTD> _relationTypes = t.getRelationTypes();
    return _relationTypes.size();
  }
  
  public static int hashE(final TechnologyCatalog t) {
    EList<ED> _entities = t.getEntities();
    return _entities.size();
  }
  
  public static int hashR(final TechnologyCatalog t) {
    EList<RD> _relations = t.getRelations();
    return _relations.size();
  }
  
  public static int hashIn(final TechnologyCatalog t, final ED e) {
    EList<RD> _relations = t.getRelations();
    final Function1<RD, Boolean> _function = new Function1<RD, Boolean>() {
      public Boolean apply(final RD it) {
        EDItem _right = it.getRight();
        ED _eD = TechnoCatExtensions.getED(_right);
        return Boolean.valueOf(Objects.equal(_eD, e));
      }
    };
    Iterable<RD> _filter = IterableExtensions.<RD>filter(_relations, _function);
    return IterableExtensions.size(_filter);
  }
  
  public static int hashOut(final TechnologyCatalog t, final ED e) {
    EList<RD> _relations = t.getRelations();
    final Function1<RD, Boolean> _function = new Function1<RD, Boolean>() {
      public Boolean apply(final RD it) {
        EDItem _left = it.getLeft();
        ED _eD = TechnoCatExtensions.getED(_left);
        return Boolean.valueOf(Objects.equal(_eD, e));
      }
    };
    Iterable<RD> _filter = IterableExtensions.<RD>filter(_relations, _function);
    return IterableExtensions.size(_filter);
  }
  
  public static int hashDegree(final TechnologyCatalog t, final ED e) {
    int _hashIn = TechnoCatMetrics.hashIn(t, e);
    int _hashOut = TechnoCatMetrics.hashOut(t, e);
    return (_hashIn + _hashOut);
  }
  
  public static double p(final TechnologyCatalog t, final int i) {
    EList<ED> _entities = t.getEntities();
    final Function1<ED, Boolean> _function = new Function1<ED, Boolean>() {
      public Boolean apply(final ED e) {
        int _hashDegree = TechnoCatMetrics.hashDegree(t, e);
        return Boolean.valueOf((_hashDegree == i));
      }
    };
    Iterable<ED> _filter = IterableExtensions.<ED>filter(_entities, _function);
    int _size = IterableExtensions.size(_filter);
    int _hashE = TechnoCatMetrics.hashE(t);
    return (((double) _size) / _hashE);
  }
  
  public static int hashChildren(final TechnologyCatalog t, final ETD e) {
    EList<ETD> _entityTypes = t.getEntityTypes();
    final Function1<ETD, Boolean> _function = new Function1<ETD, Boolean>() {
      public Boolean apply(final ETD it) {
        EList<ETD> _bases = it.getBases();
        return Boolean.valueOf(_bases.contains(e));
      }
    };
    Iterable<ETD> _filter = IterableExtensions.<ETD>filter(_entityTypes, _function);
    return IterableExtensions.size(_filter);
  }
  
  public static int hashParents(final TechnologyCatalog t, final ETD e) {
    EList<ETD> _bases = e.getBases();
    return _bases.size();
  }
  
  public static int hashStarChildren(final TechnologyCatalog t, final ETD e) {
    EList<ETD> _entityTypes = t.getEntityTypes();
    final Function1<ETD, Boolean> _function = new Function1<ETD, Boolean>() {
      public Boolean apply(final ETD it) {
        EList<ETD> _bases = it.getBases();
        return Boolean.valueOf(_bases.contains(e));
      }
    };
    Iterable<ETD> _filter = IterableExtensions.<ETD>filter(_entityTypes, _function);
    final Function1<ETD, Integer> _function_1 = new Function1<ETD, Integer>() {
      public Integer apply(final ETD f) {
        return Integer.valueOf(TechnoCatMetrics.hashStarChildren(t, f));
      }
    };
    Iterable<Integer> _map = IterableExtensions.<ETD, Integer>map(_filter, _function_1);
    final Function2<Integer, Integer, Integer> _function_2 = new Function2<Integer, Integer, Integer>() {
      public Integer apply(final Integer a, final Integer b) {
        return Integer.valueOf(Math.max((a).intValue(), (b).intValue()));
      }
    };
    Integer _reduce = IterableExtensions.<Integer>reduce(_map, _function_2);
    return (1 + (_reduce).intValue());
  }
  
  public static int hashStarParents(final TechnologyCatalog t, final ETD e) {
    EList<ETD> _bases = e.getBases();
    final Function1<ETD, Integer> _function = new Function1<ETD, Integer>() {
      public Integer apply(final ETD f) {
        return Integer.valueOf(TechnoCatMetrics.hashStarParents(t, f));
      }
    };
    List<Integer> _map = ListExtensions.<ETD, Integer>map(_bases, _function);
    final Function2<Integer, Integer, Integer> _function_1 = new Function2<Integer, Integer, Integer>() {
      public Integer apply(final Integer a, final Integer b) {
        return Integer.valueOf(Math.min((a).intValue(), (b).intValue()));
      }
    };
    Integer _reduce = IterableExtensions.<Integer>reduce(_map, _function_1);
    return (1 + (_reduce).intValue());
  }
  
  public static int SOV(final TechnologyCatalog t) {
    int _hashEPrime = TechnoCatMetrics.hashEPrime(t);
    int _hashRPrime = TechnoCatMetrics.hashRPrime(t);
    int _plus = (_hashEPrime + _hashRPrime);
    int _hashE = TechnoCatMetrics.hashE(t);
    return (_plus + _hashE);
  }
  
  public static double ENR(final TechnologyCatalog t) {
    int _hashR = TechnoCatMetrics.hashR(t);
    int _hashE = TechnoCatMetrics.hashE(t);
    return (((double) _hashR) / _hashE);
  }
  
  public static int TIP(final TechnologyCatalog t) {
    int _xblockexpression = (int) 0;
    {
      EList<ETD> _entityTypes = t.getEntityTypes();
      final Function1<ETD, Integer> _function = new Function1<ETD, Integer>() {
        public Integer apply(final ETD e) {
          return Integer.valueOf(TechnoCatMetrics.hashParents(t, e));
        }
      };
      List<Integer> _map = ListExtensions.<ETD, Integer>map(_entityTypes, _function);
      final Function2<Integer, Integer, Integer> _function_1 = new Function2<Integer, Integer, Integer>() {
        public Integer apply(final Integer a, final Integer b) {
          return Integer.valueOf(((a).intValue() + (b).intValue()));
        }
      };
      final Integer x = IterableExtensions.<Integer>reduce(_map, _function_1);
      final int y = TechnoCatMetrics.hashEPrime(t);
      _xblockexpression = (((x).intValue() + 1) - y);
    }
    return _xblockexpression;
  }
  
  public static double ld(final double x) {
    double _log = Math.log(x);
    double _log_1 = Math.log(2);
    return (_log / _log_1);
  }
  
  public static double EOG(final TechnologyCatalog t) {
    EList<ED> _entities = t.getEntities();
    final Function1<ED, Integer> _function = new Function1<ED, Integer>() {
      public Integer apply(final ED e) {
        return Integer.valueOf(TechnoCatMetrics.hashDegree(t, e));
      }
    };
    List<Integer> _map = ListExtensions.<ED, Integer>map(_entities, _function);
    final Function2<Integer, Integer, Integer> _function_1 = new Function2<Integer, Integer, Integer>() {
      public Integer apply(final Integer a, final Integer b) {
        return Integer.valueOf(Math.max((a).intValue(), (b).intValue()));
      }
    };
    final Integer md = IterableExtensions.<Integer>reduce(_map, _function_1);
    double r = 0.0;
    IntegerRange _upTo = new IntegerRange(0, (md).intValue());
    for (final Integer i : _upTo) {
      {
        final double c = TechnoCatMetrics.p(t, (i).intValue());
        if ((c != 0)) {
          double _ld = TechnoCatMetrics.ld(c);
          double _multiply = (c * _ld);
          double _plus = (r + _multiply);
          r = _plus;
        }
      }
    }
    return (-r);
  }
  
  public static int NOC(final TechnologyCatalog t, final ETD e) {
    return TechnoCatMetrics.hashChildren(t, e);
  }
  
  public static int DIT(final TechnologyCatalog t, final ETD e) {
    return TechnoCatMetrics.hashStarParents(t, e);
  }
  
  public static int CID(final TechnologyCatalog t, final ED e) {
    return TechnoCatMetrics.hashIn(t, e);
  }
  
  public static int COD(final TechnologyCatalog t, final ED e) {
    return TechnoCatMetrics.hashOut(t, e);
  }
}
