package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class SymptomDataModifier implements ISymptomDataModifier {

	List<String> listOfData;
	
	public SymptomDataModifier(List<String> list) {
		this.listOfData = list;
	}
	
	public TreeMap<String, Integer> countAndOrder() {
		TreeMap<String, Integer> dataMap = new TreeMap<String, Integer>();
		for (String line : this.listOfData)
		{
			if (dataMap.containsKey(line)) {
				dataMap.put(line, dataMap.get(line) + 1);
			} else {
				dataMap.put(line, 1);
			}
		}
		
		return dataMap;
	}

}
