package com.feng.mybatis.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.feng.mybatis.model.User;
import com.feng.mybatis.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
@TransactionConfiguration(transactionManager="transactionManager")
public class UserDaoTest {

	@Autowired
	private UserService userService;
	
	
	@Test
	public void findAllTest() {
		List<User> list = userService.findAll();
		if(list != null) {
			for(User user : list) {
				System.out.println(user.getName());
			}
		}
	}
}
