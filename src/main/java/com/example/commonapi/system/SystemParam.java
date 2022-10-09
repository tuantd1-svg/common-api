package com.example.commonapi.system;

import com.example.commonapi.model.AbstractTimestampEntity;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Data
@Document(value = "SystemParam")
public class SystemParam extends AbstractTimestampEntity {
    @Id
    private Long id;
    private String paramName;
    private String paramValue;
    private String defaultValue;
    private String serviceEnable;
}
