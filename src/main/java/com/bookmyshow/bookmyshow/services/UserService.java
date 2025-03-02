package com.bookmyshow.bookmyshow.services;

import com.bookmyshow.bookmyshow.model.User;
import com.bookmyshow.bookmyshow.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User SignUp(String firstName,String lastName,String email,String password) {
        User user = new User();
        Optional<User>optionalUser=userRepository.findByEmail(email);
        if(optionalUser.isPresent()) {
            throw new RuntimeException("User already exists");
        }
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setName(firstName + " " + lastName);
        user.setEmail(email);
        user.setPassword(password);
        return userRepository.save(user);
    }
}
