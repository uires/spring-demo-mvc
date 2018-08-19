package br.com.mvcdemo.controller.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeValidationClass.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
	
	public String value() default "LUV";
	
	public String messagE() default "O c�digo deve come�ar com LUV";
	
	public Class<?>[] group() default {};
	
	public Class<? extends Payload> [] payload() default {};	
	
	

}
