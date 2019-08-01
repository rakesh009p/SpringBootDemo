package com.stackroute.userservice.service;

import com.stackroute.userservice.domain.User;
import com.stackroute.userservice.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceimp implements UserService{
     private UserRepository userRepository;

    public UserServiceimp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
       User saveduser =userRepository.save(user);
        return saveduser;
    }

    @Override
    public User getUserById(int id) {
       User userid=userRepository.findById(id).get();
       return userid;
    }
}
