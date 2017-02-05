package de.thm.smarthome.main.manager.model;

import de.thm.smarthome.main.device.heating.device.SmartHeating;
import de.thm.smarthome.main.device.shutter.device.SmartShutter;
import de.thm.smarthome.main.device.thermometer.device.SmartThermometer;
import de.thm.smarthome.main.device.weatherstation.device.SmartWeatherStation;

import java.util.List;

/**
 * Created by Nils on 01.02.2017.
 */
public interface ISmartHomeModel {
    SmartHeating getSmartHeating();
    void setSmartHeating(SmartHeating smartHeating);
    SmartWeatherStation getSmartWeatherStation();
    void setSmartWeatherStation(SmartWeatherStation smartWeatherStation);
    SmartThermometer getSmartThermometer();
    void setSmartThermometer(SmartThermometer smartThermometer);
    List<SmartShutter> getSmartShutters();
    SmartShutter getSmartShutter(String id);
    void addSmartShutter(SmartShutter smartShutter);
}
