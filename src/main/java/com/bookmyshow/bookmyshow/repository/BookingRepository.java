package com.bookmyshow.bookmyshow.repository;

import com.bookmyshow.bookmyshow.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Integer> {
}
