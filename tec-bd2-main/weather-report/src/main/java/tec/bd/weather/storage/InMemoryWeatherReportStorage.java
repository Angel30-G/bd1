package tec.bd.weather.storage;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import static okhttp3.Cache.key;
import java.util.regex.*;
import tec.bd.weather.Report;

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
        db.put("un-key", report);
    }

    @Override
    public void remove(String reportKey) {
        db.remove(reportKey);
    }

    @Override
    public Report update(Report newReport) {
        var oldReport = this.db.get(generateKeyFromReport(newReport));
        if(oldReport != null){
            String key = null;
            this.db.put(key, newReport);
            return newReport;
        }
        return oldReport;
    }

    @Override
    public Report find(int reportKey) {
        Report key = this.db.get(reportKey);
        //String key = null;
        //this.db = new LinkedHashMap<>(reportKey);
        //List<Report> find(String zipCode);
        //return db.find(key, reportKey);
        return key;
        
    }
    
    @Override
    public List<Report> find(String zipCode) {
        return new ArrayList<>(savedReports.values());
    }


    private String generateKeyFromReport(Report report) {
        var dateFormat = new SimpleDateFormat("dd-MM-YYYY");
        return (dateFormat.format(report.getDate()) + "-" + report.getReportType() + "-" + report.getLocation());
    }

}
