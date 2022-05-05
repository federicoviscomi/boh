package com.feviscom.test;

import com.feviscom.server.openweathermap.OWMClient;
import com.feviscom.server.openweathermap.WeatherReport;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OWMClientTest {

    private OWMClient client;

    @BeforeClass
    public void initTestSuite() {
        client = new OWMClient();
    }

    @AfterClass
    public void shutdown() {
        client.close();
    }


    @Test
    public void testGetWeatherByCityId() {
        WeatherReport weatherLondon = client.getWeatherByCityId("London,uk");
        assertThat(weatherLondon).isNotNull();
        assertThat(weatherLondon.name).isEqualTo("London");
    }


    @Test
    public void testGetWeatherByCoordinates() {
        WeatherReport weatherLondon = client.getWeatherByCoordinates(51.51, -0.13);
        assertThat(weatherLondon).isNotNull();
        assertThat(weatherLondon.name).isEqualTo("London");
    }


}
