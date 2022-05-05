package com.feviscom.server.openweathermap;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


public class WeatherReport {
    public final String description;
    public final double temperatureAverageKelvin;
    public final String name;

    public WeatherReport(String jsonWeatherReport) {
        JsonParser jsonParser = new JsonParser();
        JsonObject jo = (JsonObject) jsonParser.parse(jsonWeatherReport);
        description = jo.get("weather").getAsJsonArray().get(0).getAsJsonObject().get("description").getAsString();
        temperatureAverageKelvin = jo.get("main").getAsJsonObject().get("temp").getAsDouble();
        name = jo.get("name").getAsString();
    }


    @Override
    public String toString() {
        return "WeatherReport{" +
                "description='" + description + '\'' +
                ", temperatureAverageKelvin=" + temperatureAverageKelvin +
                ", name='" + name + '\'' +
                '}';
    }
}
