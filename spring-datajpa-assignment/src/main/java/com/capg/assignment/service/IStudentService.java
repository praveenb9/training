package com.capg.assignment.service;

import java.util.List;

import com.capg.assignment.model.Student;

public interface IStudentService {

	public Student addStudent(Student student);
	public Student findStudent(int studentId);
	public Student updateStudent(Student student);
	public List<Student> getAllStudents();
	public void deleteStudent(int studentId);

}
