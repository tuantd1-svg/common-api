package com.example.commonapi.parameter.enumable;

public enum ETransactionStatus {
    OTP_VALUE_FAILS(9, "otp value fails"),
    SUCCESS(1, "Successfully"),
    TIME_EXPIRE(9,"time expire"),
    NOT_EXIST(9,"not exist"),

    NOT_FOUND(9,"not found"),

    EXIST(9,"exist"),
    PROCESSING_ERROR(99,"processing error");
    private final int status;
    private final String message;

    ETransactionStatus(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
    public static ETransactionStatus getTransactionFromCode(int code) {
        for (ETransactionStatus ETransactionStatus : ETransactionStatus.values()) {
            if (code == ETransactionStatus.getStatus())
                return ETransactionStatus;
        }
        return null;
    }
}

