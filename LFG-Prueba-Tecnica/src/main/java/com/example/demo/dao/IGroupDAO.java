package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Group;

public interface IGroupDAO extends JpaRepository<Group, Integer>{

	// Search group by videogame
	public List<Group> findByVideogame(String videogame);
	
}
