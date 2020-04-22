package com.studentmanagment.models;

import javax.persistence.*;
import java.util.Objects;

@MappedSuperclass
public abstract class BaseEntity {

    Integer id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public abstract boolean equals(Object o);

    @Override
    public int hashCode() {
        return Objects.hash(id, getClass().getName());
    }

}
