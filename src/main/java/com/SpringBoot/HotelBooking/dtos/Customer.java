package com.SpringBoot.HotelBooking.dtos;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer implements Serializable {

	private String name;
	private String emailId;
	private String number;
	private String gender;
	private Address address;

	private final static long serialVersionUID = 8957085700421283996L;

	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("emailId")
	public String getEmailId() {
		return emailId;
	}

	@JsonProperty("emailId")
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@JsonProperty("number")
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}