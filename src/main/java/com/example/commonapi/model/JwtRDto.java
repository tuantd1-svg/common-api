package com.example.commonapi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JwtRDto {
    private Long id;
    private String username;
    private String reference;
    private String email;
    private List<String> roles;
    private Boolean isActive;
    private Boolean isDelete;
    private Boolean isLocked;
    private Boolean isResetPassword;
    private String token;
}
