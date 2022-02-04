package com.example.helloWorld.Annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.helloWorld.BLL.CitationManager;

public class Not2CitationInBDDValidator implements ConstraintValidator<Not2CitationInBDD, String> {
	@Autowired
	CitationManager citaMan;

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (citaMan.isExistByVal(value)) return true;
		else return false;
	}

}
