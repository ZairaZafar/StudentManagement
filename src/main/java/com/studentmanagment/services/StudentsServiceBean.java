package com.studentmanagment.services;

import com.studentmanagment.dao.StudentDaoInterface;
import com.studentmanagment.models.Students;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Local(StudentService.class)
@Stateless
public class StudentsServiceBean implements StudentService {

    @Inject
    private StudentDaoInterface studentDaoInterface;

    public Students getStudent(Integer id) {
        return studentDaoInterface.findById(id);
    }

    public List getAllStudents() { return studentDaoInterface.getAllStudents();
    }

    public void updateAge(Students student) {
        studentDaoInterface.merge(student);
    }

    public void deleteStudent(Students student) {
        student = studentDaoInterface.findById(student.getId());
        studentDaoInterface.delete(student);
    }

    public void addStudent(Students student) {
        studentDaoInterface.save(student);
    }
}
