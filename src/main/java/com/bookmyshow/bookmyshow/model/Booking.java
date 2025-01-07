package com.bookmyshow.bookmyshow.model;

import jakarta.persistence.Entity;
import jdk.jfr.Enabled;
import lombok.Getter;
import lombok.Setter;

import javax.xml.crypto.Data;
import java.util.List;

@Entity
@Getter
@Setter
public class Booking extends BaseModel{
    private Data bookingData;
    private User user;
    private Show show;
    private List<Payment> paymentList;
    private List<ShowSeat>showSeatList;
    private int amount;
    private BookingStatus status;
}
