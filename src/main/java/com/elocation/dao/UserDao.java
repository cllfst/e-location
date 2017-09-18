package com.elocation.dao;

import com.elocation.entity.User;

import java.util.Collection;

public interface UserDao {

    Collection<User> getAllUsers();

    User getUserById(int id);

    void removeUserByUsername(String username);

    void updateUser(User User);

    void insertUserToDb(User User);
}
