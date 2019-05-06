package com.springdata.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springdata.model.Student;

public interface MyRepository extends JpaRepository<Student, Serializable>
{
	
}
