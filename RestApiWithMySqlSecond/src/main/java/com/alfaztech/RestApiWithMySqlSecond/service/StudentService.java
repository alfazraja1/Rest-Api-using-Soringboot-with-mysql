package com.alfaztech.RestApiWithMySqlSecond.service;

import java.util.List;

import com.alfaztech.RestApiWithMySqlSecond.model.Student;

public interface StudentService {
	
	Student saveStudent(Student student);
	List<Student> allStudent();
	Student getStudentById(int id);
	Student updateStudent(Student student,int id);
	void deleteStudent(int id);
	 

}
