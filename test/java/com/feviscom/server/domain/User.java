package com.feviscom.server.domain;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public final class User {
    public final int userId;
    public final String username;
    public final String password;
    public final String jogLogTableName;

    public User(int userId, String username, String password) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.jogLogTableName = String.format("JogLogTableUser_%d", userId);
    }

    public static User fromSelectQuery(ResultSet resultSet) throws SQLException {
        int userId = resultSet.getInt("userId");
        String userName = resultSet.getString("userName");
        String passwordHash = resultSet.getString("passwordHash");
        return new User(userId, userName, passwordHash);
    }

    public void setPreparedStatementParameter(PreparedStatement statement) throws SQLException {
        statement.setInt(1, userId);
        statement.setString(2, username);
        statement.setString(3, password);
    }
}