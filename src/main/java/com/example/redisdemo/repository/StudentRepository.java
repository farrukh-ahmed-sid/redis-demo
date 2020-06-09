package com.example.redisdemo.repository;

import com.example.redisdemo.model.Student;

import java.util.Map;

public interface StudentRepository {

    Student findById(Integer id);
    Map<Integer, Student> findAll();
    void save(Student student);
    void update(Student student);
    void delete(Integer id);

}
