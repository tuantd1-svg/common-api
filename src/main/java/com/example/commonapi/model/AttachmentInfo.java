package com.example.commonapi.model;

import lombok.Data;


@Data
public class AttachmentInfo {
    private String fileName;
    private byte[] fileContent;
    private String contentType;
}
