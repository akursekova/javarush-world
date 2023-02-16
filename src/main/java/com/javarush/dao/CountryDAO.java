package com.javarush.dao;

import com.javarush.domain.Country;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;


public class CountryDAO {

    private SessionFactory sessionFactory;

    public CountryDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Country> getAll() {
        try(Session session = sessionFactory.openSession()) {
            return session.createQuery("from com.javarush.domain.Country", Country.class)
                    .list();
        }
    }
}
