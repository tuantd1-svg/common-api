package com.example.commonapi.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class CartDto {
    private Long cartId;
    private Long cartItemId;
    private String session;
    private Long idUser;
    private String productName;
    private String description;
    private BigDecimal totalAmount;
    private BigDecimal amountAlterDiscount;
    private Double rate;
    private String variationDes;
    private String size;
    private String color;
    private int total;
    private List<String> images;
    private String image;
}
