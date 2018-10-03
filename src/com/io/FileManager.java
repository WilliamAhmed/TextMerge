package com.io;

import com.util.validation.StringValidationUtil;
import com.util.validation.exception.FileNotValidException;
import com.util.validation.FileValidationUtil;
import com.util.validation.exception.StringNotValidException;
import org.apache.log4j.Logger;

import java.io.*;

/**
 * @author WilliamAhmed
 * @since 03/10/2018
 */
public class FileManager {

	private final static Logger LOGGER = Logger.getLogger(FileManager.class);

	public static String readFile(File file) {
		String content = "";
		try {

			LOGGER.info("Reading from file " + file.getPath());

			FileValidationUtil.validateExistsAndNotNull(file);
			FileValidationUtil.validateNotDirectory(file);

			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			LOGGER.info("File reader successfully initialized and ready to read content");

			String currentLine;
			while((currentLine = bufferedReader.readLine()) != null) {
				content += currentLine;
			}

			LOGGER.info("Content has been read from file " + file.getPath());

			bufferedReader.close();
			fileReader.close();

		} catch (FileNotValidException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return content;
	}

	public static void writeToFile(File file, String content) {

		try {

			LOGGER.info("Writing content to file " + file.getPath());

			FileValidationUtil.validateNotDirectory(file);
			StringValidationUtil.validateNotNullOrEmpty(content);

			FileWriter fileWriter = new FileWriter(file, true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

			LOGGER.info("File writer successfully initialized");

			bufferedWriter.write(content);

			bufferedWriter.flush();
			fileWriter.flush();

			bufferedWriter.close();
			fileWriter.close();

			LOGGER.info("Write to file " + file.getPath() + " has been completed");


		} catch (FileNotValidException e) {
			e.printStackTrace();
		} catch (StringNotValidException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}


}
