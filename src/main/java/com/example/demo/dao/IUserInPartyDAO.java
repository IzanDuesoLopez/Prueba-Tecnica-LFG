package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.UserInParty;

public interface IUserInPartyDAO extends JpaRepository<UserInParty, Integer>{
	
}
