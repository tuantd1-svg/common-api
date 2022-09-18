package com.example.commonapi.model;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;
@MappedSuperclass
public abstract class AbstractTimestampEntity {
    @CreatedDate
    @LastModifiedDate
    private Date createdDate;

    @CreatedDate
    @LastModifiedDate
    private Date updatedDate;


}
