package com.bookmyshow.bookmyshow.repository;

import com.bookmyshow.bookmyshow.model.Show;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowRepository extends CrudRepository<Show, Integer> {

}
