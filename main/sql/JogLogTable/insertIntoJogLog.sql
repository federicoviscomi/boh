INSERT OR IGNORE INTO %s (
date_time_start,
date_time_end,
distance_km,
latitude_start,
longitude_start,
latitude_end,
longitude_end,
temperature,
weather_report
) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);
