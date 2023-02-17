package com.javarush.dao;

import com.javarush.domain.Country;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class CountryDAO extends GenericDAO{


    public CountryDAO(SessionFactory sessionFactory) {
        super(Country.class, sessionFactory);
    }

    public List<Country> getAll() {
        Query<Country> query = getCurrentSession().createQuery("select c from Country c", Country.class);
        return query.list();
    }
}