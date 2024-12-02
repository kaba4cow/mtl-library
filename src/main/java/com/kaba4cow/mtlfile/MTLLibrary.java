package com.kaba4cow.mtlfile;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.kaba4cow.mtlfile.elements.MTLComment;
import com.kaba4cow.mtlfile.elements.MTLMaterial;

public class MTLLibrary implements MTLElement {

	private final List<MTLComment> comments;
	private final List<MTLMaterial> materials;

	public MTLLibrary() {
		this.comments = new ArrayList<>();
		this.materials = new ArrayList<>();
	}

	/**
	 * Creates an MTL library by parsing data from a {@link Reader} source.
	 *
	 * @param source a reader containing the MTL file data
	 * 
	 * @throws IOException if an I/O error occurs
	 */
	public MTLLibrary(Reader source) throws IOException {
		this();
		MTLParser.parse(source, this);
	}

	/**
	 * Creates an MTL library by parsing data from a {@link String} source.
	 *
	 * @param source a string containing the MTL file data
	 * 
	 * @throws IOException if an I/O error occurs
	 */
	public MTLLibrary(String source) throws IOException {
		this();
		MTLParser.parse(source, this);
	}

	/**
	 * Retrieves an unmodifiable list of comments in the model.
	 *
	 * @return an unmodifiable list of {@link MTLComment} objects
	 */
	public List<MTLComment> getComments() {
		return Collections.unmodifiableList(comments);
	}

	/**
	 * Retrieves a comment from the model by its index.
	 *
	 * @param index the index of the comment
	 * 
	 * @return a reference to this object
	 */
	public MTLComment getComment(int index) {
		return comments.get(index);
	}

	/**
	 * Adds a comment to the model.
	 *
	 * @param comment the {@link MTLComment} to add
	 * 
	 * @return a reference to this object
	 */
	public MTLLibrary addComment(MTLComment comment) {
		comments.add(comment);
		return this;
	}

	/**
	 * Removes a comment from the model by its index.
	 *
	 * @param index the index of the comment to remove
	 * 
	 * @return a reference to this object
	 */
	public MTLLibrary removeComment(int index) {
		comments.remove(index);
		return this;
	}

	/**
	 * Removes a specified comment from the model.
	 *
	 * @param comment the comment to remove
	 * 
	 * @return a reference to this object
	 */
	public MTLLibrary removeComment(MTLComment comment) {
		comments.remove(comment);
		return this;
	}

	/**
	 * Clears all comments from the model.
	 * 
	 * @return a reference to this object
	 */
	public MTLLibrary clearComments() {
		comments.clear();
		return this;
	}

	/**
	 * Retrieves an unmodifiable list of materials in the model.
	 *
	 * @return an unmodifiable list of {@link MTLMaterial} materials
	 */
	public List<MTLMaterial> getMaterials() {
		return Collections.unmodifiableList(materials);
	}

	/**
	 * Retrieves an material from the model by its index.
	 *
	 * @param index the index of the material
	 * 
	 * @return the {@link MTLMaterial} at the specified index
	 */
	public MTLMaterial getMaterial(int index) {
		return materials.get(index);
	}

	/**
	 * Retrieves an material from the model by its name.
	 *
	 * @param name the name of the material to retrieve
	 * 
	 * @return the {@link MTLMaterial} with the specified name, or {@code null} if not found
	 */
	public MTLMaterial getMaterial(String name) {
		for (MTLMaterial material : materials)
			if (Objects.equals(material.getName(), name))
				return material;
		return null;
	}

	/**
	 * Retrieves an optional material from the model by its name.
	 *
	 * @param name the name of the material to retrieve
	 * 
	 * @return the {@link Optional} containing {@link MTLMaterial} with the specified name
	 */
	public Optional<MTLMaterial> optMaterial(String name) {
		return Optional.ofNullable(getMaterial(name));
	}

	/**
	 * Adds an material to the model.
	 *
	 * @param material the {@link MTLMaterial} to add
	 * 
	 * @return a reference to this object
	 */
	public MTLLibrary addMaterial(MTLMaterial material) {
		materials.add(material);
		return this;
	}

	/**
	 * Removes an material from the model by its index.
	 *
	 * @param index the index of the material to remove
	 * 
	 * @return a reference to this object
	 */
	public MTLLibrary removeMaterial(int index) {
		materials.remove(index);
		return this;
	}

	/**
	 * Removes a specified material from the model.
	 *
	 * @param material the material to remove
	 * 
	 * @return a reference to this object
	 */
	public MTLLibrary removeMaterial(MTLMaterial material) {
		materials.remove(material);
		return this;
	}

	/**
	 * Clears all materials from the model.
	 * 
	 * @return a reference to this object
	 */
	public MTLLibrary clearMaterials() {
		materials.clear();
		return this;
	}

	/**
	 * Converts the library to a string representation in MTL format.
	 *
	 * @return a string representation of this library in MTL format
	 */
	@Override
	public String toMTLString() {
		StringBuilder builder = new StringBuilder();
		if (!comments.isEmpty()) {
			comments.stream().map(MTLElement::toMTLString).forEach(string -> builder.append(string).append("\n"));
			builder.append("\n");
		}
		if (!materials.isEmpty()) {
			materials.stream().map(MTLElement::toMTLString).forEach(string -> builder.append(string).append("\n"));
			builder.append("\n");
		}
		return builder.toString();
	}

	@Override
	public String toString() {
		return String.format("MTLLibrary [comments=%s, materials=%s]", comments, materials);
	}

}
