package com.bookmyshow.bookmyshow.model;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@MappedSuperclass
@Getter
@Setter
public class BaseModel {
    @Id
    private Integer id;
    private Date createdAt;
    private Date updatedAt;
}
