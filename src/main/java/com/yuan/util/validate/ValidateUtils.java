package com.yuan.util.validate;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;

/**
 * 校验util
 * 
 * @ClassName ValidateUtils
 * @author kongxy
 * @date 2018年6月25日
 * @version 1.0
 */
public class ValidateUtils {

	/**
	 * 基于注解校验对象
	 * @MethodName validates
	 * @param t
	 * @author kongxy
	 * @return String
	 */
	public static <T> String validateByAnnotation(T t) {
		
		if( t == null ){
			return "error object";
		}
		
		Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
		Set<ConstraintViolation<T>> constraintViolations = validator.validate(t);

		for (ConstraintViolation<T> constraintViolation : constraintViolations) {
			return constraintViolation.getMessage();
		}
		return null;
	}
}
