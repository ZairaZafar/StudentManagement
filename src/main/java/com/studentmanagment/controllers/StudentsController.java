package com.studentmanagment.controllers;

import com.studentmanagment.models.Students;
import com.studentmanagment.services.StudentService;

import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("v1/students")
public class StudentsController {

    @EJB
    private StudentService studentService;

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List getStudentsDOA() {
        List students = studentService.getAllStudents();
        return students;
    }

    @GET
    @Path("/{param}")
    @Produces({MediaType.APPLICATION_JSON})
    public Students getStudentWithId(@PathParam("param") Integer id) {
        Students students = studentService.getStudent(id);
        return students;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void createStudent(Students students) {
        studentService.addStudent(students);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateStudent(Students students) {
        studentService.updateAge(students);
    }

    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    public void deleteStudent(Students students) {
        studentService.deleteStudent(students);
    }
}
