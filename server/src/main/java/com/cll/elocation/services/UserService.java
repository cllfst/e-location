package com.cll.elocation.services;

import com.cll.elocation.entities.User;

public interface UserService {


    public User lookup(String username);

    public void save(User user);

    public boolean usernameExists(String username);


}
