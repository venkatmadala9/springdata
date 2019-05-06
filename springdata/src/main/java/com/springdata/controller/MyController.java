package com.springdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springdata.model.Student;
import com.springdata.service.MyService;

@RestController
public class MyController {
	
	@Autowired
	MyService myService;
	
	@RequestMapping(value="/Student/{id}")
	public Student getStudentById(@PathVariable("id")long id)
	{
		return myService.findStudentById(id);
	}
}
