package tec.bd.weather.service;

import tec.bd.weather.Report;
 
public interface WeatherService{
    
    Report getByZipCode(String zipCode);

    Report getByCity(String city);
   // public Report ByTemperature(int temperature);
}
