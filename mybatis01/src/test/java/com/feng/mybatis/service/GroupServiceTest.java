package com.feng.mybatis.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.feng.mybatis.model.Group;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
@TransactionConfiguration(transactionManager="transactionManager",defaultRollback=false)
public class GroupServiceTest {

	@Autowired
	private GroupService groupService;
	
	
	@Test
	public void testFindAll() {
		List<Group> list = groupService.findAll();
		
		if(list != null) {
			for(Group group : list) {
				System.out.println(group.getId() + ", name:" + group.getName() + ":students:" + group.getListStudent());
			}
		}
	}
}
