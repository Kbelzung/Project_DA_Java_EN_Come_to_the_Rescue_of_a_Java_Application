package com.hemebiotech.analytics;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

public class ReadSymptomDataFromFile implements ISymptomReader {
	
	File file;
	
	public ReadSymptomDataFromFile (File file) {
		this.file = file;
	}
	
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
