package com.feng.mybatis.mapper;

import java.util.List;

import com.feng.mybatis.model.User;

public interface UserMapper {

	
	public List<User> findAll();
	
	public void addUser(User user);
}
