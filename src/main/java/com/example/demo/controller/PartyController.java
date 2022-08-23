package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Party;
import com.example.demo.service.PartyServiceImpl;

@RestController
@RequestMapping("/api")
public class PartyController {

	@Autowired
	PartyServiceImpl partyServiceImpl;
	
	// Show parties
	@GetMapping("/parties")
	public List<Party> listParties(){
		return partyServiceImpl.listParties();
	}
	
	// Show party by id
	@GetMapping("/parties/{id}")
	public Party partyById(@PathVariable(name="id") int id) {
		
		Party partyById= new Party();
		
		partyById=partyServiceImpl.partyById(id);
		
		return partyById;
	}
	
}
