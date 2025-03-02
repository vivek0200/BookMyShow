package com.bookmyshow.bookmyshow.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookTicketResponseDTO {
    public int bookingId;
    public int amount;
    public ResponseStatus responseStatus;

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }
}
