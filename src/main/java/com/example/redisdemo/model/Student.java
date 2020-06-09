package com.example.redisdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Student implements Serializable {

    private Integer id;
    private String name;
}
