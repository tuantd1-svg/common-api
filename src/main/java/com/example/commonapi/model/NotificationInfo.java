package com.example.commonapi.model;

import com.example.commonapi.parameter.enumable.NotificationType;
import lombok.Data;

import java.util.List;

@Data
public class NotificationInfo {
    private NotificationType notificationType;
    private String subject;
    private String content;
    private String from;
    private String authType;
    private List<String> to;
    private AttachmentInfo attachmentInfo;
}
