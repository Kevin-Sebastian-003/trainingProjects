package com.genbank.backend.repository;

import com.genbank.backend.model.Account;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TransactionRepos extends BaseRepo {

    @Autowired
    private SessionFactory sessionFactory;

    public void save(Account account){
        Session session = sessionFactory.getCurrentSession();
        session.save(account);
    }

    public Account getAccountBy(Integer id){
        Session session = sessionFactory.getCurrentSession();
        return session.get(Account.class,id);
    }

}