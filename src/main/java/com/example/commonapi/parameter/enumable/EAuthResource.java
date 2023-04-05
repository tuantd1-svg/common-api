package com.example.commonapi.parameter.enumable;

import lombok.Getter;

public enum EAuthResource {
    CREATE_USER(120000),

    RESET_PASSWORD(900000),
    UNKNOWN(0);

    @Getter
    private Integer value;

    EAuthResource(int value) {
        this.value = value;
    }
    public static EAuthResource getResourceFromName(String resource)
    {
        for(EAuthResource eAuthResource:EAuthResource.values())
        {
            if(eAuthResource.name().equals(resource))
                return eAuthResource;
        }
        return UNKNOWN;
    }
}