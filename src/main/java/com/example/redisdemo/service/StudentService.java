package com.example.redisdemo.service;

import com.example.redisdemo.dto.StudentDto;
import com.example.redisdemo.mapper.StudentMapper;
import com.example.redisdemo.model.Student;
import com.example.redisdemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentMapper studentMapper;

    public void save(Student student){
        studentRepository.save(student);
    }

    public Map<Integer, Student> findAll(){
        return studentRepository.findAll();
    }

    public void delete(Integer id){
        studentRepository.delete(id);
    }

    public StudentDto findStudentById(Integer id){
        Student student = studentRepository.findById(id);
        return studentMapper.map(student);
    }
}
