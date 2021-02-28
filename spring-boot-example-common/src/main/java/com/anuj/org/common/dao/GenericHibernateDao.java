package com.anuj.org.common.dao;

import com.anuj.org.common.entity.Entity;
import com.anuj.org.common.exception.DaoException;
import org.hibernate.Hibernate;
import org.hibernate.Session;

public class GenericHibernateDao<T extends Entity> extends HibernateHelper<T> implements GenericDao<T>{
    @Override
    public T findById(Long id) {
        Session session = getSession();
        session.get(getEntityClass(), id);
        return null;
    }

    @Override
    public T save(T entity) {
        Session session = getSession();
        session.saveOrUpdate(entity);
        return entity;
    }

    @Override
    public void delete(T entity) throws DaoException {
        Session session = getSession();
        session.delete(entity);
    }
}
