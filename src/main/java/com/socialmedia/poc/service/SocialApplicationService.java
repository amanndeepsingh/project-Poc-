package com.socialmedia.poc.service;

import com.socialmedia.poc.document.UpdateFollower;
import com.socialmedia.poc.document.User;
/**
 * This service class for social application
 * POC
 * @author home
 *
 */
public interface SocialApplicationService {

	/**
	 * This method is used to get user details from Mongo db 
	 * based in user id.
	 * @param id
	 * @return user details from mongo db
	 */
	User getUserDetail(String id);
	
	/**
	 * This method is used to save or create new user 
	 * in mongo db
	 * @param user
	 */
	void createUser(User user);
	
	/**
	 * This method is used to add user follower in mongo db
	 * @param follower
	 * @return true if user follower is update in mongo
	 */
	Boolean updateUserFollowers(UpdateFollower follower);
	
	
}
