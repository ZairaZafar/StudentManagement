package com.studentmanagment.dao;

import com.studentmanagment.models.Students;

import java.util.List;

public interface StudentDaoInterface extends DAOInterface<Students> {

    List<Students> getAllStudents();
}
