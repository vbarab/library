package com.epam.vb.library.model.dao;


import java.util.EnumMap;

public abstract class DaoFactory {

    public abstract <T extends JdbcBaseDao> T create(Class<T> daoClass);

    static EnumMap<Type, DaoFactory> factories = new EnumMap<>(Type.class);
    static {
        factories.put(Type.JDBC, JdbcDaoFactory.getInstance());
    }

public enum Type{
    JDBC,MYSQL
}
}
