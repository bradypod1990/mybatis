package com.feng.mybatis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feng.mybatis.mapper.GroupMapper;
import com.feng.mybatis.model.Group;
import com.feng.mybatis.service.GroupService;

@Service
public class GroupServiceImpl implements GroupService {

	@Autowired
	private GroupMapper groupMapper;
	
	@Override
	public List<Group> findAll() {
		return groupMapper.findAll();
	}

	@Override
	public void addGroup(Group group) {
		groupMapper.addGroup(group);
	}

}
