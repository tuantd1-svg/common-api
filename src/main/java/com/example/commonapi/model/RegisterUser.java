package com.example.commonapi.model;

import com.example.commonapi.parameter.enumable.ELanguage;
import com.example.commonapi.parameter.enumable.ERole;
import com.example.commonapi.parameter.enumable.ESend;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Data
@Builder
public class RegisterUser {
    private String username;
    private String email;
    private String mobileNo;
    private String fullName;
    private Date dob;
    private Set<ERole> role;
    private ELanguage language;
    private ESend DefaultSendNotification;
    private String address;
    private Date createdDate;

}
