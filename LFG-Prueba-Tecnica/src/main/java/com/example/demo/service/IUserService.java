package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.User;

public interface IUserService {

	// Methods for user CRUD
	public List<User> listUsers(); // List all users
	
	public User saveUser(User user); // Save user
	
	public User userById(int id); // Search user by id
	
	public User updateUser(User user); // Update user
	
	public void deleteUser(int id); // Delete user by id
	
	public List<User> findUserByName(String username); // Find user by username
	
	public User editSteamUsername(String steam_username); // Edit steam username
	
}
