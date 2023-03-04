package tec.bd.weather.storage;


import java.util.List;
import tec.bd.weather.Report;

public interface WeatherReportStorage {

    void save(Report report);

    void remove(String reportKey);

    Report update(Report oldReport);

    Report find(int reportKey);

    List<Report> find(String zipCode);
}
