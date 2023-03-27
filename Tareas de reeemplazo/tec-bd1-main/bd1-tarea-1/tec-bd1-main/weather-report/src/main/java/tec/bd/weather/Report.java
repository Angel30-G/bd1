package tec.bd.weather;

public class Report {

    private float temperature;
    private float humidity;
    private float pressure;
    private float maxTemperature;
    private float minTemperature;

    public Report() {

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

}
