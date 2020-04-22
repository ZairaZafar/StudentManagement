package com.studentmanagment.dao;

import com.studentmanagment.models.BaseEntity;

public interface DAOInterface<T extends BaseEntity> {

    T findById(Integer id);

    Integer save(T entity);

    void delete(T entity);

    void merge(T entity);

}
