package com.example.commonapi.parameter.enumable;

public enum EAuthResource {
    CREATE_USER,
    UNKNOWN;
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