package com.example.commonapi.anotation.anotation;



import com.example.commonapi.anotation.validator.MobileValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = MobileValidator.class)
@Documented
public @interface MobileNo {
    String message() default "Mobile is not valid.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
