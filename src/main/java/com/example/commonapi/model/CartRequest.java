package com.example.commonapi.model;

import lombok.Data;

@Data
public class CartRequest {
    private Long idUser;
    private String session;
    private Boolean active;
}
