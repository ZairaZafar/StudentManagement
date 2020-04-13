package com.studentmanagment;

import com.studentmanagment.models.Students;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateManager {
    protected static SessionFactory factory;
    private Configuration configuration;

    public HibernateManager() {
        configureHibernate();
    }

    private void configureHibernate(){
        try {
            configuration = new Configuration();
            setConfiguration();
            annotateClasses();
        } catch (Throwable ex) {
            ex.printStackTrace();
            throw new ExceptionInInitializerError(ex);
        }
    }

    private void setConfiguration() {
        configuration.setProperty("hibernate.connection.username", "root");
        configuration.setProperty("hibernate.connection.password", "admin123");
        configuration.setProperty("hibernate.connection.url", "jdbc:mysql://localhost/learningJava");
        configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
        configuration.setProperty("hibernate.hbm2ddl.auto", "create-drop");
    }

    private void annotateClasses() {
        factory = configuration.addAnnotatedClass(Students.class).buildSessionFactory();
    }
}