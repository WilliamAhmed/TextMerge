package com;

import com.io.FileMerger;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * @author WilliamAhmed
 * @since 03/10/2018
 */
public class TextMerge {

	private final static Logger LOGGER = Logger.getLogger(TextMerge.class);

	public static void main(String[] args) {

		LOGGER.info("Text Merge Application Initializing");

		if(args.length > 2) {
			String outputFilePath = args[0];
			List<String> inputFilePaths = Arrays.asList(Arrays.copyOfRange(args, 1, args.length));
			FileMerger.merge(outputFilePath, inputFilePaths);
		} else {
			LOGGER.fatal("Text Merge had to exit due to incorrect parameters being specified");
		}
	}
}
