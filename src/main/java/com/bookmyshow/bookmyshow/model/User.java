package com.bookmyshow.bookmyshow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class User extends BaseModel {
    private String firstName;
    private String lastName;
    public String name;
    public String email;
    public String password;
    @OneToMany
    private List<Booking>bookings;
}
