package com.util.validation;

import com.util.validation.exception.FileNotValidException;

import java.io.File;

/**
 * @author WilliamAhmed
 * @since 03/10/2018
 */
public class FileValidationUtil {

	public static void validateNotDirectory(File file) throws FileNotValidException {
		if(file.isDirectory()) {
			throw new FileNotValidException("File references a directory");
		}
	}

	public static void validateExistsAndNotNull(File file) throws FileNotValidException {
		if(!file.exists() || file == null) {
			throw new FileNotValidException("File does not exist or is null");
		}
	}



}
