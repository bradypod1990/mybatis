package com.feng.mybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.feng.mybatis.model.Student;
import com.feng.mybatis.service.StudentService;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;

@Controller
public class OrderController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/index")
	public String index() {
		PageBounds pageBounds = new PageBounds(1, 5);
		List<Student> list = studentService.findOrderByGroup(2, pageBounds);
		if(list != null) {
			for(Student s : list) {
				System.out.println(s);
			}
		}
		System.out.println("-----------------------------------------");
		List<Student> list2 = studentService.findAll();
		if(list2 != null) {
			for(Student s : list2) {
				System.out.println(s);
			}
		}
		return "index";
	}
}
