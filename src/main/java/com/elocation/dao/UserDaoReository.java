package com.elocation.dao;

import com.elocation.entity.User;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface UserDaoReository extends MongoRepository<User, String> {
    User findFirstByUsername(String Username);

    User findById(Long ID);

    //Supports native JSON query string
    @Query("{User:'?0'}")
    User findCustomByUser(String User);

    @Query("{User: { $regex: ?0 } })")
    List<User> findCustomByRegExUser(String User);
}
