package com.cllfst.services;

import com.cllfst.entities.User;

public interface UserService {
    User lookup(String username);

    void save(User user);

    boolean usernameExists(String username);
}
