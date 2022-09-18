package com.example.commonapi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private String apartment;
    private String street;
    private String wardName;
    private String district;
    private String cityName;
    private String address;
}
