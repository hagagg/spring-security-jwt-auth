package com.ex.spring_security.service;

import com.ex.spring_security.model.User;
import com.ex.spring_security.model.UserDetailsImpl;
import com.ex.spring_security.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = repo.findByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException(username + " not found!");
        }

        return new UserDetailsImpl(user);
    }
}
