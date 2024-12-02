package com.kaba4cow.mtlfile.elements;

import java.util.Objects;

import com.kaba4cow.mtlfile.MTLElement;

/**
 * Represents a map in an MTL file.
 */
public class MTLMap implements MTLElement {

	private String file;
	private Float scale;
	private Float offset;
	private boolean transform;

	/**
	 * Creates a new MTL map.
	 */
	public MTLMap() {
		this.file = null;
		this.scale = null;
		this.offset = null;
		this.transform = false;
	}

	/**
	 * Returns the map file path.
	 *
	 * @return the map file path
	 */
	public String getFile() {
		return file;
	}

	/**
	 * Sets the map file path.
	 *
	 * @param name the map file path
	 * 
	 * @return a reference to this object
	 */
	public MTLMap setFile(String file) {
		this.file = file;
		return this;
	}

	/**
	 * Returns the scale.
	 *
	 * @return the scale
	 */
	public float getScale() {
		return scale;
	}

	/**
	 * Sets the scale.
	 *
	 * @param scale the scale
	 * 
	 * @return a reference to this object
	 */
	public MTLMap setScale(float scale) {
		this.scale = scale;
		return this;
	}

	/**
	 * Clears the scale.
	 *
	 * @return a reference to this object
	 */
	public MTLMap clearScale() {
		this.scale = null;
		return this;
	}

	/**
	 * Checks if the scale is set.
	 *
	 * @return {@code true} if the scale is set, {@code false} otherwise
	 */
	public boolean hasScale() {
		return Objects.nonNull(scale);
	}

	/**
	 * Returns the offset.
	 *
	 * @return the offset
	 */
	public float getOffset() {
		return offset;
	}

	/**
	 * Sets the offset.
	 *
	 * @param offset the offset
	 * 
	 * @return a reference to this object
	 */
	public MTLMap setOffset(float offset) {
		this.offset = offset;
		return this;
	}

	/**
	 * Clears the offset.
	 *
	 * @return a reference to this object
	 */
	public MTLMap clearOffset() {
		this.offset = null;
		return this;
	}

	/**
	 * Checks if the offset is set.
	 *
	 * @return {@code true} if the offset is set, {@code false} otherwise
	 */
	public boolean hasOffset() {
		return Objects.nonNull(offset);
	}

	/**
	 * Returns the transform.
	 *
	 * @return the transform
	 */
	public boolean getTransform() {
		return transform;
	}

	/**
	 * Sets the transform.
	 *
	 * @param transform the transform
	 * 
	 * @return a reference to this object
	 */
	public MTLMap setTransform(boolean transform) {
		this.transform = transform;
		return this;
	}

	/**
	 * Clears the transform.
	 *
	 * @return a reference to this object
	 */
	public MTLMap clearTransform() {
		this.transform = false;
		return this;
	}

	/**
	 * Checks if the transform is set.
	 *
	 * @return {@code true} if the transform is set, {@code false} otherwise
	 */
	public boolean hasTransform() {
		return Objects.nonNull(transform);
	}

	/**
	 * Converts the map to its MTL string representation.
	 *
	 * @return the MTL string representation of this map
	 */
	@Override
	public String toMTLString() {
		StringBuilder builder = new StringBuilder();
		if (hasScale())
			builder.append("-s ").append(scale);
		if (hasOffset())
			builder.append("-o ").append(offset);
		if (hasTransform())
			builder.append("-t ");
		builder.append(file);
		return builder.toString();
	}

}
