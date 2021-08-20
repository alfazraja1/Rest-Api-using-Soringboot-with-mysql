package com.alfaztech.RestApiWithMySqlSecond.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alfaztech.RestApiWithMySqlSecond.model.Student;
import com.alfaztech.RestApiWithMySqlSecond.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}



	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}



	@Override
	public List<Student> allStudent() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}



	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).orElseThrow();
	}



	@Override
	public Student updateStudent(Student student, int id) {
		// TODO Auto-generated method stub
		Student existStudent=studentRepository.findById(id).orElseThrow();
		
		existStudent.setName(student.getName());
		existStudent.setBranch(student.getBranch());
		studentRepository.save(existStudent);
		return existStudent;
	}



	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
		
	}


}
