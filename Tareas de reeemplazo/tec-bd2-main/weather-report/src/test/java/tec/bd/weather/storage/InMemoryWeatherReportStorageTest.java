/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.weather.storage;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import tec.bd.weather.Report;
import tec.bd.weather.service.WeatherService;
import static org.mockito.BDDMockito.*;


public class InMemoryWeatherReportStorageTest {

    /*
    Este test case se tiene que implementar
     */
    Report report;
    InMemoryWeatherReportStorage reportStorage = mock(InMemoryWeatherReportStorage.class);

    @Disabled
    @Test
    public void findReport() {
        reportStorage.find(1_000_000);
        assertThat(true).isTrue();
    }

    @Disabled
    @Test
    public void findAllReports() {
        reportStorage.find(1_000_000);
        assertThat(true).isTrue();
    }

    @Disabled
    @Test
    public void saveReport() {
        reportStorage.save(report);
        assertThat(true).isTrue();

    }

    @Disabled
    @Test
    public void updateReport() {
        reportStorage.update(report);
        assertThat(true).isTrue();
    }

    @Disabled
    @Test
    public void deleteReport() {
        String reportKey = null;
        reportStorage.remove(reportKey);
        assertThat(true).isTrue();
        
    }
}