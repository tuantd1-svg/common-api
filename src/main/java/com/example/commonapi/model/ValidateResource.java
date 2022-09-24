package com.example.commonapi.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ValidateResource {
    private String authResource;
    private String resource;
    private String credential;
}
