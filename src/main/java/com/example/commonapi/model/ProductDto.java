package com.example.commonapi.model;

import lombok.Data;
import org.springframework.data.annotation.ReadOnlyProperty;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
public class ProductDto {
    private Long id;
    private String title;
    private BigDecimal amount;
    private String description;
    private Boolean active;//con hang hay la het hang
    private int inventory;
    private Long idCategory;
    @ReadOnlyProperty
    private Double rate;
    private String createUser;
    private String updateUser;
    private String titleVariation;
    private BigDecimal discount;
    private List<Integer> size;
    private List<String> color;
    private List<String> imageProducts;
    private List<Map<String,String>>arrColor;
    private Date startDateActive;
    private Date endDateActive;
}
