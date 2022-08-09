package com.springbootexa.springboot.service.impl;

import java.util.List;


import org.springframework.stereotype.Service;

import com.springbootexa.springboot.entity.Student;
import com.springbootexa.springboot.repository.StudentRepository;
import com.springbootexa.springboot.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;

	public StudentServiceImpl(StudentRepository studenRepository) {
		super();
		this.studentRepository = studenRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {

		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(long id) {

		studentRepository.deleteById(id);
	}

	

}
