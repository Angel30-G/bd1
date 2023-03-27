/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.bd.weather.service;


import tec.bd.weather.Report;
/**
 *
 * @author pc
 */
public class IMNProvider implements WeatherService{
    @Override
    public Report byZipCode(int zipCode){
        return new Report();
    }
    
    @Override
    public Report byCity(String city){
        return new Report();
    }
    
}
