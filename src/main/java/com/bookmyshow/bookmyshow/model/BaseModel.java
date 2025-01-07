package com.bookmyshow.bookmyshow.model;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import javax.xml.crypto.Data;

@MappedSuperclass
@Getter
@Setter
public class BaseModel {
    @Id
    private int id;
    private Data createdAt;
    private Data updatedAt;
}
