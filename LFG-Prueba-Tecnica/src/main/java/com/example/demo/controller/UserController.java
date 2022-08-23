package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.User;
import com.example.demo.service.UserServiceImpl;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	UserServiceImpl userServiceImpl;
	
	// Get users
	@GetMapping("/users")
	public List<User> listUsers(){
		return userServiceImpl.listUsers();
	}
	
	// Create a new user
	@PostMapping("/users")
	public User saveUser(@RequestBody User user) {
		return userServiceImpl.saveUser(user);
	}
	
	// Get user by id
	@GetMapping("/users/{id}")
	public User userById(@PathVariable(name="id") int id) {
		User userId = new User();
		userId = userServiceImpl.userById(id);
		return userId;
	}
	
	// Update user, in this case, only the steam username
	@PutMapping("/users/{id}")
	public User updateUser(@PathVariable(name="id") int id, @RequestBody User user) {
		User user_selected= new User();
		User user_updated= new User();
		
		user_selected= userServiceImpl.userById(id);
		
		user_selected.setSteam_username(user.getSteam_username());
		
		user_updated = userServiceImpl.updateUser(user_selected);
		return user_updated;
	}
	
	// Delete user by id
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable(name="id") int id) {
		userServiceImpl.deleteUser(id);
	}

}
