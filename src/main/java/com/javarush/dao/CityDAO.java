package com.javarush.dao;

import com.javarush.domain.City;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class CityDAO extends GenericDAO{

    public CityDAO(SessionFactory sessionFactory) {
        super(City.class, sessionFactory);
    }


    public List<City> getItems(int offset, int limit) {
        Query<City> query = getCurrentSession().createQuery("select c from City c", City.class);
        query.setFirstResult(offset);
        query.setMaxResults(limit);
        return query.list();
    }

    public int getTotalCount() {
        Query<Long> query = getCurrentSession().createQuery("select count(*) from City ", Long.class);
        return Math.toIntExact(query.uniqueResult());
    }
}