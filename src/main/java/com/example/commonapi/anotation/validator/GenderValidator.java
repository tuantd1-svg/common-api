package com.example.commonapi.anotation.validator;


import com.example.commonapi.anotation.anotation.Gender;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class GenderValidator implements ConstraintValidator<Gender,String> {
    List<String> genders = Arrays.asList("MALE", "FEMALE", "OTHER", "M","F","O");

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return genders.contains(s.toUpperCase());
    }
}
