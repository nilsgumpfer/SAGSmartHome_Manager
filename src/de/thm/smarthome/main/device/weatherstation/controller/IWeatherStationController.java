package de.thm.smarthome.main.device.weatherstation.controller;

/**
 * Created by Nils on 01.02.2017.
 */
public interface IWeatherStationController {
    double getWindVelocity();
    double getRainfallAmount();
    double getAirHumidity();
    double getAirPressure();
    double getTemperature();
}
