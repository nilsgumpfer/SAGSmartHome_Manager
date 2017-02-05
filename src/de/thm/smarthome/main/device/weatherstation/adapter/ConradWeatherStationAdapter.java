package de.thm.smarthome.main.device.weatherstation.adapter;

import de.conrad.driver.weatherstation.ConradWeatherStationDriver;

/**
 * Created by Nils on 27.01.2017.
 */
public class ConradWeatherStationAdapter implements IWeatherStation{

    ConradWeatherStationDriver driver;

    public ConradWeatherStationAdapter(String serialNumber){

        driver = new ConradWeatherStationDriver(serialNumber);
    }

    @Override
    public double getTemperature() {
        return driver.getTemperature();
    }

    @Override
    public double getWindVelocity() {
        return driver.getWindVelocity();
    }

    @Override
    public double getAirPressure() {
        return driver.getAirPressure();
    }

    @Override
    public double getRainfallAmount() {
        return driver.getRainfallAmount();
    }
}
