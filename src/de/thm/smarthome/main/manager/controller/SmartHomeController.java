package de.thm.smarthome.main.manager.controller;

import de.thm.smarthome.main.device.heating.device.SmartHeating;
import de.thm.smarthome.main.device.shutter.device.SmartShutter;
import de.thm.smarthome.main.device.thermometer.device.SmartThermometer;
import de.thm.smarthome.main.device.weatherstation.device.SmartWeatherStation;
import de.thm.smarthome.main.manager.model.SmartHomeModel;

import java.util.List;

/**
 * Created by Nils on 28.01.2017.
 */
public class SmartHomeController implements ISmartHomeController{
    private static SmartHomeController ourInstance = new SmartHomeController();
    private SmartHomeModel model;

    private SmartHomeController(){}

    public static SmartHomeController getInstance() {
        return ourInstance;
    }

    public SmartHeating getSmartHeating(){
        return model.getSmartHeating();
    }

    public List<SmartShutter> getSmartShutters() {
        return model.getSmartShutters();
    }

    public SmartThermometer getSmartThermometer(){ return model.getSmartThermometer(); }

    public int setSmartHeating(SmartHeating smartHeating){return 0;}

    public SmartWeatherStation getSmartWeatherStation(){return null;}

    public int setSmartWeatherStation(SmartWeatherStation smartWeatherStation){return 0;}

    public int setSmartThermometer(SmartThermometer smartThermometer){return 0;}

    public SmartShutter getSmartShutter(String id){return null;}

    public int addSmartShutter(SmartShutter smartShutter){return 0;}
}
