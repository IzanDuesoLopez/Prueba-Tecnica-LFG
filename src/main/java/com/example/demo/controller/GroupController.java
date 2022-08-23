package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Group;
import com.example.demo.service.GroupServiceImpl;

@RestController
@RequestMapping("/api")
public class GroupController {

	@Autowired
	GroupServiceImpl groupServiceImpl;
	
	// Show all groups
	@GetMapping("groups")
	public List<Group> listGroups(){
		return groupServiceImpl.listGroups();
	}
	
	// Get group by id
	@GetMapping("/groups/{id}")
	public Group groupById(@PathVariable(name="id") int id) {
		
		Group groupId= new Group();
		groupId = groupServiceImpl.groupById(id);
		
		return groupId;
	}
	
	// Create a new group
	@PostMapping("/groups")
	public Group createGroup(@RequestBody Group group) {
		return groupServiceImpl.saveGroup(group);
	}
	
	// Show groups by the game that people are playing
	@GetMapping("/groups/videogame/{videogame}")
	public List<Group> listGroupsByVideogame(@PathVariable(name="videogame") String videogame){
		return groupServiceImpl.findByVideogame(videogame);
	}
	
	
}
