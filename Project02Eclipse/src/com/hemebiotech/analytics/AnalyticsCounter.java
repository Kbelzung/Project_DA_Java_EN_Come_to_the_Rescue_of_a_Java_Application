package com.hemebiotech.analytics;

import java.io.File;
import java.util.List;
import java.util.TreeMap;

public class AnalyticsCounter {
	
	/**
	 * <b>AnalyticsCounter can process a file with a list of symptoms.</b>
	 * 
	 * <p>It can read a file and get all it's data.</p>
	 * <p>Then convert it to a treeMap to count and order it.</p>
	 * <p>To finally store it in a file.</p>
	 * 
	 * @author k.belzung
	 * @version 1.2
	 */
	public static void main(String args[]) throws Exception {
		
		ISymptomReader fileReader = new ReadSymptomDataFromFile(new File("Project02Eclipse/symptoms.txt"));
		List<String> listOfSymptoms = fileReader.getSymptoms();
		
		SymptomDataModifier listModifier = new SymptomDataModifier(listOfSymptoms);
		TreeMap<String, Integer> listModified = listModifier.countAndOrder();

		ISymptomWriter fileWriter = new WriteSymptomDataToFile(new File("result.out"));
		fileWriter.saveSymptoms(listModified);
	}
}
