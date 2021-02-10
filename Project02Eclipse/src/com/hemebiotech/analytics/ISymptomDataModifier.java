package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Interface for a list of data to modify
 * 
 * @author k.belzung
 * @version 1.0
 */
public interface ISymptomDataModifier {
	
	/**
	 * Modify the data 
	 * 
	 * @return dataMap
	 * 				A Map which has count and order the line of a list of strings
	 */
	public Map<String,Integer> countAndOrder();
}
