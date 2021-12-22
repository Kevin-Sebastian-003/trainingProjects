package com.genbank.backend.repository;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import com.genbank.backend.model.User;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepo extends BaseRepo {

    @Autowired
    private SessionFactory sessionFactory;

    public void save(User user){
        Session session = sessionFactory.getCurrentSession();
        session.save(user);
    }

    public List<User> getAllUsers(){
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<User> criteria = builder.createQuery(User.class);
        criteria.from(User.class);
        return session.createQuery(criteria).getResultList();
    }
    public User getUserByUsername(String userName){
        Session session = sessionFactory.getCurrentSession();
        return session.get(User.class, userName);
    }

    public void updatePassword(String userName, String password){
        Session session = sessionFactory.getCurrentSession();
        User user = session.get(User.class, userName);
        user.setPassword(password);
        session.update(user);
    }

    public void deleteUser(String userName){
        Session session = sessionFactory.getCurrentSession();
        session.delete(session.get(User.class, userName));
    }

}