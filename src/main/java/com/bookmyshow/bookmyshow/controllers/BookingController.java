package com.bookmyshow.bookmyshow.controllers;

import com.bookmyshow.bookmyshow.dtos.BookTicketRequestDTO;
import com.bookmyshow.bookmyshow.dtos.BookTicketResponseDTO;
import com.bookmyshow.bookmyshow.dtos.ResponseStatus;
import com.bookmyshow.bookmyshow.model.Booking;
import com.bookmyshow.bookmyshow.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookingController {
    private BookingService bookingService;

    @Autowired
    BookingController(BookingService bookingService){
        this.bookingService=bookingService;
    }

    public BookTicketResponseDTO bookTicket(BookTicketRequestDTO requestDTO) {
        BookTicketResponseDTO response = new BookTicketResponseDTO();
        try{
            Booking booking = bookingService.bookTicket(requestDTO.getShowId(),requestDTO.getUserId(),requestDTO.getShowSeatIds());
            response.setBookingId(booking.getId());
            response.setAmount(booking.getAmount());
            response.setResponseStatus(ResponseStatus.SUCCESS);
        }catch (Exception ex){
            response.setResponseStatus(ResponseStatus.FAILURE);
        }
        return response;
    }
}
