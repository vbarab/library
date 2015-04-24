package com.epam.vb.library.model.dao;

import java.sql.Connection;

public abstract class JdbcBaseDao <T> implements Dao {
    private Connection connection;
    public JdbcBaseDao() {}

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
