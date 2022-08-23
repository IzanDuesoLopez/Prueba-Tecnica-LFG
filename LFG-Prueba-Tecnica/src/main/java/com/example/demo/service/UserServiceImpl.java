package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.IUserDAO;
import com.example.demo.dto.User;

public class UserServiceImpl implements IUserService{

	@Autowired
	IUserDAO iUserDAO;
	
	@Override
	public List<User> listUsers() {
		return iUserDAO.findAll();
	}

	@Override
	public User saveUser(User user) {
		return iUserDAO.save(user);
	}

	@Override
	public User userById(int id) {
		return iUserDAO.findById(id).get();
	}

	@Override
	public User updateUser(User user) {
		return iUserDAO.save(user);
	}

	@Override
	public void deleteUser(int id) {
		iUserDAO.deleteById(id);
		
	}

	@Override
	public List<User> findUserByName(String username) {
		return iUserDAO.findByUsername(username);
	}

	@Override
	public User editSteamUsername(String steam_username) {
		return iUserDAO.editSteamUsername(steam_username);
	}

}
