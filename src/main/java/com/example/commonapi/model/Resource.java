package com.example.commonapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Resource {
    private String reference;
    private String authResource;
    private String resourceType;
    @JsonIgnore
    private String value;
}
