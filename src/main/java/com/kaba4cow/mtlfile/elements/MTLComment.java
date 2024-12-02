package com.kaba4cow.mtlfile.elements;

import java.util.Objects;

import com.kaba4cow.mtlfile.MTLElement;

/**
 * Represents a comment in an MTL file. Comments are prefixed with {@code #} in the MTL format.
 */
public class MTLComment implements MTLElement {

	private String text;

	/**
	 * Creates an empty comment.
	 */
	public MTLComment() {
		this.text = null;
	}

	/**
	 * Returns the comment text.
	 *
	 * @return the comment text or {@code null} if not set
	 */
	public String getText() {
		return text;
	}

	/**
	 * Sets the comment text.
	 *
	 * @param text the text of the comment
	 * 
	 * @return a reference to this object
	 */
	public MTLComment setText(String text) {
		this.text = text;
		return this;
	}

	/**
	 * Checks if the comment has text.
	 *
	 * @return {@code true} if the comment has text, {@code false} otherwise
	 */
	public boolean hasText() {
		return Objects.nonNull(text);
	}

	/**
	 * Clears the comment text.
	 *
	 * @return a reference to this object
	 */
	public MTLComment clearText() {
		this.text = null;
		return this;
	}

	/**
	 * Converts the comment to its MTL string representation.
	 *
	 * @return the MTL string representation of this comment
	 */
	@Override
	public String toMTLString() {
		return String.format("# %s", text);
	}

	@Override
	public String toString() {
		return String.format("MTLComment [text=%s]", text);
	}

}
