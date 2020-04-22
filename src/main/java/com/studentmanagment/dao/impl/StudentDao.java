package com.studentmanagment.dao.impl;

import com.studentmanagment.dao.BaseDao;
import com.studentmanagment.dao.StudentDaoInterface;
import com.studentmanagment.models.Students;

import javax.persistence.NoResultException;
import java.util.ArrayList;
import java.util.List;

public class StudentDao extends BaseDao<Students> implements StudentDaoInterface {

    private Class<Students> clazz;

    public StudentDao() {
        super(Students.class);
        this.clazz = Students.class;
    }

    public List<Students> getAllStudents( ){
        List<Students> students = new ArrayList<>();
        try{
            students = em
                    .createNamedQuery("Students.getAllStudents", clazz)
                    .getResultList();
        } catch(NoResultException ex){
            ex.printStackTrace();
        }
        return students;
    }


    /*private void executeWithTransaction(Query query, Session session) {
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            query.executeUpdate();
            tx.commit();
        } catch (HibernateException e) {
            if (tx!= null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }
    }*/

}
