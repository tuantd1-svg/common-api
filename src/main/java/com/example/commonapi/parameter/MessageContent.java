package com.example.commonapi.parameter;

public class MessageContent {
    public static String MAIL_SEND_OTP="Your verification code is : %s";

    public static String MAIL_SEND_CHANGE_PASS="Please click <a href=\"http://localhost:3000/change-password/%s\"> here </a> to change your password ";

    public static String MAIL_RESET_PASSWORD_SUCCESS = "Your password has been changed successfully at %s. Please login to use the service";

    public static String MAIL_RESET_PASSWORD_FAIL = "Your password has failed at %s .Please contact customer service for assistance";
}
