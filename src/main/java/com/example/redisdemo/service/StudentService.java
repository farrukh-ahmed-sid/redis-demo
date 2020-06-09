package com.example.redisdemo.service;

import com.example.redisdemo.model.Student;
import com.example.redisdemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public void save(Student student){
        studentRepository.save(student);
    }

    public Map<Integer, Student> findAll(){
        return studentRepository.findAll();
    }
}
