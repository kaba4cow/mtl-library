package com.kaba4cow.mtlfile.elements;

import java.util.Objects;

/**
 * Represents a bump map in an MTL file.
 */
public class MTLBumpMap extends MTLMap {

	private Float intensity;

	/**
	 * Creates a new MTL bump map.
	 */
	public MTLBumpMap() {
		super();
		this.intensity = null;
	}

	/**
	 * Returns the intensity.
	 *
	 * @return the intensity
	 */
	public float getIntensity() {
		return intensity;
	}

	/**
	 * Sets the intensity.
	 *
	 * @param intensity the intensity
	 * 
	 * @return a reference to this object
	 */
	public MTLBumpMap setIntensity(float intensity) {
		this.intensity = intensity;
		return this;
	}

	/**
	 * Clears the intensity.
	 *
	 * @return a reference to this object
	 */
	public MTLBumpMap clearIntensity() {
		this.intensity = null;
		return this;
	}

	/**
	 * Checks if the intensity is set.
	 *
	 * @return {@code true} if the intensity is set, {@code false} otherwise
	 */
	public boolean hasIntensity() {
		return Objects.nonNull(intensity);
	}

	/**
	 * Converts the bump map to its MTL string representation.
	 *
	 * @return the MTL string representation of this bump map
	 */
	@Override
	public String toMTLString() {
		StringBuilder builder = new StringBuilder();
		if (hasIntensity())
			builder.append("-bm ").append(intensity);
		builder.append(super.toString());
		return builder.toString();
	}

}
