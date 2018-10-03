package com.io;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author WilliamAhmed
 * @since 03/10/2018
 */
public class FileMergerUTest extends BaseFileUTest{

	@Test
	public void testMerge() {

		List<String> inputFilePaths = Arrays.asList(
				this.getTestResourceFile("Test1.txt").getAbsolutePath(),
				this.getTestResourceFile("Test2.txt").getAbsolutePath(),
				this.getTestResourceFile("Test3.txt").getAbsolutePath()
		);

		String outputPathLocation = this.getTestResourceFile("TestOutputFile.txt").getAbsolutePath();

		FileMerger.merge(outputPathLocation, inputFilePaths);

	}

}
