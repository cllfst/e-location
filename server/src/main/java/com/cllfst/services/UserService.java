package com.cllfst.services;

import com.cllfst.entities.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers();

    public void removeUser(Long idUser);

    User lookup(String username);

    void save(User user);

    boolean usernameExists(String username);
}
