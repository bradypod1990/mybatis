package com.feng.mybatis.mapper;

import java.util.List;

import com.feng.mybatis.model.Student;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;

public interface StudentMapper {

	
	public List<Student> findAll();
	
	public List<Student> findOrder(PageBounds pageBounds);
	
	
	public List<Student> findOrderByGroup(int group, PageBounds pageBounds);
}
