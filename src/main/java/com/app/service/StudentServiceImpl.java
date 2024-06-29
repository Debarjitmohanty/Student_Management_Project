package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.repository.StudentRepository;
import com.app.student.Student;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired 
	private StudentRepository studentRepository;
	
	@Override
	public List<Student> getAllStudent() {
		
		return studentRepository.findAll();
	}

	@Override
	public void saveStudents(Student student) {
		this.studentRepository.save(student);
		
	}

	@Override
	public Student updateStudent(Long id) {
		Optional<Student> optional = studentRepository.findById(id);
		Student student=null;
		student=optional.get();
		return student;
	}

	@Override
	public void deleteStudent(Long id) {
		this.studentRepository.deleteById(id);
		
	}

}
