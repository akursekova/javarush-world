package com.javarush.dao;

import com.javarush.domain.City;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class CityDAO {

    private final Class clazz;
    private final SessionFactory sessionFactory;

    public CityDAO(Class clazz, SessionFactory sessionFactory) {
        this.clazz = clazz;
        this.sessionFactory = sessionFactory;
    }

    public List<City> getItems(int offset, int limit) {
        Query<City> query = sessionFactory.getCurrentSession().createQuery("select c from City c", City.class);
        query.setFirstResult(offset);
        query.setMaxResults(limit);
        return query.list();
    }

    public int getTotalCount() {
        Query<Long> query = sessionFactory.getCurrentSession().createQuery("select count(c) from City c", Long.class);
        return Math.toIntExact(query.uniqueResult());
    }
}