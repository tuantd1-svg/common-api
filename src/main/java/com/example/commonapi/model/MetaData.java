package com.example.commonapi.model;

import com.example.commonapi.parameter.enumable.AuthType;
import com.example.commonapi.parameter.enumable.EAuthResource;
import lombok.Data;

import java.util.List;

@Data
public class MetaData {
    private List<String> to;
    private EAuthResource authResource;

    private AuthType authType;

}
