package com.epam.vb.library.model.dao;

public class JdbcDaoFactory extends DaoFactory {
    private static JdbcDaoFactory instance = new JdbcDaoFactory();

    public JdbcDaoFactory() {
    }

    public static DaoFactory getInstance() {
        return instance;
    }

    @Override
    public <T extends JdbcBaseDao> T create(Class<T> daoClass) {
        return null;
    }

}
