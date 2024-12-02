package com.kaba4cow.mtlfile;

/**
 * Represents an enumeration of illumination models supported by the MTL format with their descriptions specified in the MTL
 * format specs.
 */
public enum MTLIllumination {

	ILLUM_0("Color on and Ambient off"), //
	ILLUM_1("Color on and Ambient on"), //
	ILLUM_2("Highlight on"), //
	ILLUM_3("Reflection on and Ray trace on"), //
	ILLUM_4("Transparency: Glass on; Reflection: Ray trace on"), //
	ILLUM_5("Reflection: Fresnel on and Ray trace on"), //
	ILLUM_6("Transparency: Refraction on; Reflection: Fresnel off and Ray trace on"), //
	ILLUM_7("Transparency: Refraction on; Reflection: Fresnel on and Ray trace on"), //
	ILLUM_8("Reflection on and Ray trace off"), //
	ILLUM_9("Transparency: Glass on; Reflection: Ray trace off"), //
	ILLUM_10("Casts shadows onto invisible surfaces"); //

	private final String description;

	private MTLIllumination(String description) {
		this.description = description;
	}

	/**
	 * Returns the description of the illumination model.
	 * 
	 * @return the description of the model
	 */
	public String description() {
		return description;
	}

}
