package com.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.student.Student;

@Service
public interface StudentService  {
	
	List<Student> getAllStudent();
	void saveStudents(Student student);
	Student updateStudent(Long id);
	void deleteStudent(Long id);
}
