package com.bookmyshow.bookmyshow.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Booking extends BaseModel{
    private Date bookingData;
    @ManyToOne
    private User user;
    @ManyToOne
    private Show show;
    @OneToMany
    private List<Payment> paymentList;
    @OneToMany
    private List<ShowSeat>showSeatList;
    private int amount;
    @Enumerated(EnumType.ORDINAL)
    private BookingStatus status;
}
