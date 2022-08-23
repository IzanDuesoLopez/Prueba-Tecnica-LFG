package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.IGroupDAO;
import com.example.demo.dto.Group;

public class GroupServiceImpl implements IGroupService{

	@Autowired
	IGroupDAO iGroupDAO;
	
	@Override
	public List<Group> listGroups() {
		return iGroupDAO.findAll();
	}

	@Override
	public Group saveGroup(Group group) {
		return iGroupDAO.save(group);
	}

	@Override
	public List<Group> findByVideogame(String videogame) {
		return iGroupDAO.findByVideogame(videogame);
	}

	@Override
	public Group groupById(int id) {
		return iGroupDAO.findById(id).get();
	}

	@Override
	public Group updateGroup(Group group) {
		return iGroupDAO.save(group);
	}

	@Override
	public void deleteGroup(int id) {
		iGroupDAO.deleteById(id);
		
	}

}
