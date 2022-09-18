package com.example.commonapi.anotation.anotation;

import com.example.commonapi.anotation.validator.GenderValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = GenderValidator.class)
@Documented
public @interface Gender {
    String message() default "man , woman, other";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
