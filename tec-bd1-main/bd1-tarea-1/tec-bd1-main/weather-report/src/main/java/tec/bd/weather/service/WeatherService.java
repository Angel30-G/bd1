package tec.bd.weather.service;

import tec.bd.weather.Report;
 
public interface WeatherService{
    public Report byZipCode(int zipCode);
    public Report byCity(String city);
   // public Report ByTemperature(int temperature);
}
