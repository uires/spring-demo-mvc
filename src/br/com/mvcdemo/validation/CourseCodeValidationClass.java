package br.com.mvcdemo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeValidationClass implements ConstraintValidator<CourseCode, String> {

	private String coursePrefix;

	@Override
	public void initialize(CourseCode constraintAnnotation) {
		coursePrefix = constraintAnnotation.value();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		boolean resultado;

		if (value != null) {
			resultado = value.startsWith(coursePrefix);
		} else {
			resultado = true;
		}
		return resultado;
	}

}
