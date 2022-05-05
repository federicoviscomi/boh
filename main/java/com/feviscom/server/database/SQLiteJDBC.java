package com.feviscom.server.database;

import com.feviscom.server.domain.JogLogData;
import com.feviscom.server.domain.User;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;

/**
 * API Users must be able to create an account and log in.
 * <p>
 * All API calls must be authenticated.
 * <p>
 * Implement at least three roles with different permission levels: a regular user would only be able to CRUD on
 * their owned records, a user manager would be able to CRUD only users, and an admin would be able to CRUD all
 * records and users.
 * <p>
 * Each time entry when entered has a date, distance, time, and location.
 * <p>
 * Based on the provided date and location, API should connect to a weather API provider and selectFromUsers the weather conditions
 * for the run, and store that with each run.
 * <p>
 * The API must create a report on average speed & distance per week.
 * <p>
 * The API must be able to return data in the JSON format.
 * <p>
 * The API should provide filter capabilities for all endpoints that return a list of elements, as well should be able
 * to support pagination.
 * <p>
 * The API filtering should allow using parenthesis for defining operations precedence and use any combination of the
 * available fields. The supported operations should at least include or, and, eq (equals), ne (not equals), gt
 * (greater than), lt (lower than).
 * Example -> (date eq '2016-05-01') AND ((distance gt 20) OR (distance lt 10)).
 */

public class SQLiteJDBC {

    private static SQLiteJDBC db = null;
    private Connection connection;

    private SQLiteJDBC() throws SQLException, ClassNotFoundException, IOException {
        /*
         * TODO remove this line before the presentation!
         */
        try {
            Files.delete(Paths.get("/Users/feviscom/workspace/jogFun/jogger.db"));
        } catch (IOException e) {
            //e.printStackTrace();
        }

        Class<?> orgSqliteJDBC = Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection("jdbc:sqlite:jogger.db");
        connection.setAutoCommit(true);
        createTableUsers();
    }

    public synchronized static SQLiteJDBC getInstance() throws SQLException, IOException, ClassNotFoundException {
        if (null == SQLiteJDBC.db) {
            SQLiteJDBC.db = new SQLiteJDBC();
        }
        return SQLiteJDBC.db;
    }

    private void createTableUsers() throws SQLException, IOException {
        Statement statement = connection.createStatement();
        // TODO add password hashing and salting!
        // TODO add sign/log in with google!
        String createJoggerTableQuery = new String(Files.readAllBytes(Paths.get("src/main/sql/Users/createTableUsers.sql")));
        statement.executeUpdate(createJoggerTableQuery);
        statement.close();
    }

    public void insertIntoUsers(User user) throws SQLException, IOException {
        String addUserQuery = new String(Files.readAllBytes(Paths.get("src/main/sql/Users/insertIntoUsers.sql")));
        PreparedStatement statement = connection.prepareStatement(addUserQuery);
        user.setPreparedStatementParameter(statement);
        statement.executeUpdate();
        statement.close();
    }

    public void removeUser(User user) {
        throw new RuntimeException("method not implemented");
    }

    public User selectFromUsers(User user) throws IOException, SQLException {
        String getUserQuery = new String(Files.readAllBytes(Paths.get("src/main/sql/Users/selectFromUsers.sql")));
        PreparedStatement statement = connection.prepareStatement(getUserQuery);
        statement.setInt(1, user.userId);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            return User.fromSelectQuery(resultSet);
        } else {
            return null;
        }
    }

    public void createJogLogTableAndIndex(User user) throws SQLException, IOException {
        String tableName = user.jogLogTableName;
        tableName.chars().forEach(c -> {
            if (!Character.isLetterOrDigit(c) && c != '_') {
                throw new IllegalArgumentException();
            }
        });
        Statement statement = connection.createStatement();
        String sql = String.format(new String(Files.readAllBytes(Paths.get("src/main/sql/JogLogTable/createTableJogLog.sql"))), tableName, tableName, tableName);
        statement.executeUpdate(sql);
        statement.close();
    }

    public void insertIntoJogLogTable(User user, JogLogData jogLog) throws IOException, SQLException {
        String tableName = user.jogLogTableName;
        String sql = String.format(new String(Files.readAllBytes(Paths.get("src/main/sql/JogLogTable/insertIntoJogLog.sql"))), tableName);
        PreparedStatement addJogStatement = connection.prepareStatement(sql);
        jogLog.setPreparedStatementParameter(addJogStatement);
        addJogStatement.executeUpdate();
        addJogStatement.close();
    }

    public ResultSet selectFromJogLog(User user, String filter) throws SQLException {
        String sql = String.format("SELECT * FROM %s WHERE %s", user.jogLogTableName, filter);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        statement.close();
        return resultSet;
    }
}
