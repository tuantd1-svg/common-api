package com.example.commonapi.anotation.exeption;

import com.example.commonapi.parameter.enumable.ErrorCode;
import lombok.Getter;

public class FailureException extends RuntimeException{
    @Getter
    private ErrorCode errorCode;

    public FailureException(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public FailureException(String message, ErrorCode errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public FailureException(String message, Throwable cause, ErrorCode errorCode) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public FailureException(Throwable cause, ErrorCode errorCode) {
        super(cause);
        this.errorCode = errorCode;
    }

    public FailureException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, ErrorCode errorCode) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.errorCode = errorCode;
    }
}
