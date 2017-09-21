package com.elocation.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import  com.elocation.entity.User;

@Repository
@Qualifier("mongoData")
public class MongoUserDao implements UserDao {


    @Autowired
    private UserDaoReository userRepository;

    @Override
    public Collection<User> getAllUsers() {


    /*     return new ArrayList<User>() {
            {
                add(new User(1, "ahmedks", "ahmed@ahmed.com", "123", "ahmed",
                        "ksentini"));
            }
        };
*/
    return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
       return userRepository.findById(id);
    }

    @Override
    public void removeUserByUsername(String username)
    {
        userRepository.delete(username);
    }


    @Override
    public void updateUser(User User) {

    }

    @Override
    public void insertUserToDb(User User) {

    }
}
