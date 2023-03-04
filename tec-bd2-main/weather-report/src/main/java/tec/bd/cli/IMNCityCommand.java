/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.cli;

/**
 *
 * @author pc
 */
import picocli.CommandLine;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import tec.bd.ApplicationContext;
import tec.bd.weather.WeatherReport;
import tec.bd.openweather.OpenWeatherResource;
import tec.bd.openweather.OpenWeatherService;
import tec.bd.weather.service.WeatherService;

@CommandLine.Command(name = "imn-city", description = "Get weather forecast by zip code")
public class IMNCityCommand implements Runnable {

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  /*  private static ApplicationContext APP_CONTEXT = ApplicationContext.init();

    @CommandLine.Parameters(paramLabel = "<city name>", description = "zip code to be resolved")
    private String city;

    @Override
    public void run() {
        var openWeatherService = APP_CONTEXT.openIMNProvider;
        var weatherReport = new WeatherReport(openWeatherService);
        var report = weatherReport.getByCity(city);
        System.out.println(report.getTemperature());
    }
*/
}
