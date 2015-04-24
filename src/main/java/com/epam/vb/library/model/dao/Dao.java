package com.epam.vb.library.model.dao;

import com.epam.vb.library.model.model.BaseEnity;

public interface Dao<T extends BaseEnity> {
    //INSERT
    T insert(T entity) throws DaoException;

    //FIND
    T findById(Long Id) throws DaoException;

    //UPDATE
    void update(T entity) throws DaoException;

    //DELETE
    boolean delete(T entity) throws DaoException;

    boolean deleteById(Long Id) throws DaoException;

}
