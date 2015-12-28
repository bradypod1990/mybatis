package com.feng.mybatis.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.feng.mybatis.model.Student;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
@TransactionConfiguration(transactionManager="transactionManager",defaultRollback=false)
public class StudentServiceTest {

	@Autowired
	private StudentService studentService;
	
	
	@Test
	public void testFindAll() {
		List<Student> list = studentService.findAll();
		
		if(list != null) {
			for(Student s : list) {
				System.out.println(s.getId() + ", name:" + s.getName() + ",groupName:" + s.getGroup().getName() );
			}
		}
	}
}
