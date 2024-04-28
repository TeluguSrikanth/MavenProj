package com.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.repo.StudentRepo;

@Service
public class StudentService {

	@Autowired
	  StudentRepo studentRepo;
	  
	  public Student addStud(Student student)
	  {
		  return studentRepo.save(student); 
	  }
	  public List<Student> getAllStud()
	  {
		   return studentRepo.findAll();
	  }
	  public Optional<Student> getStud(int studId)
	  {
		   return studentRepo.findById(studId);
	  }
}
