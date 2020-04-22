package com.studentmanagment.models;

import javax.persistence.*;

@NamedQueries(
        {
                @NamedQuery(name = "Students-retrieveAll", query = "FROM Students"),
                @NamedQuery(name = "Students-retrieveWithID", query = "FROM Students where id = :studentID"),
                @NamedQuery(name = "Students-updateAge", query = "Update Students set age = :studentAge where id = :studentID"),
                @NamedQuery(name = "Students-deleteWithID", query = "delete from Students where id = :studentID"),
                @NamedQuery(name = "Students.getAllStudents",
                        query = "SELECT student " +
                                "FROM Students student"),

        }
)

@Entity
@Table(name="students")
public class Students extends BaseEntity {

    @Column(name = "name")
    public String name;
    @Column(name = "age")
    public int age;

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Students() {}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Students student = (Students) o;
        return (this.id == student.id);
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

