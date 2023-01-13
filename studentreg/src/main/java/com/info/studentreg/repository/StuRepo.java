package com.info.studentreg.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.info.studentreg.model.Student;

public interface StuRepo extends MongoRepository<Student,Integer> {

}
