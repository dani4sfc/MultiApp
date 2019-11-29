package com.continuous.basicApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.continuous.basicApp.model.User;
import com.continuous.basicApp.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired 
	UserRepository repository;

	@Override
	public User findById(Long id) {
		
		return repository.findById(id).get();
	}

	//CHeck, maybe it's necessary to configure a SQL/NoSQL database to get findByFields
	@Override
	public User findByName(String name) {
		return repository.findByName(name);
	}

	@Override
	public User findByNickName(String nickName) {
		return repository.findByNickName(nickName);
	}

	@Override
	public void deleteById(Long id) {
		
		if(repository.findById(id) != null) {
			repository.deleteById(id);
		}
	}

	@Override
	public List<User> findAll() {
		return repository.findAll();
	}

	@Override
	public User createUser(User user) {
		return repository.save(user);
	}

	@Override
	public User updateUser(Long id, User user) {
		
		//Check if it's necessary to set the attributes one by one
		
		if(repository.findById(id) != null) {
			return repository.save(user);
		}
		
		return null;
	}

}
