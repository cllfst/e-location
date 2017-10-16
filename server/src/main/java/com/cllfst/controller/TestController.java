package com.cllfst.controller;

import com.cllfst.dao.AnnonceRepository;
import com.cllfst.entities.Annonce;
import com.cllfst.entities.User;
import com.cllfst.services.AnnonceService;
import com.cllfst.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
public class TestController {
	@Autowired
	AnnonceService annonceService;
	@Autowired
	UserService userService;

	@GetMapping("/users")
	@CrossOrigin
	public List<User> getAllUsersService() {
		return userService.getAllUsers();
	}

	@GetMapping("/secret")
	@CrossOrigin
	public String secretService() {
		return "A secret message";
	}

	@GetMapping("/public")
	@CrossOrigin
	public String publicService() {
		return "A Public message";
	}

	@GetMapping("/annonces")
	@CrossOrigin
	public Collection<Annonce> getAllAnnonces(){return annonceService.getAll();}

	@GetMapping(value ="annonces/{id}")
	public Annonce getAnnonceById(@PathVariable("id") Long id){

		return annonceService.getAnnonceById(id);
	}

	@GetMapping(value ="users/{id}")
	public User getUserById(@PathVariable("id") Long id){

		return userService.getUserById(id);
	}
}
