package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Group;

public interface IGroupService {

	// Methods for group CRUD
	public List<Group> listGroups(); // List all groups
	
	public Group saveGroup(Group group); // Create new group
	
	public List<Group> findByVideogame(String videogame); // Search by videogame
	
	public Group groupById(int id); // Search by id
	
	public Group updateGroup(Group group); // Update group
	
	public void deleteGroup(int id); // Delete group
	
}
