package com.example.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.sms.entity.Student;
import com.example.sms.repository.StudentRepository;
import com.example.sms.service.StudentService;

@Service

public class StudentServiceImpl implements StudentService {
	
	private StudentRepository StudentRepository;
	
	
	@Override
	public List<Student> getAllStudents() {
		return StudentRepository.findAll();
	}

	
}
