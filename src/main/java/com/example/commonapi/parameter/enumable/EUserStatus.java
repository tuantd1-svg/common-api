package com.example.commonapi.parameter.enumable;

public enum EUserStatus {
    BLOCKING(3, "User is blocking"),
    AUTHORIZATION(0, "User waiting authorize"),
    ACTIVE(1, "User is active"),

    NON_ACTIVE(2, "User waiting validate"),

    NONE(9, "not status");

    private int status;
    private String message;

    EUserStatus(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

}
