package com.cllfst.services;


import com.cllfst.dao.UserRepository;
import com.cllfst.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired(required = true)
    private UserRepository userRepository;

    public UserServiceImpl(){

    }

    @Override
    public User lookup(String username) {

        return userRepository.findById(username).get();
    }

    @Override
    public void save(User user) {

        userRepository.save(user);
    }

    @Override
    public boolean usernameExists(String username) {
        return userRepository.equals(username);
    }
    @Override
    public List<User> getAllUsers() {

        return userRepository.findAll();
    }

    @Override
    public void removeUser(Long idUser) {

        userRepository.deleteById(idUser+"");

    }
}

