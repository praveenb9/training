package com.capg.assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.assignment.model.Student;
import com.capg.assignment.repo.IStudentRepo;

@Service
public class StudentService implements IStudentService {

	@Autowired
	IStudentRepo repo;
	@Override
	public Student addStudent(Student student) {
		if(repo.existsById(student.getStudentId()))
		{
			throw new RuntimeException("Student Already exists");
		}
		return repo.save(student);
	}

	@Override
	public Student findStudent(int studentId) {
		if(!repo.existsById(studentId))
		{
			throw new RuntimeException("Student Does not exists");

		}
		return repo.getOne(studentId);
	}

	@Override
	public Student updateStudent(Student student) {
		Student stu = repo.getOne(student.getStudentId());
		stu.setStudentName(student.getStudentName());
		stu.setDob(student.getDob());
		
		return repo.save(stu);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void deleteStudent(int studentId) {
		if(!repo.existsById(studentId))
		{
			throw new RuntimeException("Student Does not exists");

		}
		repo.deleteById(studentId);
	}

}
