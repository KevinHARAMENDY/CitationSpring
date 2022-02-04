package com.example.helloWorld.Annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = Not2CitationInBDDValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Not2CitationInBDD {
	String message() default "Tu ne peux pas renseigner deux fois la même citation !";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
