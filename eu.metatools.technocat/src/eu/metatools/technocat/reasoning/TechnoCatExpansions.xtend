package eu.metatools.technocat.reasoning

import java.util.Set

class TechnoCatExpansions {

	/**
	 * Expands from the given item over the expansion specified, does not include the initial item
	 * @param initial the initial item
	 * @param expansion the expansion function
	 * @return Returns a set of items from the expansion
	 */
	static def <T> Set<T> expand(T initial, (T)=>Iterable<T> expansion) {
		val r = newLinkedHashSet

		val s = newLinkedList(initial)
		while (!s.empty) {
			val f = s.pop

			if (r.add(f))
				s += expansion.apply(f)
		}

		return r
	}

	/**
	 * Expands from the given item over the expansion specified, includes the initial item
	 * @param initial the initial item
	 * @param expansion the expansion function
	 * @return Returns a set of items from the expansion
	 */
	static def <T> Set<T> iexpand(T initial, (T)=>Iterable<T> exp) {
		val r = expand(initial, exp)
		r += initial
		return r
	}
}
