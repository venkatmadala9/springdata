/*package com.springdata.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.springdata.model.Student;
import com.springdata.repository.MyRepository;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class StudentDAOImpl implements StudentDAO
{

	@Autowired
	private MyRepository myRepository;
    
    public void createStudent(Student student)
    {
    	myRepository.persist(student);
    }

    public Student getStudentById(long id)
    {
        return myRepository.findOne(id);
    }

    public List<Student> getAllStudents()
    {
        return myRepository.createQuery("select stu from Student stu").getResultList();
    }

    public void updateStudent(Student student)
    {
    	myRepository.merge(student);
    }

    public void deleteStudent(long id)
    {
        Student s = myRepository.find(Student.class,id);
        myRepository.remove(s);
    }
    
    public List<Student> getStudentByAge(long age)
    {
    	return myRepository.createQuery(
    	        "SELECT s FROM Student s WHERE s.age >=:age")
    	        .setParameter("age", age)
    	        .getResultList();
    }
}*/