package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.UserInParty;

public interface IUserInPartyService {

	// Methods for userInParty CRUD
	public List<UserInParty> listUsersParties(); // List al party messages
	
	public UserInParty saveUserInParty(UserInParty userInParty); // Save logs
	
	public UserInParty userInPartyById(int id); // Search by id
	
	public UserInParty updateUserInParty(UserInParty userInParty); // Update logs
	
	public void deleteUserInParty(int id); // Delete logs
	
}
