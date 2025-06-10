package com.ex.spring_security.service;


import com.ex.spring_security.model.User;
import com.ex.spring_security.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo  userRepo;
    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public User saveUser (User user) {

        user.setPassword(encoder.encode(user.getPassword()));

        return userRepo.save(user);
    }
}
