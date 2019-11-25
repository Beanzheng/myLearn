package com.study.springboot_01.springbootstudy1.common;

import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class StartWithValidator implements ConstraintValidator<StartWithValidation, String> {
   private String start;
    @Override
    public void initialize(StartWithValidation constraintAnnotation) {
        start = constraintAnnotation.start();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        if (!StringUtils.isEmpty(value)) {
            return value.startsWith(start);
        }
        return true;
    }
}
