package com.socialmedia.poc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.socialmedia.poc.document.UpdateFollower;
import com.socialmedia.poc.document.User;
import com.socialmedia.poc.service.SocialApplicationService;

@RestController
public class SocialApplicationRestController {
	
	@Autowired
	SocialApplicationService service;
	
	@GetMapping("social/application/getuser")
	public ResponseEntity<?> getUserinfo(@RequestParam("id") String id){
		User userDetail = service.getUserDetail(id);
		if(userDetail !=null){
			return new ResponseEntity<User>(userDetail, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	
	
	@PostMapping("social/application/creatuser")
	public ResponseEntity<?> creatUser(@RequestBody User user){
		try{
		 service.createUser(user);
		}catch(Exception e){
			System.out.println(e.getStackTrace());
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		 return new ResponseEntity<>(HttpStatus.CREATED);
		
	}
	
	@PostMapping("social/application/updateFollower")
	public String updateUserFollower(@RequestBody UpdateFollower follower){
		 Boolean updateUserFollowers = service.updateUserFollowers(follower);
		 if(updateUserFollowers){
			 return "user Follower list is update successfully";
		 }
		 return "unble to add user follower for user id "+follower.getId();
		
	}
}
