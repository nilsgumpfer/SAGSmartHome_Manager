package de.thm.smarthome.main.device.heating.adapter;

import de.thm.smarthome.main.device.heating.memento.HeatingMemento;
import de.viessmann.driver.heating.ViessmannHeatingDriver;

import java.util.List;

/**
 * Created by Nils on 27.01.2017.
 * Changed 28.01.2017
 */
public class ViessmannHeatingAdapter implements IHeating {

    ViessmannHeatingDriver driver;

    public ViessmannHeatingAdapter(String serialNumber){

        driver = new ViessmannHeatingDriver(serialNumber);
    }

    @Override
    public boolean setTemperature(double temperature) {

        return driver.adjustTemperature(temperature);
    }

    @Override
    public double getTemperature() {

        return driver.getCurrentTemperature();
    }

    @Override
    public void standby() {

        driver.standby();
    }

    @Override
    public void wakeup() {

        driver.wakeUp();
    }

    @Override
    public List<String> getLogs() {

        return driver.getLogs();
    }

    @Override
    public HeatingMemento getMemento() {
        return null;
    }

    @Override
    public void setMemento(HeatingMemento memento) {

    }
}
