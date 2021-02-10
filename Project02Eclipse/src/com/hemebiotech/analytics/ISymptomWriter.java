package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Interface to save symptoms data to any kind of formats
 * 
 * 
 * @author k.belzung
 * @version 1.0
 */
public interface ISymptomWriter {
	
	/**
	 * Save the data 
	 * 
	 * @param data
	 * 				A map of the data to save
	 */
	void saveSymptoms (Map<String,Integer> data);
}
