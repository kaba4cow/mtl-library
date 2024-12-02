package com.kaba4cow.mtlfile.elements;

import com.kaba4cow.mtlfile.MTLElement;

/**
 * Represents a color in an MTL file. A color is defined by three floating-point components (r, g, b).
 */
public class MTLColor implements MTLElement {

	private float r;
	private float g;
	private float b;

	/**
	 * Creates a new {@code MTLColor} with all components initialized to 0.0.
	 */
	public MTLColor() {
		this.r = 0.0f;
		this.g = 0.0f;
		this.b = 0.0f;
	}

	/**
	 * Retrieves the R component of the color.
	 *
	 * @return the R component of the color
	 */
	public float getR() {
		return r;
	}

	/**
	 * Sets the R component of the color.
	 *
	 * @param r the new value for the R component
	 * 
	 * @return a reference to this color
	 */
	public MTLColor setR(float r) {
		this.r = r;
		return this;
	}

	/**
	 * Retrieves the G component of the color.
	 *
	 * @return the G component of the color
	 */
	public float getG() {
		return g;
	}

	/**
	 * Sets the G component of the color.
	 *
	 * @param g the new value for the G component
	 * 
	 * @return a reference to this color
	 */
	public MTLColor setG(float g) {
		this.g = g;
		return this;
	}

	/**
	 * Retrieves the B component of the color.
	 *
	 * @return the B component of the color
	 */
	public float getB() {
		return b;
	}

	/**
	 * Sets the B component of the color.
	 *
	 * @param b the new value for the B component
	 * 
	 * @return a reference to this color
	 */
	public MTLColor setB(float b) {
		this.b = b;
		return this;
	}

	/**
	 * Sets the R, G, and B components of the color.
	 *
	 * @param r the new value for the R component
	 * @param g the new value for the G component
	 * @param b the new value for the B component
	 * 
	 * @return a reference to this color
	 */
	public MTLColor set(float r, float g, float b) {
		return setR(r).setG(g).setB(b);
	}

	/**
	 * Converts this color to its string representation in the MTL format.
	 *
	 * @return the MTL format string for this color
	 */
	@Override
	public String toMTLString() {
		return String.format("%s %s %s", r, g, b);
	}

}
