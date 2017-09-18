package com.elocation.service;

import com.elocation.dao.UserDao;
import com.elocation.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {

    @Autowired
    @Qualifier("mongoData")
    private UserDao UserDao;

    public Collection<User> getAllUsers(){
        return this.UserDao.getAllUsers();
    }

    public User getUserById(int id){
        return this.UserDao.getUserById(id);
    }


    public void removeUserByUsername(String username) {
        this.UserDao.removeUserByUsername(username);
    }

    public void updateUser(User User){
        this.UserDao.updateUser(User);
    }

    public void insertUser(User User) {
        this.UserDao.insertUserToDb(User);
    }
}
