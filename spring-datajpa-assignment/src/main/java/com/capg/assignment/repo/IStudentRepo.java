package com.capg.assignment.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.assignment.model.Student;

public interface IStudentRepo extends JpaRepository<Student, Integer>{

}
