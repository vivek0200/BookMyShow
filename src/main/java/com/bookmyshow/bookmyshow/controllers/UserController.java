package com.bookmyshow.bookmyshow.controllers;

import com.bookmyshow.bookmyshow.dtos.ResponseStatus;
import com.bookmyshow.bookmyshow.dtos.SignUpRequestDTO;
import com.bookmyshow.bookmyshow.dtos.SignUpResponseDTO;
import com.bookmyshow.bookmyshow.model.User;
import com.bookmyshow.bookmyshow.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    public SignUpResponseDTO signUp(SignUpRequestDTO signUpRequestDTO) {
        SignUpResponseDTO response= new SignUpResponseDTO();
        try {
            User user=userService.SignUp(signUpRequestDTO.getFirstName(),signUpRequestDTO.getLastName(),signUpRequestDTO.getEmail()
                    ,signUpRequestDTO.getPassword());
            response.setUserId(user.getId());
            response.setResponseStatus(ResponseStatus.SUCCESS);
        }
        catch (Exception ex) {
            response.setResponseStatus(ResponseStatus.FAILURE);
        }
        return response;
    }
}
