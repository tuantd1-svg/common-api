package com.example.commonapi.model;

import lombok.Data;

@Data
public class ValidateResource {
    private String authResource;
    private String resource;
    private String credential;
}
