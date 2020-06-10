package com.example.redisdemo.controller;

import com.example.redisdemo.model.Student;
import com.example.redisdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public Map<Integer, Student> findAllStudents(){
        return studentService.findAll();
    }

    @DeleteMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Integer id){
        studentService.delete(id);
    }

    @GetMapping("/student")
    @ResponseStatus(HttpStatus.OK)
    public Student findStudentById(@RequestParam("id") Integer id){
        return studentService.findStudentById(id);
    }
}
