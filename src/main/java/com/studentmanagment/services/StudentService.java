package com.studentmanagment.services;

import com.studentmanagment.models.Students;

import java.util.List;

public interface StudentService {
    Students getStudent(Integer id);
    List getAllStudents();
    void updateAge(Students student);
    void deleteStudent(Students student);
    void addStudent(Students student);
}
