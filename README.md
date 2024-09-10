# Example project using the NUVA client library

[NUVA](https://docs.nuva.mesvaccins.net/) is a unified nomenclature for vaccines.

This is an example project that loads the NUVA nomenclature in English and displays the name of the vaccine with code NUVA 43 (boostrixtetra).

## How to run

Prerequisites:

* Java 8 or later
* Maven

Build the project:

```bash
mvn install
```

Run the sample class:

```bash
mvn exec:java -Dexec.mainClass="com.syadem.NuvaSample"
```
