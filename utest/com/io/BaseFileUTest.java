package com.io;

import java.io.File;

/**
 * @author WilliamAhmed
 * @since 03/10/2018
 */
public abstract class BaseFileUTest {

	protected File getTestResourceFile(String filename) {
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("TestFiles/" + filename).getFile());
		return file;
	}

}
