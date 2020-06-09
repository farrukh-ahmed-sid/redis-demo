package com.example.redisdemo.controller;

import com.example.redisdemo.model.Student;
import com.example.redisdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/rest/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Student student){
        studentService.save(student);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Map<Integer, Student> findAll(){
        return studentService.findAll();
    }

}
