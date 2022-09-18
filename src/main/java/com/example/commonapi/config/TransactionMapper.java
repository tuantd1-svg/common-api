package com.example.commonapi.config;

import com.example.commonapi.model.ResultMessage;
import com.example.commonapi.model.TransactionInfo;
import com.example.commonapi.parameter.enumable.EMessage;
import com.example.commonapi.parameter.enumable.ETransactionStatus;

public class TransactionMapper {
    public static ResultMessage map(TransactionInfo transactionInfo)
    {
        if(ETransactionStatus.SUCCESS.getStatus() == transactionInfo.getErrCode())
        {
            return new ResultMessage(EMessage.EXECUTE,transactionInfo);
        }
        return new ResultMessage(EMessage.INTERNAL_ERROR,transactionInfo);
    }
}
