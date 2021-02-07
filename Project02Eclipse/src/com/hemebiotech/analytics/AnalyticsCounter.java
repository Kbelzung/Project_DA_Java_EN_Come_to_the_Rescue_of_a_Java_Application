package com.hemebiotech.analytics;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

public class AnalyticsCounter {
	
	public static void main(String args[]) throws Exception {
		
		// Read the data from a file to store it into a list 
		File fileToRead = new File("Project02Eclipse/symptoms.txt");
		List<String> list = null;
		try {
			list = Files.readAllLines(fileToRead.toPath(), Charset.defaultCharset() );
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Put the data in a TreeMap to count each line of data and order it
		TreeMap<String, Integer> dataMap = new TreeMap<String, Integer>();
		for (String line : list)
		{
			if (dataMap.containsKey(line)) {
				dataMap.put(line, dataMap.get(line) + 1);
			} else {
				dataMap.put(line, 1);
			}
		}
		
		// Create a new file to store the values
		File fileToSaveData = new File("result.out");
		try {
			
			FileWriter writer = new FileWriter(fileToSaveData.getPath()); 
			
			for(Entry<String, Integer> line : dataMap.entrySet()) {
				writer.write(line.getKey() + ", " + line.getValue() + ".\r\n");
			}
			
			writer.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
