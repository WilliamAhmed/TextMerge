package com.util.validation;

import com.util.validation.exception.FileNotValidException;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author WilliamAhmed
 * @since 03/10/2018
 */
public class FileValidationUtilUTest {

	@Test
	public void testValidateNotDirectoryUsingDirectory() {
		File file = new File("C:\\");
		assertThrows(
				FileNotValidException.class,
				() -> FileValidationUtil.validateNotDirectory(file)
		);
	}

	@Test
	public void testValidateNotDirectoryUsingFile() {

	}

}
