package com.bookmyshow.bookmyshow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Payment extends BaseModel{
    private double amount;
    private Date paymentDate;
    @Enumerated(value = EnumType.ORDINAL)
    private PaymentMode paymentMode;
    private String refNumber;
    @Enumerated(value = EnumType.ORDINAL)
    private PaymentStaus paymentStaus;
    @Enumerated(value = EnumType.ORDINAL)
    private PaymentGateway paymentGateway;
    @ManyToOne
    private Booking booking;
}
