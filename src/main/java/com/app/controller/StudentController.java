package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.service.StudentService;
import com.app.student.Student;


@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/")
	public String vieHomePage(Model model) {
		model.addAttribute("listStudents",studentService.getAllStudent());
		return "index";
	}
	
	@GetMapping("/showNewStudentForm")
	public String viewStudentForm(Model model) {
		Student student=new Student();
		model.addAttribute("student", student);
		return "new_student";
	}
	@PostMapping("/saveStudent")
	public String saveStudents(@ModelAttribute("student")Student student) {
		studentService.saveStudents(student);
		return "redirect:/";
	}
	
	@GetMapping("/showFormForUpdate/{id}")
	public String updateStudent(@PathVariable long id,Model model ) {
		model.addAttribute("Student",studentService.updateStudent(id));
		return "update_student";
	}
	
	@GetMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable long id) {
		studentService.deleteStudent(id);
		return "redirect:/";
	}

}
