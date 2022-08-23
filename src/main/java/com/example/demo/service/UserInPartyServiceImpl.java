package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IUserInPartyDAO;
import com.example.demo.dto.UserInParty;

@Service
public class UserInPartyServiceImpl implements IUserInPartyService{

	@Autowired
	IUserInPartyDAO iUserInPartyDAO;

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
	public List<UserInParty> listUsersParties() {
		return iUserInPartyDAO.findAll();
	}

}
