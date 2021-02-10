package com.hemebiotech.analytics;

import java.io.File;
import java.io.FileWriter;
import java.util.Map;
import java.util.Map.Entry;

public class WriteSymptomDataToFile implements ISymptomWriter{
	
	private File filename;
	
	public WriteSymptomDataToFile(File fileToSave) {
		this.filename = fileToSave;
	}

	public void saveSymptoms(Map<String,Integer> data) {
		
		try(FileWriter writer = new FileWriter(this.filename.getPath())) {
			for(Entry<String, Integer> line : data.entrySet()) {
				writer.write(line.getKey() + ", " + line.getValue() + ".\r\n");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
