package eu.metatools.technocat.util

import org.eclipse.emf.ecore.EObject
import java.util.List

class TechnoCatEcore {
	def static index(EObject it) {
		if (eContainer == null)
			return -1

		val f = eClass.eContainingFeature

		if (f.many) {
			val l = eContainer.eGet(eClass.eContainingFeature) as List<?>
			
			return l.indexOf(it)
		} else
			return 0
	}
}
