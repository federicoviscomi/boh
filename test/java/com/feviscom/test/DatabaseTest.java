package com.feviscom.test;

import com.feviscom.server.database.SQLiteJDBC;
import com.feviscom.server.domain.JogLogData;
import com.feviscom.server.domain.User;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.AssertionsForClassTypes.fail;


public class DatabaseTest {
    private SQLiteJDBC jdbc;
    private User user;
    private JogLogData jogLog;

    @BeforeClass
    public void init() throws SQLException, IOException, ClassNotFoundException {
        jdbc = SQLiteJDBC.getInstance();
        user = new User(1, "username", "password1");
        jogLog = new JogLogData();
        jogLog.dateTimeStart = Date.valueOf("2017-08-22");
        jogLog.dateTimeEnd = Date.valueOf("2017-08-23");
        jogLog.distanceKm = 1000.234;
        jogLog.latitudeStart = 0;
        jogLog.longitudeStart = 1;
        jogLog.latitudeEnd = 2;
        jogLog.longitudeEnd = 3;
        jogLog.averageKevinTemperature = 23423434;
        jogLog.weatherReport = "raining cats and dogs";
    }

    @Test
    public void testAddUser() {
        Throwable thrown = catchThrowable(() -> jdbc.insertIntoUsers(user));
        assertThat(thrown).isNull();
    }

    @Test(dependsOnMethods = {"testAddUser"})
    public void testCreateUserTable() {
        Throwable thrown = catchThrowable(() -> jdbc.createJogLogTableAndIndex(user));
        assertThat(thrown).isNull();
    }

    @Test(dependsOnMethods = {"testCreateUserTable"})
    public void testLogJog() throws IOException, SQLException {
        jdbc.insertIntoJogLogTable(user, jogLog);
        Throwable thrown = catchThrowable(() -> jdbc.insertIntoJogLogTable(user, jogLog));
        assertThat(thrown).isNull();
    }

    @Test(dependsOnMethods = {"testAddUser"})
    public void testGetUser() {
        try {
            User getUser = jdbc.selectFromUsers(user);
            assertThat(getUser).isNotNull();
            assertThat(getUser).isEqualToComparingFieldByField(user);
        } catch (IOException | SQLException e) {
            fail(e.toString());
        }
    }

    @Test(dependsOnMethods = {"testLogJog"})
    public void testFilter() {
        Throwable thrown = catchThrowable(() -> {
            String whereClause = "(date_time_start == '2017-08-22') AND ((distance_km >= 20) OR (distance_km <= 10))";
            ResultSet resultSet = jdbc.selectFromJogLog(user, whereClause);
            assertThat(resultSet).isNotNull();
            // TODO add more assert
        });
        assertThat(thrown).isNull();
    }
}
