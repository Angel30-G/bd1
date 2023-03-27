package tec.bd.cli;

import picocli.CommandLine;
import tec.bd.ApplicationContext;

@CommandLine.Command(name = "city", description = "Get weather forecast for city")
public class IMNZipCodeCommand implements Runnable {

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  /*  private static ApplicationContext APP_CONTEXT = ApplicationContext.init();

    @CommandLine.Parameters(paramLabel = "<city name>", description = "city name to be resolved")
    private String cityName;

    @Override
    public void run() {

        var weatherService = APP_CONTEXT.getWeatherService();
        var report = weatherService.getByCity(cityName);
        System.out.println(report.toString());
    }*/
}

