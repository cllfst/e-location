package com.elocation.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import  com.elocation.entity.User;

@Repository
@Qualifier("mongoData")
public class MongoUserDao {

    public Collection<User> getAllUser() {
        return new ArrayList<User>(){
            {
                add(new User(1, "ahmedks", "ahmed@ahmed.com", "123", "ahmed",
                        "ksentini"));
            }
        };
    }

}
