package com.cll.elocation.services;


import com.cll.elocation.dao.UserRepository;
import com.cll.elocation.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

//@EnableJpaRepositories("com.cll.elocation.dao")
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
}

