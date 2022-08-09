package com.springbootexa.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootexa.springboot.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
