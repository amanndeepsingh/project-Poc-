package com.socialmedia.poc.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.socialmedia.poc.document.Follower;
import com.socialmedia.poc.document.UpdateFollower;
import com.socialmedia.poc.document.User;
import com.socialmedia.poc.repository.UserRepository;
import com.socialmedia.poc.service.SocialApplicationService;

@Service
public class SocialApplicationServiceImpl implements SocialApplicationService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public User getUserDetail(String id) {
		 Optional<User> findById = userRepository.findById(id);
		 if(null != findById){
			 return findById.get();
		 }
		return null;
	}

	@Override
	public void createUser(User user) {
		userRepository.save(user);
	}

	@Override
	public Boolean updateUserFollowers(UpdateFollower follower) {
		
		Optional<User> findById = userRepository.findById(follower.getId());
		if(null!=findById)
		{
			User user = findById.get();
			List<Follower> followers = user.getFollowers();
			followers.add(follower.getFollowerDetail());
			user.setFollowers(followers);
			userRepository.save(user);
			return true;
		}
		return false;
	}

}
