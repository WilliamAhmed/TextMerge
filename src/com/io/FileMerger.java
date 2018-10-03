package com.io;

import org.apache.log4j.Logger;

import java.io.File;
import java.util.List;

/**
 * @author WilliamAhmed
 * @since 03/10/2018
 */
public class FileMerger {

	private final static Logger LOGGER = Logger.getLogger(FileMerger.class);

	public static void merge(String outputFilePath, List<String> inputFilePaths) {

		LOGGER.info("Starting merge operation");

		File outputFile = new File(outputFilePath);
		LOGGER.info("Output file created at location " + outputFilePath);

		if(outputFile.exists()) {
			LOGGER.info("File already exists at location " + outputFilePath);
			outputFile.delete();
			LOGGER.info("File " + outputFilePath + " has been deleted ready for new merge");
		}

		for (String filePath : inputFilePaths) {
			File f = new File(filePath);
			FileManager.writeToFile(outputFile, FileManager.readFile(f));
		}

		LOGGER.info("File Merge Successful. Please go to " + outputFilePath + " to see the merged file");

	}


}
