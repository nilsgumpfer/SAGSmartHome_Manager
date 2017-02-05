package de.thm.smarthome.main.manager.smarthomemanager.model;

import de.thm.smarthome.main.device.heating.device.SmartHeating;
import de.thm.smarthome.main.device.shutter.device.SmartShutter;
import de.thm.smarthome.main.device.thermometer.device.SmartThermometer;
import de.thm.smarthome.main.device.weatherstation.device.SmartWeatherStation;

import java.util.List;

/**
 * Created by Nils on 01.02.2017.
 */
public interface ISmartHomeManagerModel {
    public SmartHeating getSmartHeating();
    public void setSmartHeating(SmartHeating smartHeating);
    public SmartWeatherStation getSmartWeatherStation();
    public void setSmartWeatherStation(SmartWeatherStation smartWeatherStation);
    public SmartThermometer getSmartThermometer();
    public void setSmartThermometer(SmartThermometer smartThermometer);
    public List<SmartShutter> getSmartShutters();
    public void addSmartShutter(SmartShutter smartShutter);
}
