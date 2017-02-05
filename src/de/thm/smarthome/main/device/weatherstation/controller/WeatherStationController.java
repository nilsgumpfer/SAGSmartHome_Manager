package de.thm.smarthome.main.device.weatherstation.controller;

import de.thm.smarthome.main.device.weatherstation.logic.IWeatherStationLogic;
import de.thm.smarthome.global.observer.AObservable;

/**
 * Created by Nils on 27.01.2017.
 */
public class WeatherStationController extends AObservable implements IWeatherStationController {
    private IWeatherStationLogic logic;

    @Override
    public double getWindVelocity() {
        return 0;
    }

    @Override
    public double getRainfallAmount() {
        return 0;
    }

    @Override
    public double getAirHumidity() {
        return 0;
    }

    @Override
    public double getAirPressure() {
        return 0;
    }

    @Override
    public double getTemperature() {
        return 0;
    }
}
