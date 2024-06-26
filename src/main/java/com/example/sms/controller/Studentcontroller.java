package com.example.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.sms.service.StudentService;

@Controller
public class Studentcontroller  {
	
	private StudentService studentService;

	public Studentcontroller(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	//handler method to handle  list students and return mode and view	
	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "students";	
	}
	
}
