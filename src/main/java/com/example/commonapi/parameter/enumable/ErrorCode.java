package com.example.commonapi.parameter.enumable;

import lombok.Getter;

public enum ErrorCode {
    SUCCESS(200,"Successfully"),
    USER_EXIST(1001,"User exist"),

    USER_NOT_FOUND(1002,"User Not Found"),

    USER_INACTIVE(1003,"User inactive"),

    USER_BLOCK(1004,"User block"),

    FAILURE(999, "Failure"),

    TIME_EXPIRE(1005,"time expire otp"),

    VALUE_OTP_FAILURE(1006,"OTP value failure"),

    MAX_INPUT_OTP(1007,"Maximum enter otp");


    @Getter
    private int code;
    @Getter
    private String message;
    ErrorCode(int code,String message)
    {
        this.code = code;
        this.message = message;
    }
}
