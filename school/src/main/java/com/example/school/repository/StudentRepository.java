package com.virtusa.school.repository;

import java.util.List;

import com.virtusa.school.entity.StudentEntity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository extends BaseRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public void save(StudentEntity student){
        Session session = sessionFactory.getCurrentSession();
        session.save(student);
    }

    public StudentEntity getStudentById(Integer id){
        Session session = sessionFactory.getCurrentSession();
        return session.get(StudentEntity.class,id);
    }

    public List<StudentEntity> getStudents(){
        Session session = sessionFactory.getCurrentSession();
        return session.createCriteria(StudentEntity.class).list();
    }

}