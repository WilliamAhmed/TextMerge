package com.util.validation;

import com.util.validation.exception.StringNotValidException;

/**
 * @author WilliamAhmed
 * @since 03/10/2018
 */
public class StringValidationUtil {

	public static void validateNotNullOrEmpty(String s) throws StringNotValidException{
		if(null == s || s.isEmpty()) {
			throw new StringNotValidException("String is null or empty");
		}
	}


}
