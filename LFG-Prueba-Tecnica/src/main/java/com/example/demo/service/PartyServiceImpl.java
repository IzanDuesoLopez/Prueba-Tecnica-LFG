package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IPartiesDAO;
import com.example.demo.dto.Party;

@Service
public class PartyServiceImpl implements IPartyService{

	@Autowired
	IPartiesDAO iPartiesDAO;
	
	@Override
	public List<Party> listParties() {
		return iPartiesDAO.findAll();
	}

	@Override
	public Party saveParty(Party party) {
		return iPartiesDAO.save(party);
	}

	@Override
	public Party partyById(int id) {
		return iPartiesDAO.findById(id).get();
	}

	@Override
	public Party updateParty(Party party) {
		return iPartiesDAO.save(party);
	}

	@Override
	public void deleteParty(int id) {
		iPartiesDAO.deleteById(id);
		
	}

}
