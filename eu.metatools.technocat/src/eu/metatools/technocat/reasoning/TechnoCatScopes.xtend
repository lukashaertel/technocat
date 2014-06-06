package eu.metatools.technocat.reasoning

import eu.metatools.technocat.technoCat.ED
import eu.metatools.technocat.technoCat.EDItem
import eu.metatools.technocat.technoCat.ETD
import eu.metatools.technocat.technoCat.RTD
import eu.metatools.technocat.technoCat.RTDItem
import eu.metatools.technocat.technoCat.TechnologyCatalog

import static extension eu.metatools.technocat.reasoning.TechnoCatExpansions.*

class TechnoCatScopes {
	def static effectiveCatalog(TechnologyCatalog it) {
		iexpand[imports.map[ref]]
	}

	def static Iterable<ETD> effectiveETDs(TechnologyCatalog it) {
		effectiveCatalog.map[entityTypes].flatten
	}

	def static Iterable<RTD> effectiveRTDs(TechnologyCatalog it) {
		effectiveCatalog.map[relationTypes].flatten
	}

	def static Iterable<RTDItem> effectiveRTDItems(TechnologyCatalog it) {
		effectiveRTDs.map[items].flatten
	}

	def static Iterable<ED> effectiveEDs(TechnologyCatalog it) {
		effectiveCatalog.map[entities].flatten
	}

	def static Iterable<EDItem> effectiveEDItems(TechnologyCatalog it) {
		effectiveEDs.map[items].flatten
	}
}
