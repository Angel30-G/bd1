/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.weather.service;

import java.util.List;
import org.junit.jupiter.api.Test;
import tec.bd.weather.storage.WeatherReportStorage;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.BDDMockito.*;
import tec.bd.weather.Report;

public class WeatherServiceImplTest {

    @Test
    public void whenReportByZipCodeAndRemoteCall_ThenGetAndStoreLocally() {

        var remoteWeatherProvider = mock(WeatherService.class);
        var weatherReportStorage = mock(WeatherReportStorage.class);

        given(remoteWeatherProvider.getByZipCode(anyString())).willReturn(mock(Report.class));

        var service = new WeatherServiceImpl(remoteWeatherProvider, weatherReportStorage);

        var actual = service.getByZipCode("90210");

        verify(weatherReportStorage, times(1)).find(anyString());
        verify(remoteWeatherProvider, times(1)).getByZipCode("90210");
        verify(weatherReportStorage, times(1)).save(any(Report.class));

        assertThat(actual).isNotNull();
    }

    @Test
    public void whenReportByZipCodeAndDataIsStoredLocally_ThenReturnLocalData() {

        var remoteWeatherProvider = mock(WeatherService.class);
        var weatherReportStorage = mock(WeatherReportStorage.class);

        given(weatherReportStorage.find(anyString())).willReturn((List<Report>) mock(Report.class));

        var service = new WeatherServiceImpl(remoteWeatherProvider, weatherReportStorage);

        Report actual = service.getByZipCode("90210");

        verify(weatherReportStorage, times(1)).find(anyString());
        verify(remoteWeatherProvider, never()).getByZipCode("90210");
        verify(weatherReportStorage, never()).save(any(Report.class));

        assertThat(actual).isNotNull();
    }
}

