package com.example.commonapi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PageInfo {
    private int pageSize;
    private int pageNumber;
    private int totalElement;
    private int totalPage;
    private boolean isLastIndex;
}
