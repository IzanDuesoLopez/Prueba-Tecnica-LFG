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
@Table(name="parties")
public class Party {

	// Entity attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="members")
	private int members;
	@Column(name="messages")
	private int messages;
	
	@OneToMany
	@JoinColumn(name="party_id")
	private List<UserInParty> userInParty;
	
	// Default constructor
	public Party() {
		
	}

	/**
	 * Constructor with parameters
	 * @param id
	 * @param members
	 * @param messages
	 * @param userInParty
	 */
	public Party(int id, int members, int messages, List<UserInParty> userInParty) {
		this.id = id;
		this.members = members;
		this.messages = messages;
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
	 * @return the messages
	 */
	public int getMessages() {
		return messages;
	}

	/**
	 * @param messages the messages to set
	 */
	public void setMessages(int messages) {
		this.messages = messages;
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
		return "Party [id=" + id + ", members=" + members + ", messages=" + messages + "]";
	}
}
