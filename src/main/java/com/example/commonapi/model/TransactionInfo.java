package com.example.commonapi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TransactionInfo {
    private Integer ErrCode;
    private String ErrMsg;
    private Boolean isSuccess;
}
