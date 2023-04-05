package com.example.commonapi.model;

import com.example.commonapi.parameter.enumable.EAuthResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.query.Meta;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Resource {
    private String reference;

    private String commonReferenceId;

    private String refTransaction;
    @JsonIgnore
    private String resourceType;
    @JsonIgnore
    private String value;
    private MetaData metaData;
}
