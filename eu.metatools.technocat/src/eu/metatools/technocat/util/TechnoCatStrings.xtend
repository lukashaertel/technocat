package eu.metatools.technocat.util

class TechnoCatStrings {
	def static representation(Iterable<?> c) '''«IF c.size == 1»«FOR i : c»«i»«ENDFOR»«ELSE»[«FOR i : c SEPARATOR ', '»«i»«ENDFOR»]«ENDIF»'''

}
