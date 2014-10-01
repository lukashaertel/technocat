package eu.metatools.technocat.reasoning

import eu.metatools.technocat.technoCat.ED
import eu.metatools.technocat.technoCat.ETD
import eu.metatools.technocat.technoCat.TechnologyCatalog
import static java.lang.Math.*
import static extension eu.metatools.technocat.reasoning.TechnoCatExtensions.*

class TechnoCatMetrics {
	static def hashEPrime(TechnologyCatalog t) {
		t.entityTypes.size
	}

	static def hashRPrime(TechnologyCatalog t) {
		t.relationTypes.size
	}

	static def hashE(TechnologyCatalog t) {
		t.entities.size
	}

	static def hashR(TechnologyCatalog t) {
		t.relations.size
	}

	static def hashIn(TechnologyCatalog t, ED e) {
		t.relations.filter[right.ED == e].size
	}

	static def hashOut(TechnologyCatalog t, ED e) {
		t.relations.filter[left.ED == e].size
	}

	static def hashDegree(TechnologyCatalog t, ED e) {
		hashIn(t, e) + hashOut(t, e)
	}

	static def p(TechnologyCatalog t, int i) {
		t.entities.filter[e|hashDegree(t, e) == i].size as double / hashE(t)
	}

	static def hashChildren(TechnologyCatalog t, ETD e) {
		t.entityTypes.filter[bases.contains(e)].size
	}

	static def hashParents(TechnologyCatalog t, ETD e) {
		e.bases.size
	}

	static def int hashStarChildren(TechnologyCatalog t, ETD e) {
		1 + t.entityTypes.filter[bases.contains(e)].map[f|hashStarChildren(t, f)].reduce[a, b|max(a, b)]
	}

	static def int hashStarParents(TechnologyCatalog t, ETD e) {
		1 + e.bases.map[f|hashStarParents(t, f)].reduce[a, b|min(a, b)]
	}

	static def SOV(TechnologyCatalog t) {
		hashEPrime(t) + hashRPrime(t) + hashE(t)
	}

	static def ENR(TechnologyCatalog t) {
		hashR(t) as double / hashE(t)
	}

	static def TIP(TechnologyCatalog t) {
		val x = t.entityTypes.map[e|hashParents(t, e)].reduce[a, b|a + b]
		val y = hashEPrime(t)
		x + 1 - y
	}

	static def ld(double x) {
		Math.log(x) / Math.log(2)
	}

	static def EOG(TechnologyCatalog t) {

		// Determine maximum degree
		val md = t.entities.map[e|hashDegree(t, e)].reduce[a, b|max(a, b)]

		var r = 0.0
		for (i : 0 .. md) {
			val c = p(t, i)

			// Instead of filtering nonexistent degrees
			if (c != 0)
				r = r + c * ld(c)
		}
		return -r
	}

	static def NOC(TechnologyCatalog t, ETD e) {
		hashChildren(t, e)
	}

	static def DIT(TechnologyCatalog t, ETD e) {
		hashStarParents(t, e)
	}

	static def CID(TechnologyCatalog t, ED e) {
		hashIn(t, e)
	}

	static def COD(TechnologyCatalog t, ED e) {
		hashOut(t, e)
	}
}
