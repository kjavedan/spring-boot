package com.RestApi.SpringBoot.service.impl;

import com.RestApi.SpringBoot.entity.User;
import com.RestApi.SpringBoot.repository.UserRepository;
import com.RestApi.SpringBoot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }
}
