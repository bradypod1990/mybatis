package com.feng.mybatis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feng.mybatis.mapper.UserMapper;
import com.feng.mybatis.model.User;
import com.feng.mybatis.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> findAll() {
		return userMapper.findAll();
	}

	@Override
	public void addUser(User user) {
		userMapper.addUser(user);
	}

}
