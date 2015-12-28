package com.feng.mybatis.mapper;

import java.util.List;

import com.feng.mybatis.model.Group;
import com.feng.mybatis.model.User;

public interface GroupMapper {

	
	public List<Group> findAll();
	
	public void addGroup(Group group);
}
