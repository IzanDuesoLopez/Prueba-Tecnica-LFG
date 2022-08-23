package com.example.demo.service;

import java.util.List;

import javax.servlet.http.Part;

import com.example.demo.dto.Party;

public interface IPartyService {

	// Methods for party CRUD
	public List<Party> listParties(); // List all parties
	
	public Party saveParty(Party party); // Save party
	
	public Party partyById(int id); // Search party by id
	
	public Party updateParty(Party party); // Update party
	
	public void deleteParty(int id); // Delete party by id
	
}
