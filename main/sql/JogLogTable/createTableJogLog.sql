CREATE TABLE IF NOT EXISTS %s (
date_time_start DATETIME NOT NULL,
date_time_end DATETIME NOT NULL,
distance_km DECIMAL (7, 1) NOT NULL,
latitude_start DECIMAL (10, 5) NOT NULL,
longitude_start DECIMAL (10, 5) NOT NULL,
latitude_end DECIMAL (10, 5) NOT NULL,
longitude_end DECIMAL (10, 5) NOT NULL,
temperature DECIMAL (5, 2) NOT NULL,
weather_report VARCHAR (25) NOT NULL
);

CREATE INDEX IF NOT EXISTS index_%s ON %s (date_time_start, date_time_end);