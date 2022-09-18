package com.example.commonapi.model;

import com.example.commonapi.parameter.enumable.EMessage;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ResultMessage<T> extends TransactionInfo {
    EMessage message;
    private T data;

    public ResultMessage(Integer ErrCode, String ErrMsg, Boolean isSuccess, EMessage message, T data) {
        super(ErrCode, ErrMsg, isSuccess);
        this.message = message;
        this.data = data;
    }

    public ResultMessage(EMessage message, T data) {
        this.message = message;
        this.data = data;
    }

    public ResultMessage(EMessage message) {
        this.message = message;
    }

    public ResultMessage(int ErrCode, String ErrMsg, boolean isSuccess, EMessage message) {
        super(ErrCode, ErrMsg, isSuccess);
        this.message = message;
    }
    public ResultMessage(EMessage message,TransactionInfo transactionInfo) {
        super(transactionInfo.getErrCode(), transactionInfo.getErrMsg(), transactionInfo.getIsSuccess());
        this.message = message;
    }


}
