package com.springdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdata.model.Student;
import com.springdata.repository.MyRepository;

@Service
public class MyServiceImpl implements MyService {

	@Autowired
	private MyRepository myRepository;

	public Student findStudentById(long id) {
		return myRepository.findOne(id);
	}

}
