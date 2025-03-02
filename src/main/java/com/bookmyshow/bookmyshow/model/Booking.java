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

    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public BookingStatus getStatus() {
        return status;
    }
    public void setShowSeatList(List<ShowSeat> showSeatList) {
        this.showSeatList = showSeatList;
    }
    public void setPaymentList(List<Payment> paymentList) {
        this.paymentList = paymentList;
    }
    public void setShow(Show show) {
        this.show = show;
    }
    public void setBookingData(Date bookingData) {
        this.bookingData = bookingData;
    }
    public void setUser(User user) {
        this.user = user;
    }
}
