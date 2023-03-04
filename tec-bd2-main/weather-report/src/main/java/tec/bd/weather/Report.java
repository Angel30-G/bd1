package tec.bd.weather;

import java.util.Date;

public class Report {
    
    private Date date;
    private ReportType reportType;
    private float temperature;
    private float humidity;
    private float pressure;
    private float maxTemperature;
    private float minTemperature;

    public Report() {

    }
    
     public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    public ReportType getReportType() {
        return reportType;
    }

    public void setReportType(ReportType reportType) {
        this.reportType = reportType;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
    
     public float getHumidity() {
        return humidity;
    }
     
     public void setPressure(float pressure) {
        this.pressure = pressure;
    }
    
     public float getPressure() {
        return pressure;
    }
     
    
     public void setMaxTemperature(float maxTemperature) {
        this.maxTemperature = maxTemperature;
    }
    
     public float getMaxTemperature() {
        return maxTemperature;
    }
     
     public void setMinTemperature(float minTemperature) {
        this.minTemperature = minTemperature;
    }
    
     public float getMinTemperature() {
        return minTemperature;
    }

    void setTemperature(Report temperature) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
        @Override
    public String toString() {
        return "Report{" +
                "date=" + date +
                ", reportType=" + reportType +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                ", maxTemperature=" + maxTemperature +
                ", minTemperature=" + minTemperature +
                '}';
    }

    public String getLocation() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setData(String city) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setType(ReportType reportType) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
