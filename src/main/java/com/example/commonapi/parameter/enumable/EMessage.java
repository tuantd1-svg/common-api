package com.example.commonapi.parameter.enumable;

public enum EMessage {
    EXECUTE(200, "EXECUTE"),

    FORBIDDEN(400, "FORBIDDEN"),

    NOT_FOUND(404, "NOT_FOUND"),

    NOT_EXIST(403, "NOT_EXIST"),

    PROCESSING_ERROR(405, "PROCESSING_ERROR"),

    INTERNAL_ERROR(400, "INTERNAL_ERROR");

    private final int status;
    private String message;


    EMessage(int status, String message) {
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

