package tec.bd.weather.service;

import tec.bd.weather.Report;
 
public interface WeatherService{
    public Report ByZipCode(int zipCode);
    public Report ByCity(String city);
   // public Report ByTemperature(int temperature);
}
