package com.alfaztech.RestApiWithMySqlSecond.controller;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alfaztech.RestApiWithMySqlSecond.model.Student;
import com.alfaztech.RestApiWithMySqlSecond.service.StudentService;

@RestController
@RequestMapping("/students")
public class EmployeeController {
	
	private StudentService studentService;

	public EmployeeController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	@PostMapping()
	public ResponseEntity<Student> saveEmployee(@RequestBody Student employee){
		return new ResponseEntity<Student>(studentService.saveStudent(employee), HttpStatus.CREATED);
	}
	
	@GetMapping()
	 public List<Student> allStudent()
	 {
		 return studentService.allStudent();
	}
   @GetMapping("{id}")
	public ResponseEntity<Student> findById(@PathVariable("id") int id)
   {
	   return new ResponseEntity<Student>(studentService.getStudentById(id), HttpStatus.OK);
   }
   @PutMapping("{id}")
   public ResponseEntity<Student> updateStudent(@RequestBody Student student,@PathVariable("id") int id)
   {
	   return new ResponseEntity<Student>(studentService.updateStudent(student, id), HttpStatus.OK);
   }
   
   @DeleteMapping("{id}")
   public ResponseEntity<String> deleteStudent(@PathVariable("id") int id)
   {
	   studentService.deleteStudent(id);
	   return new ResponseEntity<String>("delete Successfull....",HttpStatus.OK);
   }
   
}
