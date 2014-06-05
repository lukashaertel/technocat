package eu.metatools.technocat.reasoning

import eu.metatools.technocat.technoCat.ED
import eu.metatools.technocat.technoCat.EDItem
import eu.metatools.technocat.technoCat.ETD
import eu.metatools.technocat.technoCat.RD
import eu.metatools.technocat.technoCat.RTD
import eu.metatools.technocat.technoCat.RTDItem
import eu.metatools.technocat.technoCat.TechnologyCatalog

import static extension eu.metatools.technocat.reasoning.TechnoCatScopes.*

class TechnoCatExtensions {
	val static BASE_ENTITY_TYPE_NAME = "Thing"

	val static BASE_RELATION_TYPE_NAME = "inRelationWith"

	/**
	 * Get the effective list of base entity types, includes an existing "Thing"
	 */
	def static getEffectiveBases(ETD it) {
		if (name == BASE_ENTITY_TYPE_NAME)
			return bases

		val base = technologyCatalog?.effectiveETDs?.filter[name == BASE_ENTITY_TYPE_NAME]?.head

		if (base != null && !bases.contains(base))
			return (bases + #[base]).toList
		else
			return bases
	}

	/**
	 * Get the effective list of base relation types, includes an existing "inRelationWith"
	 */
	def static getEffectiveBases(RTD it) {
		if (name == BASE_RELATION_TYPE_NAME)
			return bases

		val base = technologyCatalog?.effectiveRTDs?.filter[name == BASE_RELATION_TYPE_NAME]?.head

		if (base != null && !bases.contains(base))
			return (bases + #[base]).toList
		else
			return bases
	}

	def static getTechnologyCatalog(ETD it) {
		eContainer as TechnologyCatalog
	}

	def static getTechnologyCatalog(RTD it) {
		eContainer as TechnologyCatalog
	}

	def static getTechnologyCatalog(RTDItem it) {
		RTD.technologyCatalog
	}

	def static getTechnologyCatalog(ED it) {
		eContainer as TechnologyCatalog
	}

	def static getTechnologyCatalog(EDItem it) {
		ED.technologyCatalog
	}

	def static getTechnologyCatalog(RD it) {
		eContainer as TechnologyCatalog
	}

	def static getRTD(RTDItem it) {
		eContainer as RTD
	}

	def static getED(EDItem it) {
		eContainer as ED
	}

	def static getType(EDItem it) {
		ED?.type
	}
}
