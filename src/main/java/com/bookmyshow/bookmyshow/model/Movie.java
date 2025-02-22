package com.bookmyshow.bookmyshow.model;


import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Movie extends BaseModel {
    private String name;
    private int duration;
    private String genre;
    private double rating;
    @Enumerated(value = EnumType.STRING)
    @ElementCollection
    private List<Feature>features;
    @Enumerated(value = EnumType.ORDINAL)
    @ElementCollection
    private List<Language>languages;
    @ElementCollection
    private List<String> actors;
}
