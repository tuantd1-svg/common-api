package com.example.commonapi.anotation.validator;

import com.example.commonapi.anotation.anotation.MobileNo;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MobileValidator implements ConstraintValidator<MobileNo, String> {

    public static Boolean isPhone(String phoneNumber) {
        boolean validate = false;
        PhoneNumberUtil phoneNumberUtil = PhoneNumberUtil.getInstance();
        try {
            Phonenumber.PhoneNumber number = phoneNumberUtil.parse(phoneNumber, "VN");
            validate = phoneNumberUtil.isValidNumber(number);

        } catch (NumberParseException e) {
        }
        return validate;
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return isPhone(s);
    }
}
