package com.continuous.basicApp.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.continuous.basicApp.model.User;
import com.continuous.basicApp.service.UserServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

@RequestMapping(value = "/users")

public class UserController {
	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserServiceImpl service;
	

	@GetMapping(path= "/{id}")
	public User findUserById(@PathVariable(value = "id") Long id) {
		return service.findById(id);
	}
	
	@GetMapping(path= "/")
	public List<User> getUsers(){
		return (List<User>) service.findAll();
	}

		
	@PostMapping(path="/")
	public User addUser (@RequestBody User user) {
		return service.createUser(user);
	}
	

	//Adapt id with the User.id
	@PutMapping(path="/{id}")
	public User updateUser(@PathVariable(value="id")Long id, @RequestBody User user) {
				
		if(user.getId( )== id) {
			return service.updateUser(id, user);

		}else {
			return null;
		}
	}
	
	
	@DeleteMapping(path="/{id}")
	public void deleteUserById (@PathVariable(value = "id") long id) {
		
		service.deleteById(id);
	}
	

	
	
}
