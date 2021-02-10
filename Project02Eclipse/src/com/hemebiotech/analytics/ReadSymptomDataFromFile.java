package com.hemebiotech.analytics;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

/**
 * <b>The class represent a file Reader.</b>
 * <p>It read the data from a file.</p>
 * 
 * @author k.belzung
 * @version 1.1
 * 
 * @see ISymptomReader
 */
public class ReadSymptomDataFromFile implements ISymptomReader {
	
	/**
	 * A file with lines of symptoms
	 */
	File file;
	
	/**
	 * Constructor of ReadSymptomDataFromFile
	 * 
	 * @param file 
	 * 				A file with symptom strings in it, one per line
	 */
	public ReadSymptomDataFromFile (File file) {
		this.file = file;
	}
	
	/**
	 * Read the data of a file to convert it in a list of strings
	 * 
	 * @return list 
	 * 				A list of strings with every line of a file
	 */
	public List<String> getSymptoms() {
		
		List<String> list = null;
		try {
			list = Files.readAllLines(file.toPath(), Charset.defaultCharset() );
		} catch (IOException e) {
			e.printStackTrace();
		}

		return list;
	}

}
