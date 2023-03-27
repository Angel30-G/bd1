package tec.bd.weather.service;

import tec.bd.weather.model.Report;
import tec.bd.weather.storage.WeatherReportStorage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class WeatherServiceImpl implements WeatherService {

    private final WeatherService weatherService;

    private final WeatherReportStorage weatherReportStorage;

    public WeatherServiceImpl(WeatherService weatherService,WeatherReportStorage weatherReportStorage){

        this.weatherService = weatherService;
        this.weatherReportStorage = weatherReportStorage;
    }

    @Override
    public Report getByZipCode(String zipCode) {

        // 1. Solicitar el dato a el almacenamiento local. Se envia el zipCode y el almacenamiento deberá de resolver si hay datos
        var now = new SimpleDateFormat("dd-MM-YYYY").format(new Date());
        var report = this.weatherReportStorage.find( now + "-" + zipCode);

        if (report != null) {
            return report;
        }

        // 2. Solicitar el reporte del clima de forma remota
        var weatheProviderReport = this.weatherService.getByZipCode(zipCode);

        // 3. Guardar el reporte obtenido de forma remota localmente
        weatherReportStorage.save(weatheProviderReport);

        return weatheProviderReport;
    }

    @Override
    public Report getByCity(String city) {
        var now = new SimpleDateFormat("dd-MM-YYYY").format(new Date());
        var report = this.weatherReportStorage.find( now + "-" + city);
        if(report != null){
            return report;
        }
        var weatherProviderReport = this.weatherService.getByCity(city);

        weatherReportStorage.save(weatherProviderReport);
        return weatherProviderReport;
    }

}
