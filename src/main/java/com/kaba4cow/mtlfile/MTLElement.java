package com.kaba4cow.mtlfile;

/**
 * Represents a generic element in an MTL file. Each implementing class defines how to convert the element to its MTL string
 * representation.
 */
public interface MTLElement {

	/**
	 * Converts this element to its MTL string representation.
	 *
	 * @return the MTL string representation of this element
	 */
	public String toMTLString();

}
