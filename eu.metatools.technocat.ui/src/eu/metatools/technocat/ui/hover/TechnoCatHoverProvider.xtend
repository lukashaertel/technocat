package eu.metatools.technocat.ui.hover

import eu.metatools.technocat.technoCat.EDItem
import eu.metatools.technocat.technoCat.ETD
import eu.metatools.technocat.technoCat.RTD
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider

import static extension eu.metatools.technocat.reasoning.TechnoCatExtensions.*

class TechnoCatHoverProvider extends DefaultEObjectHoverProvider {
	override getFirstLine(EObject o) {
		val l = dispatchFirstLine(o)

		if(l == null) super.getFirstLine(o) else l

	}

	override getDocumentation(EObject o) {
		val d = o.dispatchDocumentation(true)

		if(d == null) super.getDocumentation(o) else d

	}

	def dispatch String dispatchFirstLine(EObject it) {
		null
	}

	def dispatch String dispatchFirstLine(ETD it) {
		'''Entity type <i>«name»</i>«IF !effectiveBases.empty» derived from «FOR b : effectiveBases SEPARATOR ', '»<i>«b.
			name»</i>«ENDFOR»«ENDIF»'''
	}

	def dispatch String dispatchFirstLine(RTD it) {
		'''Relation type <i>«name»</i>«IF !effectiveBases.empty» derived from «FOR b : effectiveBases SEPARATOR ', '»<i>«b.
			name»</i>«ENDFOR»«ENDIF»'''
	}

	def dispatch String dispatchFirstLine(EDItem it) {
		if (type != null) '''Entity «type.name» <i>«name»</i>'''
	}

	def dispatch String dispatchDocumentation(EObject it, boolean recursive) {
		null
	}

	/**
	 * Copy the semantic string if present
	 */
	def dispatch String dispatchDocumentation(ETD it, boolean recursive) '''
		«IF value != null»
			<p>«value»</p>
		«ENDIF»
		«IF recursive»
			«FOR b : effectiveBases»
				<p>
					<hr />
					<i>Inherited from «b.name»:</i>
				</p>
				«b.dispatchDocumentation(false)»
			«ENDFOR»
		«ENDIF»
	'''

	/**
	 * Copy the semantic string if present, list all relation overloads
	 * and their description
	 */
	def dispatch String dispatchDocumentation(RTD it, boolean recursive) '''
		«IF value != null»<p>«value»</p>«ENDIF»
		<p>
			<table border="2">
				<tr><th>Domain</th><th>Co-Domain</th><th>Description</th></tr>
				«FOR r : items»
					<tr>
						<td><i>«r.domain.name»</i></td>
						<td><i>«r.codomain.name»</i></td>
						<td>«IF r.value == null»&nbsp;«ELSE»«r.value»«ENDIF»</td></tr>
				«ENDFOR»
			</table>
		</p>
		«IF recursive»
			«FOR b : effectiveBases»
				<p>
					<hr />
					<i>Inherited from «b.name»:</i>
				</p>
				«b.dispatchDocumentation(false)»
			«ENDFOR»
		«ENDIF»
	'''

	/**
	 * Copy the semantic string if present
	 */
	def dispatch String dispatchDocumentation(EDItem it, boolean recursive) '''«IF value != null»<p>«value»</p>«ENDIF»'''
}
