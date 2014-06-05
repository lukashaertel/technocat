package eu.metatools.technocat.reasoning

import com.google.common.collect.Sets
import eu.metatools.technocat.technoCat.ETD
import eu.metatools.technocat.technoCat.RD
import eu.metatools.technocat.technoCat.RTD

import static extension eu.metatools.technocat.reasoning.TechnoCatExpansions.*
import static extension eu.metatools.technocat.reasoning.TechnoCatExtensions.*

class TechnoCatRelations {
	def static boolean supertypeOf(ETD a, ETD of) {
		return of.effectiveBases.exists[b|a == b || a.supertypeOf(b)]
	}

	def static boolean supertypeOf(RTD a, RTD of) {
		return of.effectiveBases.exists[b|a == b || a.supertypeOf(b)]
	}

	def static getApplicableOverloads(RD it) {

		// Get entity type hierachy for the left type
		val hleft = left.type.iexpand[effectiveBases]

		// Get relation type hierachy
		val hrelation = relation.iexpand[effectiveBases]

		// Get entity type hierachy for the right type
		val hright = right.type.iexpand[effectiveBases]

		// Pair them all
		var carp = Sets.cartesianProduct(hleft, hrelation, hright)

		return carp.map [ p |
			// Get pairings
			val letd = p.get(0) as ETD
			val rtd = p.get(1) as RTD
			val retd = p.get(2) as ETD
			// Map to their items
			return rtd.items.filter[domain == letd && codomain == retd]
		].flatten.sort [ a, b |
			// Check if as domain is a supertype of bs domain
			// Check if as codomain is a supertype of bs codomain
			val ds = a.domain.supertypeOf(b.domain)
			val cs = a.codomain.supertypeOf(b.codomain)
			if (ds && cs)
				return 1
			if (!ds && !cs)
				return -1
			return 0
		]
	}
}
