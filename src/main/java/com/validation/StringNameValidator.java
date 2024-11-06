package com.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target(value = { ElementType.FIELD, ElementType.PARAMETER })
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = { StringNameValid.class })
public @interface StringNameValidator 
{
	//eerror msg
	String message() default "Sorry, String does not match";
	
	//represent group of constraints
	Class<?>[] groups() default { };
	
	//additional information about annotation
	Class<? extends Payload>[] payload() default {};
}
