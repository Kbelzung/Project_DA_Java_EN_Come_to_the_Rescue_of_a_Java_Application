package com.hemebiotech.analytics;

import java.io.File;
import java.io.FileWriter;
import java.util.Map;
import java.util.Map.Entry;

/**
 * <b>The class represent a file writer.</b>
 * <p>It store the data in a file.</p>
 * 
 * @author k.belzung
 * @version 1.0
 * 
 * @see ISymptomWriter
 */
public class WriteSymptomDataToFile implements ISymptomWriter{
	
	/**
	 * The file to save the data
	 */
	private File filename;
	
	/**
	 * Constructor of WriteSymptomDataToFile
	 * 
	 * @param fileToSave
	 * 					The name of the file to save in
	 */
	public WriteSymptomDataToFile(File fileToSave) {
		this.filename = fileToSave;
	}

	/**
	 * Save the symptoms data in a file
	 * 
	 * @param data
	 * 				The map of data to save
	 */
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
