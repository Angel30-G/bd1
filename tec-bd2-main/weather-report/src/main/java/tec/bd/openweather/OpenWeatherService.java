package tec.bd.openweather;

import tec.bd.openweather.OpenWeatherResource;
import tec.bd.openweather.OpenWeatherReport;
import retrofit2.Call;

import java.util.Map;
import tec.bd.weather.Report;
import tec.bd.weather.service.WeatherService;

public class OpenWeatherService implements WeatherService {

    private final static String API_KEY = "c426ea8e6d35512b694a08a2f4f85507";

    private final OpenWeatherResource openWeatherResource;

    public OpenWeatherService(OpenWeatherResource openWeatherResource) {
        this.openWeatherResource = openWeatherResource;
    }

    public float getTemperature(int zipCode) {
        try {
            var options = queryStringZipOptions(String.valueOf(zipCode));
            Call<OpenWeatherReport> openWeatherReportCall = this.openWeatherResource.get(options);
            OpenWeatherReport openWeatherReport = openWeatherReportCall.execute().body();
            return openWeatherReport.getMain().getTemp();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException("Error when calling open weather remote API");
        }
    }

    private Map<String, String> queryStringZipOptions(String zipCode) {
        return Map.of("zip", zipCode, "appId", API_KEY);
    }

    /**
     *
     * @param zipCode
     * @return
     */
    @Override
    public Report getByZipCode(String zipCode) {
        try {
            var options = queryStringZipOptions(String.valueOf(zipCode));
            Call<OpenWeatherReport> openWeatherReportCall = this.openWeatherResource.get(options);
            OpenWeatherReport openWeatherReport = openWeatherReportCall.execute().body();
            var system = openWeatherReport.getMain();
            Report reporte = new Report();
            reporte.setTemperature(system.getTemp());
            reporte.setPressure(system.getPressure());
            return reporte;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException("Error when calling open weather remote API");
        }
    }
    
    private Map<String, String> queryStringCityOptions(String city) {
        return Map.of("City", city, "appId", API_KEY);
    }
    
   /* public Report getByZipCode(String zipCode) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/

    @Override
    public Report getByCity(String city) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}





/*private Map<String, String> queryStringCityOptions(String cityName) {
        return Map.of("q", cityName, "appId", API_KEY);
    }

    @Override
    public Report getByCity(String city) {
        try {
            var options = queryStringCityOptions(city);
            Call<OpenWeatherReport> openWeatherReportCall = this.openWeatherResource.get(options);
            OpenWeatherReport openWeatherReport = openWeatherReportCall.execute().body();
            return openWeatherReport.getMain().getReport();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException("Error when calling open weather remote API");
        } */
   

/*IMNProvider implements WeatherService */