package com.example.commonapi.model;

import com.example.commonapi.anotation.anotation.Gender;
import com.example.commonapi.anotation.anotation.MaskedField;
import com.example.commonapi.anotation.anotation.MobileNo;
import com.example.commonapi.model.Address;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @NotNull(message = "username is not null")
    private String username;
    @NotNull(message = "email is required")
    @Email
    private String email;
    @NotNull(message = "password is required")
    private String password;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date dob;
    private String fullName;
    @NotNull(message = "mobile is required")
    @MobileNo
    private String mobileNo;
    @Gender
    private String gender;
    private Address address;
}
