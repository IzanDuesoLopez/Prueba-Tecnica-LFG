package com.example.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="groups")
public class Group {

	// Entity attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="videogame")
	private String videogame;
	@Column(name="members")
	private int members;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	// Default constructor
	public Group() {
		
	}

	/**
	 * Constructor with parameters
	 * @param id
	 * @param videogame
	 * @param members
	 * @param user
	 */
	public Group(int id, String videogame, int members, User user) {
		this.id = id;
		this.videogame = videogame;
		this.members = members;
		this.user = user;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the videogame
	 */
	public String getVideogame() {
		return videogame;
	}

	/**
	 * @param videogame the videogame to set
	 */
	public void setVideogame(String videogame) {
		this.videogame = videogame;
	}

	/**
	 * @return the members
	 */
	public int getMembers() {
		return members;
	}

	/**
	 * @param members the members to set
	 */
	public void setMembers(int members) {
		this.members = members;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Group [id=" + id + ", videogame=" + videogame + ", members=" + members + ", user=" + user + "]";
	}
}
