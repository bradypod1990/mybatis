package com.feng.mybatis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feng.mybatis.mapper.StudentMapper;
import com.feng.mybatis.model.Student;
import com.feng.mybatis.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentMapper studentMapper;
	
	@Override
	public List<Student> findAll() {
		return studentMapper.findAll();
	}


}
