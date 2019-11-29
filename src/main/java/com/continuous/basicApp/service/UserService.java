package com.continuous.basicApp.service;

import java.util.List;

import com.continuous.basicApp.model.User;

public interface UserService {
	
	public User findById(Long id);
	
	public User findByName(String name);
	
	public User findByNickName(String nickName);
	
	public void deleteById(Long id);
	
	public List<User> findAll();
	
	public User createUser(User user);
	
	public User updateUser(Long id, User user);

}
