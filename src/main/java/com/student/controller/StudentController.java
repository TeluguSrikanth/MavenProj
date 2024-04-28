package com.student.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
import com.student.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	   StudentService studentService;
	   @PostMapping("/add")
	   public Student addStud(@RequestBody Student student)
	   {
		   return studentService.addStud(student);
	   }
	   @GetMapping("/fetch")
	   public List<Student> getAllStud()
	   {
		   return studentService.getAllStud();
	   }
	   @GetMapping("/fetch/{studId}")
	   public Optional<Student> getStud(@PathVariable int studId)
	   {
		   return studentService.getStud(studId);
	   }
}
