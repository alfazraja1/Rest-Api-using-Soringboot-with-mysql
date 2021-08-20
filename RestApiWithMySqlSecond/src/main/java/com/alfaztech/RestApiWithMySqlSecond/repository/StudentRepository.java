package com.alfaztech.RestApiWithMySqlSecond.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alfaztech.RestApiWithMySqlSecond.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
