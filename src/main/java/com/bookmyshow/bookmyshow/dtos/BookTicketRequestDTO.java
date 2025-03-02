package com.bookmyshow.bookmyshow.dtos;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class BookTicketRequestDTO {
    public int showId;
    public List<Integer>showSeatIds;
    public int userId;

    public int getShowId() {
        return showId;
    }
    public void setShowId(int showId) {
        this.showId = showId;
    }
    public List<Integer> getShowSeatIds() {
        return showSeatIds;
    }
    public void setShowSeatIds(List<Integer> showSeatIds) {
        this.showSeatIds = showSeatIds;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
}
