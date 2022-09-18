package com.example.commonapi.parameter.enumable;

import lombok.Getter;

public enum EStatus {
    INIT_RESOURCE(0, "init resource"),
    AUTHORIZE_RESOURCE(9,"authorization resource"),
    SUCCESS(1,"success"),
    FAIL(5,"fails");

    @Getter
    private int code;
    @Getter
    private String message;

    EStatus(int code, String message) {
        code = code;
        message = message;
    }
}
