package com.validation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class StringNameValid implements ConstraintValidator<StringNameValidator, String>{

	private Logger logger = LoggerFactory.getLogger(StringNameValid.class);
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		logger.info("Message from isValid", value);
		
		//Custom Logic
		if(value.contains(value))
		{
			return true;
		}
		
		return false;
	}

}
