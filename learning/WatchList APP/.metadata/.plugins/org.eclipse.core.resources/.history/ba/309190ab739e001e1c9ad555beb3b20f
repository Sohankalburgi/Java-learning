package com.example.WatchListApp.entity.validations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ratingannotationlogic implements ConstraintValidator<Rating,Float>{

	@Override
	public boolean isValid(Float value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		if(value>5.0 && value<10.0)
		{
			return true;
		}
		return false;
	}

}
