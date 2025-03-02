package com.bookmyshow.bookmyshow.repository;

import com.bookmyshow.bookmyshow.model.SeatStatus;
import com.bookmyshow.bookmyshow.model.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShowSeatRepository extends JpaRepository<ShowSeat, Integer> {
    List<ShowSeat> findAllByIdAndSeatStatusLike(Iterable<Integer>integers, SeatStatus seatStatus);
}
