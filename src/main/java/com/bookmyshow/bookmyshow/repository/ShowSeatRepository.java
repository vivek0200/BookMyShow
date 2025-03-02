package com.bookmyshow.bookmyshow.repository;

import com.bookmyshow.bookmyshow.model.SeatStatus;
import com.bookmyshow.bookmyshow.model.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeat, Integer> {
    //List<ShowSeat> findAllByIdAndSeatStatusLike(Iterable<Integer>integers, SeatStatus seatStatus);
}
