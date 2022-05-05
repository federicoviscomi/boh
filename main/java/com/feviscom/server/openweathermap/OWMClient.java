package com.feviscom.server.openweathermap;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

public class OWMClient {
    private final Client client;


    public OWMClient() {
        client = ClientBuilder.newClient();

    }

    public WeatherReport getWeatherByCityId(String cityId) {
        return new WeatherReport(client
                .target("http://api.openweathermap.org/data/2.5/weather?q={cityId}&appid={appId}")
                .resolveTemplate("cityId", "London")
                .resolveTemplate("appId", "2d3ffe66bc89df353c5ed06b414378ea")
                .queryParam("verbose", true)
                .request(MediaType.APPLICATION_JSON_TYPE)
                .get()
                .readEntity(String.class));
    }

    public WeatherReport getWeatherByCoordinates(double latitude, double longitude) {
        return new WeatherReport(client
                .target("http://api.openweathermap.org/data/2.5/weather?lat={lat}&lon={lon}&appid={appId}")
                .resolveTemplate("lat", latitude)
                .resolveTemplate("lon", longitude)
                .resolveTemplate("appId", "2d3ffe66bc89df353c5ed06b414378ea")
                .queryParam("verbose", true)
                .request(MediaType.APPLICATION_JSON_TYPE)
                .get()
                .readEntity(String.class));
    }


    public WeatherReport getHistorycalWeather(double latitude, double longitude, long startDate, long endDate) {
        // FIXME this api is not free!
        // TODO find another one
        return new WeatherReport(client
                .target("http://history.openweathermap.org/data/2.5/history/city?lat={lat}&lon={lon}&type=hour&start={start}&end={end}&appid={appId}")
                .resolveTemplate("lat", latitude)
                .resolveTemplate("lon", longitude)
                .resolveTemplate("start", startDate)
                .resolveTemplate("end", endDate)
                .resolveTemplate("appId", "I don't have one!")
                .queryParam("verbose", true)
                .request(MediaType.APPLICATION_JSON_TYPE)
                .get()
                .readEntity(String.class));
    }

    public void close() {
        client.close();
    }
}
