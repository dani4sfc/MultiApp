package com.multi.multiApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.multi.multiApp.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>, JpaRepository<User, Long>{

	User findByName(String name);
	
	User findByNickName(String nickName);

}
