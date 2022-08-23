package com.example.demo.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="users")
public class User {

	// Entity attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	@Column(name="steam_username")
	private String steam_username;
	@Column(name="user_rol")
	private String user_rol;
	
	@OneToMany
	@JoinColumn(name="user_id")
	private List<Group> group;
	
	@OneToMany
	@JoinColumn(name="user_id")
	private List<UserInParty> userInParty;
	
	// Default constructor
	public User() {
		
	}

	/**
	 * Constructor with parameters
	 * @param id
	 * @param username
	 * @param password
	 * @param steam_username
	 * @param user_rol
	 * @param group
	 * @param userInParty
	 */
	public User(int id, String username, String password, String steam_username, String user_rol, List<Group> group,
			List<UserInParty> userInParty) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.steam_username = steam_username;
		this.user_rol = user_rol;
		this.group = group;
		this.userInParty = userInParty;
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
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the steam_username
	 */
	public String getSteam_username() {
		return steam_username;
	}

	/**
	 * @param steam_username the steam_username to set
	 */
	public void setSteam_username(String steam_username) {
		this.steam_username = steam_username;
	}

	/**
	 * @return the user_rol
	 */
	public String getUser_rol() {
		return user_rol;
	}

	/**
	 * @param user_rol the user_rol to set
	 */
	public void setUser_rol(String user_rol) {
		this.user_rol = user_rol;
	}

	/**
	 * @return the group
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Group")
	public List<Group> getGroup() {
		return group;
	}

	/**
	 * @param group the group to set
	 */
	public void setGroup(List<Group> group) {
		this.group = group;
	}

	/**
	 * @return the userInParty
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "UserInParty")
	public List<UserInParty> getUserInParty() {
		return userInParty;
	}

	/**
	 * @param userInParty the userInParty to set
	 */
	public void setUserInParty(List<UserInParty> userInParty) {
		this.userInParty = userInParty;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", steam_username="
				+ steam_username + ", user_rol=" + user_rol + "]";
	}
}
