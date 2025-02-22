package com.bookmyshow.bookmyshow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Seat extends BaseModel{
    private String seatNumber;
    private int rowVal;
    private int colVal;
    @ManyToOne
    private SeatType seatType;
}
