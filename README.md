# MTL Materials Library

A lightweight **Java** library designed for parsing and manipulating materials in the **[MTL](https://en.wikipedia.org/wiki/Wavefront_.mtl_file#Material_template_library)** format. It provides a flexible and extensible API for handling material colors, maps, and other parameters in a structured way.

## Features

- MTL data parsing
- Easy-to-use methods for manipulating material data

The library is designed to support:

- Comments (`#`)
- Materials (`newmtl`)
- Material parameters (`illum`, `d` or `Tr`, `Ns`)
- Colors (`Kx`)
- Maps (`map_Kx`, `map_x`, `bump`)

## Limitations

The library currently supports most standard **MTL** features but has some limitations. It does not handle advanced texture map options and assumes well-formed MTL files without syntax errors. Proprietary extensions or renderer-specific features may not be fully supported.

## Usage

### Parsing an MTL from a file/reader

```java
Reader reader = new InputStreamReader(new FileInputStream("path/to/your/file.mtl"));
MTLLibrary library = new MTLLibrary(reader);
```

or

```java
Reader source = new InputStreamReader(new FileInputStream("path/to/your/file.mtl"));
MTLLibrary library = MTLParser.parse(source, null);
```

### Parsing an MTL from a string

```java
MTLLibrary library = new MTLLibrary("the MTL data");
```

or

```java
MTLLibrary library = MTLParser.parse("the MTL data", null);
```

### Converting to MTL data

```java
String mtl = model.toMTLString();
System.out.println(mtl);
```