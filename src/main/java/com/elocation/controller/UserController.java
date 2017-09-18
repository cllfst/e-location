package com.elocation.controller;

import com.elocation.entity.User;
import com.elocation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/Users")
public class UserController {

    @Autowired
    private UserService UserService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<User> getAllUsers(){
        return UserService.getAllUsers();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUserById(@PathVariable("id") int id){
        return UserService.getUserById(id);
    }

    @RequestMapping(value = "/{username}", method = RequestMethod.DELETE)
    public void deleteUserById(@PathVariable("username") String username){
        UserService.removeUserByUsername(username);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void deleteUserById(@RequestBody User User){
        UserService.updateUser(User);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertUser(@RequestBody User User){
        UserService.insertUser(User);
    }
}
