package com.socialmedia.poc.document;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is a DTO class. This class is used to update user follower 
 * list.
 * @author Manoj
 *
 */
public class UpdateFollower {

	
	@JsonProperty("id")
	private String id;
	
	
	@JsonProperty("followerDetail")
	private Follower followerDetail;


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public Follower getFollowerDetail() {
		return followerDetail;
	}


	public void setFollowerDetail(Follower followerDetail) {
		this.followerDetail = followerDetail;
	}
	
	
}
