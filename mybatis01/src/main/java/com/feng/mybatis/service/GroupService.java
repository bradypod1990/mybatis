package com.feng.mybatis.service;

import java.util.List;

import com.feng.mybatis.model.Group;

public interface GroupService {

	public List<Group> findAll();
	
	public void addGroup(Group group);
}
