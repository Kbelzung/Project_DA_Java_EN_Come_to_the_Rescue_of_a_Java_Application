package com.hemebiotech.analytics;

import java.io.File;
import java.util.List;
import java.util.TreeMap;

public class AnalyticsCounter {
	

	public static void main(String args[]) throws Exception {
		
		ISymptomReader fileReader = new ReadSymptomDataFromFile(new File("Project02Eclipse/symptoms.txt"));
		List<String> listOfSymptoms = fileReader.getSymptoms();
		
		SymptomDataModifier listModifier = new SymptomDataModifier(listOfSymptoms);
		TreeMap<String, Integer> listModified = listModifier.countAndOrder();

		ISymptomWriter fileWriter = new WriteSymptomDataToFile(new File("result.out"));
		fileWriter.saveSymptoms(listModified);
	}
}
