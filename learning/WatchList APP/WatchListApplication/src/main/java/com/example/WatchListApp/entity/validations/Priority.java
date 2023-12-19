package com.example.WatchListApp.entity.validations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;


// the target annotation marks the custom annotation that it should be applied at specific location
@Target(ElementType.FIELD)
// the retention annotation marks the custom annotation that it is used at the runtime or the time where it is used
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {priorityannotationlogic.class})
public @interface Priority {
	 String message() default "Please enter L, M, H only ";
	 
	 Class<?>[]groups() default {};
	Class<? extends Payload>[] payload() default {};
}
