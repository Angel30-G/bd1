package tec.bd.weather.storage;

import tec.bd.weather.model.Report;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class InMemoryWeatherReportStorage implements WeatherReportStorage {

    private Map<String, Report> db;

    public InMemoryWeatherReportStorage() {
        this.db = new LinkedHashMap<>();
    }

    /*
     * Esto tiene que ser implementado
     *
     */

    @Override
    public void save(Report report) {
        db.put(generateKeyFromReport(report), report);
    }

    @Override
    public void remove(String reportKey) {
        if (db.containsKey(reportKey)) {
            db.remove(reportKey);
        } else {
            throw new RuntimeException("Nothing to Delete");
        }
    }


    @Override
    public Report update(String reportKey, Report newReport) {
        if (db.containsKey(reportKey)) {
            db.replace(reportKey, newReport);
        } else {
            db.put(reportKey, newReport);
        }
        return newReport;
    }


    @Override
    public Report find(String reportKey) {
        var report = db.get(reportKey);
        return report;
    }

    @Override
    public List<Report> find() {
        List<Report> reports = (List<Report>) db.values();
        return reports;
    }

    private String generateKeyFromReport(Report report) {
        var dateFormat = new SimpleDateFormat("dd-mm-YYYY");
        return (dateFormat.format(report.getDate()) + "-" + report.getReportType());
    }

// Metodo similar para fechas con formato
//    private String generateKeyFromReport(Report report) {
//        return (report.getDate().toGMTString() + "-" + report.getReportType());
//    }

}
