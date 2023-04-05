package com.example.commonapi.model;

import lombok.Data;
import org.springframework.data.annotation.ReadOnlyProperty;

import javax.validation.constraints.NotNull;

@Data
@NotNull
public class CategoryDto {
    @ReadOnlyProperty
    private Long id;
    private String name;
    private String title;
    private Boolean active;
    private String createUser;
    private String modifiedUser;
}