package com.hemebiotech.analytics;

import java.util.List;

/**
 * Interface to read symptoms data from any kind of formats
 * 
 * @author k.belzung
 * @version 1.1
 */
public interface ISymptomReader {

	/**
	 * Read the data of a file given at the initialization of the reader
	 * 
	 * @return The data of a file with every line in a list of strings 
	 */
	List<String> getSymptoms();
}