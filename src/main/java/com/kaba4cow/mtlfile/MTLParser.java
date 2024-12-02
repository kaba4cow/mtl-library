package com.kaba4cow.mtlfile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Objects;

import com.kaba4cow.mtlfile.elements.MTLBumpMap;
import com.kaba4cow.mtlfile.elements.MTLColor;
import com.kaba4cow.mtlfile.elements.MTLComment;
import com.kaba4cow.mtlfile.elements.MTLMap;
import com.kaba4cow.mtlfile.elements.MTLMaterial;

/**
 * A utility class for reading MTL data from {@link Reader} or strings and converting it to {@link MTLLibrary} objects.
 */
public class MTLParser {

	private MTLParser() {}

	/**
	 * Reads the MTL data from the specified {@link Reader} and converts its contents to an {@link MTLLibrary} object. If the
	 * {@code target} is not {@code null} its contents are cleared using {@link MTLLibrary#clearComments()} and
	 * {@link MTLLibrary#clearMaterials()}
	 * 
	 * @param source the {@link Reader} to read the MTL data from
	 * @param target the {@link MTLLibrary} to convert the MTL data to, or {@code null}
	 * 
	 * @return the {@link MTLLibrary} containing the data, either the passed one or a newly created one if {@code target} is
	 *             {@code null}
	 * 
	 * @throws IOException if an I/O error occurs
	 */
	public static MTLLibrary parse(Reader source, MTLLibrary target) throws IOException {
		Objects.requireNonNull(source, "Source must not be null");
		if (Objects.isNull(target))
			target = new MTLLibrary();
		else
			target.clearComments().clearMaterials();
		MTLMaterial material = null;
		BufferedReader reader = new BufferedReader(source);
		String line;
		while ((line = reader.readLine()) != null) {
			line = line.trim();
			if (line.isEmpty())
				continue;
			String[] parts = line.split("\\s+");
			if (parts.length > 1)
				switch (parts[0]) {
					case "#":
						target.addComment(new MTLComment().setText(line.split("\\s+", 2)[1]));
						break;
					case "newmtl":
						if (Objects.nonNull(material))
							target.addMaterial(material);
						material = new MTLMaterial().setName(parts[1]);
						break;
					case "d":
					case "Tr":
						if (Objects.nonNull(material))
							material.setTransparency(Float.parseFloat(parts[1]));
						break;
					case "Ns":
						if (Objects.nonNull(material))
							material.setSpecularExponent(Float.parseFloat(parts[1]));
						break;
					case "illum":
						if (Objects.nonNull(material))
							material.setIllumination(MTLIllumination.values()[Integer.parseInt(parts[1])]);
						break;
					case "Ka":
						if (Objects.nonNull(material))
							material.setAmbientColor(parseColor(parts));
						break;
					case "Kd":
						if (Objects.nonNull(material))
							material.setDiffuseColor(parseColor(parts));
						break;
					case "Ks":
						if (Objects.nonNull(material))
							material.setSpecularColor(parseColor(parts));
						break;
					case "map_Ka":
						if (Objects.nonNull(material))
							material.setAmbientMap(parseMap(parts));
						break;
					case "map_Kd":
						if (Objects.nonNull(material))
							material.setDiffuseMap(parseMap(parts));
						break;
					case "map_Ks":
						if (Objects.nonNull(material))
							material.setSpecularMap(parseMap(parts));
						break;
					case "map_d":
						if (Objects.nonNull(material))
							material.setTransparencyMap(parseMap(parts));
						break;
					case "map_Bump":
					case "bump":
						if (Objects.nonNull(material))
							material.setBumpMap(parseBumpMap(parts));
						break;
					default:
						break;
				}
		}
		if (Objects.nonNull(material))
			target.addMaterial(material);
		reader.close();
		return target;
	}

	private static MTLColor parseColor(String[] parts) {
		return new MTLColor()//
				.setR(Float.parseFloat(parts[1]))//
				.setG(Float.parseFloat(parts[2]))//
				.setB(Float.parseFloat(parts[3]));
	}

	private static MTLMap parseMap(String[] parts) {
		MTLMap map = new MTLMap();
		int pointer = 1;
		while (pointer < parts.length) {
			switch (parts[pointer]) {
				case "-s ":
					map.setScale(Float.parseFloat(parts[++pointer]));
					break;
				case "-o ":
					map.setOffset(Float.parseFloat(parts[++pointer]));
					break;
				case "-t ":
					map.setTransform(true);
					break;
			}
			pointer++;
		}
		map.setFile(parts[pointer]);
		return map;
	}

	private static MTLBumpMap parseBumpMap(String[] parts) {
		MTLBumpMap map = new MTLBumpMap();
		int pointer = 1;
		while (pointer < parts.length) {
			switch (parts[pointer]) {
				case "-s ":
					map.setScale(Float.parseFloat(parts[++pointer]));
					break;
				case "-o ":
					map.setOffset(Float.parseFloat(parts[++pointer]));
					break;
				case "-bm ":
					map.setIntensity(Float.parseFloat(parts[++pointer]));
					break;
				case "-t ":
					map.setTransform(true);
					break;
			}
			pointer++;
		}
		map.setFile(parts[pointer]);
		return map;
	}

	/**
	 * Reads the MTL data from the specified string and converts its contents to an {@link MTLLibrary} object. If the
	 * {@code target} is not {@code null} its contents are cleared using {@link MTLLibrary#clearComments()} and
	 * {@link MTLLibrary#clearMaterials()}
	 * 
	 * @param source the string to read the MTL data from
	 * @param target the {@link MTLLibrary} to convert the MTL data to, or {@code null}
	 * 
	 * @return the {@link MTLLibrary} containing the data, either the passed one or a newly created one if {@code target} is
	 *             {@code null}
	 * 
	 * @throws IOException if an I/O error occurs
	 */
	public static MTLLibrary parse(String source, MTLLibrary target) throws IOException {
		return parse(new StringReader(source), target);
	}

}
