package com.bookmyshow.bookmyshow.services;

import com.bookmyshow.bookmyshow.model.*;
import com.bookmyshow.bookmyshow.repository.BookingRepository;
import com.bookmyshow.bookmyshow.repository.ShowRepository;
import com.bookmyshow.bookmyshow.repository.ShowSeatRepository;
import com.bookmyshow.bookmyshow.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;


@Service
public class BookingService {
    private UserRepository userRepository;
    private ShowRepository showRepository;
    private ShowSeatRepository showSeatRepository;
    private BookingRepository bookingRepository;

    @Autowired
    BookingService(UserRepository userRepository, ShowRepository showRepository, ShowSeatRepository showSeatRepository,
                   BookingRepository bookingRepository) {
        this.userRepository = userRepository;
        this.showRepository = showRepository;
        this.showSeatRepository = showSeatRepository;
        this.bookingRepository = bookingRepository;
    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public Booking bookTicket(int showId, int userId, List<Integer>showSeatIds) {
        Booking booking = new Booking();
        Optional<User> userOptional=userRepository.findById(userId);
        if(userOptional.isEmpty()) {
            throw new RuntimeException("User not found");
        }
        User user = userOptional.get();
        Optional<Show>showOptional=showRepository.findById(showId);
        if(showOptional.isEmpty()) {
            throw new RuntimeException("Show not found");
        }
        Show show = showOptional.get();
        List<ShowSeat> showSeats=showSeatRepository.findAllById(showSeatIds);
        for(ShowSeat showSeat:showSeats) {
            if(showSeat.getSeatStatus()!= SeatStatus.EMPTY){
                throw new RuntimeException("Seat are not available");
            }
        }
        for(ShowSeat showSeat:showSeats) {
            showSeat.setSeatStatus(SeatStatus.BLOCKED);
            showSeat.setBlockedAt(new Date());
        }
        showSeatRepository.saveAll(showSeats);
        booking.setShow(show);
        booking.setUser(user);
        booking.setBookingData(new Date());
        booking.setAmount(1000);
        booking.setPaymentList(new ArrayList<>());
        booking.setShowSeatList(showSeats);
        return bookingRepository.save(booking);
    }
}
