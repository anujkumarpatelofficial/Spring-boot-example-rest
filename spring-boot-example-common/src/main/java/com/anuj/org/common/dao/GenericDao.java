package com.anuj.org.common.dao;

import com.anuj.org.common.entity.Entity;
import com.anuj.org.common.exception.DaoException;

public interface GenericDao<E extends Entity>{

    E findById(Long Id);
    E save(E entity);
    void delete(E entity) throws DaoException;

}
