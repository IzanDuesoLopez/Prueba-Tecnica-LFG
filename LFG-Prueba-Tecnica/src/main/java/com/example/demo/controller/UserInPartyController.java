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

import com.example.demo.dto.UserInParty;
import com.example.demo.service.UserInPartyServiceImpl;

@RestController
@RequestMapping("/api")
public class UserInPartyController {

	@Autowired
	UserInPartyServiceImpl userInPartyServiceImpl;
	
	// Get messages
	@GetMapping("/usersParties")
	public List<UserInParty> listUsersInParties(){
		return userInPartyServiceImpl.listUsersParties();
	}
	
	// Post new message
	@PostMapping("/usersParties")
	public UserInParty enterParty(@RequestBody UserInParty userInParty) {
		return userInPartyServiceImpl.saveUserInParty(userInParty);
	}
	
	// Get messages by id
	@GetMapping("/usersParties/{id}")
	public UserInParty userInPartyBuId(@PathVariable(name="id") int id) {
		
		UserInParty userInPartyId= new UserInParty();
		
		userInPartyId=userInPartyServiceImpl.userInPartyById(id);
		
		return userInPartyId;
	}
	
	// Edit message
	@PutMapping("/usersParties/{id}")
	public UserInParty updateUserInPartyMessage(@PathVariable(name="id")int id,@RequestBody UserInParty userInParty) {
		
		UserInParty userInParty_selected= new UserInParty();
		UserInParty userInParty_updated= new UserInParty();
		
		userInParty_selected= userInPartyServiceImpl.userInPartyById(id);
		
		userInParty_selected.setMessage(userInParty.getMessage());
		
		userInParty_updated = userInPartyServiceImpl.updateUserInParty(userInParty_selected);
		
		
		return userInParty_updated;
	}
	
	// Delete message by id
	@DeleteMapping("/usersParties/{id}")
	public void exitParty(@PathVariable(name="id") int id) {
		userInPartyServiceImpl.deleteUserInParty(id);
	}
	
}
