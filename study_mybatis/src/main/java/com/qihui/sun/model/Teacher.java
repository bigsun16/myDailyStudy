package com.qihui.sun.model;

import lombok.Data;

import java.util.List;

@Data
public class Teacher {
    private int id;
    private String name;
    List<Student> students;
}
