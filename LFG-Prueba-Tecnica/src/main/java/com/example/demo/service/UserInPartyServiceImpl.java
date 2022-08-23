package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.IUserInPartyDAO;
import com.example.demo.dto.UserInParty;

public class UserInPartyServiceImpl implements IUserInPartyService{

	@Autowired
	IUserInPartyDAO iUserInPartyDAO;
	
	@Override
	public List<UserInParty> listMessages() {
		return iUserInPartyDAO.findAll();
	}

	@Override
	public UserInParty saveUserInParty(UserInParty userInParty) {
		return iUserInPartyDAO.save(userInParty);
	}

	@Override
	public UserInParty userInPartyById(int id) {
		return iUserInPartyDAO.findById(id).get();
	}

	@Override
	public UserInParty updateUserInParty(UserInParty userInParty) {
		return iUserInPartyDAO.save(userInParty);
	}

	@Override
	public void deleteUserInParty(int id) {
		iUserInPartyDAO.deleteById(id);
		
	}

	@Override
	public UserInParty sendMessage(String message) {
		return iUserInPartyDAO.sendMessage(message);
	}

	@Override
	public UserInParty updateMessage(String message) {
		return iUserInPartyDAO.editMessage(message);
	}

	@Override
	public void deleteMessage(String message) {
		iUserInPartyDAO.deleteMessage(message);
		
	}

}
