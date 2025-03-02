package com.bookmyshow.bookmyshow.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpResponseDTO {
    public int userId;
    public ResponseStatus responseStatus;

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }
    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }

}
