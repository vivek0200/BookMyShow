package com.bookmyshow.bookmyshow.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity
@Getter
@Setter
public class Screen extends BaseModel{
    private String name;

    @OneToMany
    private List<Seat>seats;

    @Enumerated(value = EnumType.ORDINAL)
    @ElementCollection
    private List<Feature>features;
}
