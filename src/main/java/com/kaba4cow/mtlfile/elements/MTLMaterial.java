package com.kaba4cow.mtlfile.elements;

import java.util.Objects;

import com.kaba4cow.mtlfile.MTLElement;
import com.kaba4cow.mtlfile.MTLIllumination;

/**
 * Represents a material in an MTL library.
 */
public class MTLMaterial implements MTLElement {

	private String name;
	private Float transparency;
	private Float specularExponent;
	private MTLIllumination illumination;
	private MTLColor ambientColor;
	private MTLColor diffuseColor;
	private MTLColor specularColor;
	private MTLMap ambientMap;
	private MTLMap diffuseMap;
	private MTLMap specularMap;
	private MTLMap transparencyMap;
	private MTLBumpMap bumpMap;

	/**
	 * Creates a new MTL material.
	 */
	public MTLMaterial() {
		this.name = null;
		this.transparency = null;
		this.specularExponent = null;
		this.illumination = null;
		this.ambientColor = null;
		this.diffuseColor = null;
		this.specularColor = null;
		this.ambientMap = null;
		this.diffuseMap = null;
		this.specularMap = null;
		this.transparencyMap = null;
		this.bumpMap = null;
	}

	/**
	 * Returns the material name.
	 *
	 * @return the material name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the material name.
	 *
	 * @param name the material name
	 * 
	 * @return a reference to this object
	 */
	public MTLMaterial setName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Returns the transparency.
	 *
	 * @return the transparency
	 */
	public float getTransparency() {
		return transparency;
	}

	/**
	 * Sets the transparency.
	 *
	 * @param transparency the transparency
	 * 
	 * @return a reference to this object
	 */
	public MTLMaterial setTransparency(float transparency) {
		this.transparency = transparency;
		return this;
	}

	/**
	 * Clears the transparency.
	 *
	 * @return a reference to this object
	 */
	public MTLMaterial clearTransparency() {
		this.transparency = null;
		return this;
	}

	/**
	 * Checks if the transparency is set.
	 *
	 * @return {@code true} if the transparency is set, {@code false} otherwise
	 */
	public boolean hasTransparency() {
		return Objects.nonNull(transparency);
	}

	/**
	 * Returns the specular exponent.
	 *
	 * @return the specular exponent
	 */
	public float getSpecularExponent() {
		return specularExponent;
	}

	/**
	 * Sets the specular exponent.
	 *
	 * @param specular exponent the specular exponent
	 * 
	 * @return a reference to this object
	 */
	public MTLMaterial setSpecularExponent(float specularExponent) {
		this.specularExponent = specularExponent;
		return this;
	}

	/**
	 * Clears the specular exponent.
	 *
	 * @return a reference to this object
	 */
	public MTLMaterial clearSpecularExponent() {
		this.specularExponent = null;
		return this;
	}

	/**
	 * Checks if the specular exponent is set.
	 *
	 * @return {@code true} if the specular exponent is set, {@code false} otherwise
	 */
	public boolean hasSpecularExponent() {
		return Objects.nonNull(specularExponent);
	}

	/**
	 * Returns the illumination model.
	 *
	 * @return the illumination model
	 */
	public MTLIllumination getIllumination() {
		return illumination;
	}

	/**
	 * Sets the illumination model.
	 *
	 * @param illumination the illumination model
	 * 
	 * @return a reference to this object
	 */
	public MTLMaterial setIllumination(MTLIllumination illumination) {
		this.illumination = illumination;
		return this;
	}

	/**
	 * Clears the illumination model.
	 *
	 * @return a reference to this object
	 */
	public MTLMaterial clearIllumination() {
		this.illumination = null;
		return this;
	}

	/**
	 * Checks if the illumination model is set.
	 *
	 * @return {@code true} if the illumination model is set, {@code false} otherwise
	 */
	public boolean hasIllumination() {
		return Objects.nonNull(illumination);
	}

	/**
	 * Returns the ambient color.
	 *
	 * @return the ambient color
	 */
	public MTLColor getAmbientColor() {
		return ambientColor;
	}

	/**
	 * Sets the ambient color.
	 *
	 * @param ambientColor the ambient color
	 * 
	 * @return a reference to this object
	 */
	public MTLMaterial setAmbientColor(MTLColor ambientColor) {
		this.ambientColor = ambientColor;
		return this;
	}

	/**
	 * Clears the ambient color.
	 *
	 * @return a reference to this object
	 */
	public MTLMaterial clearAmbientColor() {
		this.ambientColor = null;
		return this;
	}

	/**
	 * Checks if the ambient color is set.
	 *
	 * @return {@code true} if the ambient color is set, {@code false} otherwise
	 */
	public boolean hasAmbientColor() {
		return Objects.nonNull(ambientColor);
	}

	/**
	 * Returns the diffuse color.
	 *
	 * @return the diffuse color
	 */
	public MTLColor getDiffuseColor() {
		return diffuseColor;
	}

	/**
	 * Sets the diffuse color.
	 *
	 * @param diffuseColor the diffuse color
	 * 
	 * @return a reference to this object
	 */
	public MTLMaterial setDiffuseColor(MTLColor diffuseColor) {
		this.diffuseColor = diffuseColor;
		return this;
	}

	/**
	 * Clears the diffuse color.
	 *
	 * @return a reference to this object
	 */
	public MTLMaterial clearDiffuseColor() {
		this.diffuseColor = null;
		return this;
	}

	/**
	 * Checks if the diffuse color is set.
	 *
	 * @return {@code true} if the diffuse color is set, {@code false} otherwise
	 */
	public boolean hasDiffuseColor() {
		return Objects.nonNull(diffuseColor);
	}

	/**
	 * Returns the specular color.
	 *
	 * @return the specular color
	 */
	public MTLColor getSpecularColor() {
		return specularColor;
	}

	/**
	 * Sets the specular color.
	 *
	 * @param specularColor the specular color
	 * 
	 * @return a reference to this object
	 */
	public MTLMaterial setSpecularColor(MTLColor specularColor) {
		this.specularColor = specularColor;
		return this;
	}

	/**
	 * Clears the specular color.
	 *
	 * @return a reference to this object
	 */
	public MTLMaterial clearSpecularColor() {
		this.specularColor = null;
		return this;
	}

	/**
	 * Checks if the specular color is set.
	 *
	 * @return {@code true} if the specular color is set, {@code false} otherwise
	 */
	public boolean hasSpecularColor() {
		return Objects.nonNull(specularColor);
	}

	/**
	 * Clears material colors.
	 *
	 * @return a reference to this object
	 */
	public MTLMaterial clearColors() {
		return clearAmbientColor().clearDiffuseColor().clearSpecularColor();
	}

	/**
	 * Returns the ambient map.
	 *
	 * @return the ambient map
	 */
	public MTLMap getAmbientMap() {
		return ambientMap;
	}

	/**
	 * Sets the ambient map.
	 *
	 * @param ambientMap the ambient map
	 * 
	 * @return a reference to this object
	 */
	public MTLMaterial setAmbientMap(MTLMap ambientMap) {
		this.ambientMap = ambientMap;
		return this;
	}

	/**
	 * Clears the ambient map.
	 *
	 * @return a reference to this object
	 */
	public MTLMaterial clearAmbientMap() {
		this.ambientMap = null;
		return this;
	}

	/**
	 * Checks if the ambient map is set.
	 *
	 * @return {@code true} if the ambient map is set, {@code false} otherwise
	 */
	public boolean hasAmbientMap() {
		return Objects.nonNull(ambientMap);
	}

	/**
	 * Returns the diffuse map.
	 *
	 * @return the diffuse map
	 */
	public MTLMap getDiffuseMap() {
		return diffuseMap;
	}

	/**
	 * Sets the diffuse map.
	 *
	 * @param diffuseMap the diffuse map
	 * 
	 * @return a reference to this object
	 */
	public MTLMaterial setDiffuseMap(MTLMap diffuseMap) {
		this.diffuseMap = diffuseMap;
		return this;
	}

	/**
	 * Clears the diffuse map.
	 *
	 * @return a reference to this object
	 */
	public MTLMaterial clearDiffuseMap() {
		this.diffuseMap = null;
		return this;
	}

	/**
	 * Checks if the diffuse map is set.
	 *
	 * @return {@code true} if the diffuse map is set, {@code false} otherwise
	 */
	public boolean hasDiffuseMap() {
		return Objects.nonNull(diffuseMap);
	}

	/**
	 * Returns the specular map.
	 *
	 * @return the specular map
	 */
	public MTLMap getSpecularMap() {
		return specularMap;
	}

	/**
	 * Sets the specular map.
	 *
	 * @param specularMap the specular map
	 * 
	 * @return a reference to this object
	 */
	public MTLMaterial setSpecularMap(MTLMap specularMap) {
		this.specularMap = specularMap;
		return this;
	}

	/**
	 * Clears the specular map.
	 *
	 * @return a reference to this object
	 */
	public MTLMaterial clearSpecularMap() {
		this.specularMap = null;
		return this;
	}

	/**
	 * Checks if the specular map is set.
	 *
	 * @return {@code true} if the specular map is set, {@code false} otherwise
	 */
	public boolean hasSpecularMap() {
		return Objects.nonNull(specularMap);
	}

	/**
	 * Returns the transparency map.
	 *
	 * @return the transparency map
	 */
	public MTLMap getTransparencyMap() {
		return transparencyMap;
	}

	/**
	 * Sets the transparency map.
	 *
	 * @param transparencyMap the transparency map
	 * 
	 * @return a reference to this object
	 */
	public MTLMaterial setTransparencyMap(MTLMap transparencyMap) {
		this.transparencyMap = transparencyMap;
		return this;
	}

	/**
	 * Clears the transparency map.
	 *
	 * @return a reference to this object
	 */
	public MTLMaterial clearTransparencyMap() {
		this.transparencyMap = null;
		return this;
	}

	/**
	 * Checks if the transparency map is set.
	 *
	 * @return {@code true} if the transparency map is set, {@code false} otherwise
	 */
	public boolean hasTransparencyMap() {
		return Objects.nonNull(transparencyMap);
	}

	/**
	 * Returns the bump map.
	 *
	 * @return the bump map
	 */
	public MTLBumpMap getBumpMap() {
		return bumpMap;
	}

	/**
	 * Sets the bump map.
	 *
	 * @param bumpMap the bump map
	 * 
	 * @return a reference to this object
	 */
	public MTLMaterial setBumpMap(MTLBumpMap bumpMap) {
		this.bumpMap = bumpMap;
		return this;
	}

	/**
	 * Clears the bump map.
	 *
	 * @return a reference to this object
	 */
	public MTLMaterial clearBumpMap() {
		this.bumpMap = null;
		return this;
	}

	/**
	 * Checks if the bump map is set.
	 *
	 * @return {@code true} if the bump map is set, {@code false} otherwise
	 */
	public boolean hasBumpMap() {
		return Objects.nonNull(bumpMap);
	}

	/**
	 * Clears material maps.
	 *
	 * @return a reference to this object
	 */
	public MTLMaterial clearMaps() {
		return clearAmbientMap().clearDiffuseMap().clearSpecularMap().clearTransparencyMap().clearBumpMap();
	}

	/**
	 * Converts the material to its MTL string representation.
	 *
	 * @return the MTL string representation of this material
	 */
	@Override
	public String toMTLString() {
		Objects.requireNonNull(name, "Name must not be null");
		StringBuilder builder = new StringBuilder();
		builder.append("newmtl ").append(name).append("\n");

		if (hasTransparency())
			builder.append("d ").append(transparency).append("\n");
		if (hasSpecularExponent())
			builder.append("Ns ").append(specularExponent).append("\n");
		if (hasIllumination())
			builder.append("illum ").append(illumination.ordinal()).append("\n");

		if (hasAmbientColor())
			builder.append("Ka ").append(ambientColor.toMTLString()).append("\n");
		if (hasDiffuseColor())
			builder.append("Kd ").append(diffuseColor.toMTLString()).append("\n");
		if (hasSpecularColor())
			builder.append("Ks ").append(specularColor.toMTLString()).append("\n");

		if (hasAmbientMap())
			builder.append("map_Ka ").append(ambientMap.toMTLString()).append("\n");
		if (hasDiffuseMap())
			builder.append("map_Kd ").append(diffuseMap.toMTLString()).append("\n");
		if (hasSpecularMap())
			builder.append("map_Ks ").append(specularMap.toMTLString()).append("\n");
		if (hasTransparencyMap())
			builder.append("map_d ").append(transparencyMap.toMTLString()).append("\n");
		if (hasBumpMap())
			builder.append("map_Bump ").append(bumpMap.toMTLString()).append("\n");

		return builder.toString();
	}

}
