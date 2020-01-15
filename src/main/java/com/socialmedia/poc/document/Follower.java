package com.socialmedia.poc.document;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is POJO class for followers details. this class is used in user
 * class/ user collection in mogo
 * @author home
 *
 */
public class Follower {
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("address")
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
