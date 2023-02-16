package com.javarush.dao;

import org.hibernate.SessionFactory;

public class CountryLanguageDAO {

    private SessionFactory sessionFactory;

    public CountryLanguageDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
