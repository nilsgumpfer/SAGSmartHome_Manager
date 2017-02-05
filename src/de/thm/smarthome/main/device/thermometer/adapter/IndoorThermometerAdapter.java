package de.thm.smarthome.main.device.thermometer.adapter;

import de.indoorthermometer.driver.thermometer.IndoorThermometerDriver;

/**
 * Created by Nils on 27.01.2017.
 */
public class IndoorThermometerAdapter implements IThermometer{

    private IndoorThermometerDriver driver;

    public IndoorThermometerAdapter(String serialNumber){

        driver = new IndoorThermometerDriver(serialNumber);
    }

    @Override
    public double getTemperature() {
        return driver.getTemperature();
    }
}
