package com.example.redisdemo.mapper;


import com.example.redisdemo.dto.StudentDto;
import com.example.redisdemo.model.Student;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    StudentDto map(Student student);
}
