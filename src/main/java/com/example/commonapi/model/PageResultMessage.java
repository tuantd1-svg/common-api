package com.example.commonapi.model;

import com.example.commonapi.parameter.enumable.EMessage;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PageResultMessage<T> extends ResultMessage<T>{
    private int pageSize;
    private int pageNumber;
    private long totalElement;
    private int totalPage;
    private boolean isLastIndex;

    public PageResultMessage(int pageSize, int pageNumber, long totalElement, int totalPage, boolean isLastIndex) {
        this.pageSize = pageSize;
        this.pageNumber = pageNumber;
        this.totalElement = totalElement;
        this.totalPage = totalPage;
        this.isLastIndex = isLastIndex;
    }
    public PageResultMessage(EMessage message,PageInfo pageInfo,T data)
    {

        super(message, data);
        this.pageSize = pageInfo.getPageSize();
        this.pageNumber = pageInfo.getPageNumber();
        this.totalElement = pageInfo.getTotalElement();
        this.totalPage = pageInfo.getTotalPage();
        this.isLastIndex = pageInfo.isLastIndex();
    }

    public PageResultMessage(Integer ErrCode, String ErrMsg, Boolean isSuccess, EMessage message, T data, int pageSize, int pageNumber, long totalElement, int totalPage, boolean isLastIndex) {
        super(ErrCode, ErrMsg, isSuccess, message, data);
        this.pageSize = pageSize;
        this.pageNumber = pageNumber;
        this.totalElement = totalElement;
        this.totalPage = totalPage;
        this.isLastIndex = isLastIndex;
    }
    public PageResultMessage(Integer ErrCode, String ErrMsg, Boolean isSuccess, EMessage message, T data,PageInfo pageInfo) {
        super(ErrCode, ErrMsg, isSuccess, message, data);
        this.pageSize = pageInfo.getPageSize();
        this.pageNumber = pageInfo.getPageNumber();
        this.totalElement = pageInfo.getTotalElement();
        this.totalPage = pageInfo.getTotalPage();
        this.isLastIndex = pageInfo.isLastIndex();
    }

    public PageResultMessage(EMessage message, T data, int pageSize, int pageNumber, long totalElement, int totalPage, boolean isLastIndex) {
        super(message, data);
        this.pageSize = pageSize;
        this.pageNumber = pageNumber;
        this.totalElement = totalElement;
        this.totalPage = totalPage;
        this.isLastIndex = isLastIndex;
    }

    public PageResultMessage(EMessage message, int pageSize, int pageNumber, long totalElement, int totalPage, boolean isLastIndex) {
        super(message);
        this.pageSize = pageSize;
        this.pageNumber = pageNumber;
        this.totalElement = totalElement;
        this.totalPage = totalPage;
        this.isLastIndex = isLastIndex;
    }

    public PageResultMessage(int ErrCode, String ErrMsg, boolean isSuccess, EMessage message, int pageSize, int pageNumber, long totalElement, int totalPage, boolean isLastIndex) {
        super(ErrCode, ErrMsg, isSuccess, message);
        this.pageSize = pageSize;
        this.pageNumber = pageNumber;
        this.totalElement = totalElement;
        this.totalPage = totalPage;
        this.isLastIndex = isLastIndex;
    }

    public PageResultMessage(EMessage message, TransactionInfo transactionInfo, int pageSize, int pageNumber, long totalElement, int totalPage, boolean isLastIndex) {
        super(message, transactionInfo);
        this.pageSize = pageSize;
        this.pageNumber = pageNumber;
        this.totalElement = totalElement;
        this.totalPage = totalPage;
        this.isLastIndex = isLastIndex;
    }
}
