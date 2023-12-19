package com.example.WatchListApp.entity.validations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {ratingannotationlogic.class})
public @interface Rating {
	  String  message() default "Please enter the Number between 5.0 to 10.0";
	  Class<?>[]groups() default {};
		Class<? extends Payload>[] payload() default {};
}
