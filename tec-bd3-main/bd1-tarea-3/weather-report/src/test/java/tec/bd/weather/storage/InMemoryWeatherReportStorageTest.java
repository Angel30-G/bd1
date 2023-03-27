package tec.bd.weather.storage;
import org.junit.jupiter.api.Test;
import tec.bd.weather.model.Report;
import tec.bd.weather.service.WeatherService;
import tec.bd.weather.service.WeatherServiceImpl;
import static org.mockito.BDDMockito.*;

public class InMemoryWeatherReportStorageTest {

    private final WeatherService remoteWeatherProvider = mock(WeatherService.class);
    private final WeatherReportStorage weatherReportStorage = mock(WeatherReportStorage.class);
    private final WeatherServiceImpl service = new WeatherServiceImpl(remoteWeatherProvider, weatherReportStorage);

    @Test
    public void TestFindReport() {
        given(weatherReportStorage.find(anyString())).willReturn(mock(Report.class));
        var actual = service.getByZipCode("90210");
        verify(weatherReportStorage, times(1)).find(anyString());
    }

    @Test
    public void TestFindAllReports() {
        weatherReportStorage.find();
        verify(weatherReportStorage, times(1)).find();
    }

    @Test
    public void TestSaveReport() {
        given(remoteWeatherProvider.getByZipCode(anyString())).willReturn(mock(Report.class));
        var actual = service.getByZipCode("90210");
        verify(weatherReportStorage, times(1)).save(any(Report.class));
    }

    @Test
    public void TestUpdateReport() {
        var report = remoteWeatherProvider.getByZipCode("90210");
        weatherReportStorage.update("90210", report);
        verify(weatherReportStorage, times(1)).update("90210", report);
    }

    @Test
    public void TestDeleteReport() {
        var report = remoteWeatherProvider.getByZipCode("90210");
        weatherReportStorage.save(report);
        weatherReportStorage.remove("90210");
        verify(weatherReportStorage, times(1)).remove("90210");
    }
}
