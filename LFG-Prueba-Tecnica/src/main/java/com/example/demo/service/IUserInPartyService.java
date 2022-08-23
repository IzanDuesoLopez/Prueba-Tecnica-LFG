package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.UserInParty;

public interface IUserInPartyService {

	// Methods for userInParty CRUD
	public List<UserInParty> listMessages(); // List al party messages
	
	public UserInParty saveUserInParty(UserInParty userInParty); // Save logs
	
	public UserInParty userInPartyById(int id); // Search by id
	
	public UserInParty updateUserInParty(UserInParty userInParty); // Update logs
	
	public void deleteUserInParty(int id); // Delete logs
	
	public UserInParty sendMessage(String message); // Send message to party
	
	public UserInParty updateMessage(String message); // Update message in party
	
	public void deleteMessage(String message); // Delete message by message content
	
}
