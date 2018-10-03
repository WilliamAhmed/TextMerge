package com.io;

import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author WilliamAhmed
 * @since 03/10/2018
 */
public class FileManagerUTest extends BaseFileUTest{

	@Test
	public void testReadFile() {
		File file = this.getTestResourceFile("Test1.txt");
		String result = FileManager.readFile(file);
		assertNotNull(result);
	}

}
