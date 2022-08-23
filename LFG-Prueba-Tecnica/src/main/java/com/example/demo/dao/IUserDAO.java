package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.User;

public interface IUserDAO extends JpaRepository<User, Integer>{
	
	// Search users by username
	public List<User> findByUsername(String username);
	public User editSteamUsername(String steam_username);
}
