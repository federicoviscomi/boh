package com.feviscom.server.domain;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * CREATE TABLE IF NOT EXISTS %s (
 * dateTimeStart DATETIME NOT NULL,
 * dateTimeEnd DATETIME,
 * distanceKm DECIMAL(7, 1),
 * latitudeStart DECIMAL(10,5),
 * longitudeStart DECIMAL(10,5),
 * latitudeEnd DECIMAL(10,5),
 * longitudeEnd DECIMAL(10,5)
 * temperature
 * weather_report
 * )
 */
public class JogLogData {

    public Date dateTimeStart;
    public Date dateTimeEnd;
    public double distanceKm;
    public double latitudeStart;
    public double longitudeStart;
    public double latitudeEnd;
    public double longitudeEnd;
    public double averageKevinTemperature;
    public String weatherReport;

    public void setPreparedStatementParameter(PreparedStatement preparedStatement) throws SQLException {
        preparedStatement.setDate(1, dateTimeStart);
        preparedStatement.setDate(2, dateTimeEnd);
        preparedStatement.setDouble(3, distanceKm);
        preparedStatement.setDouble(4, latitudeStart);
        preparedStatement.setDouble(5, longitudeStart);
        preparedStatement.setDouble(6, latitudeEnd);
        preparedStatement.setDouble(7, longitudeEnd);
        preparedStatement.setDouble(8, averageKevinTemperature);
        weatherReport = weatherReport.substring(0, Math.min(weatherReport.length(), 25));
        preparedStatement.setString(9, weatherReport);
    }
}
