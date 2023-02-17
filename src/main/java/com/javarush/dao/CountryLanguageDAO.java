package com.javarush.dao;

import com.javarush.domain.CountryLanguage;
import org.hibernate.SessionFactory;

public class CountryLanguageDAO extends GenericDAO{
    public CountryLanguageDAO(SessionFactory sessionFactory) {
        super(CountryLanguage.class, sessionFactory);
    }
}
