package de.thm.smarthome.main.manager.model;

import de.thm.smarthome.global.observer.AObservable;
import de.thm.smarthome.global.observer.IObserver;
import de.thm.smarthome.main.device.heating.device.SmartHeating;
import de.thm.smarthome.main.device.shutter.device.SmartShutter;
import de.thm.smarthome.main.device.thermometer.device.SmartThermometer;
import de.thm.smarthome.main.device.weatherstation.device.SmartWeatherStation;

import java.util.List;

/**
 * Created by Nils on 27.01.2017.
 */
public class SmartHomeModel extends AObservable implements ISmartHomeModel, IObserver{
    private SmartHeating smartHeating;
    private SmartWeatherStation smartWeatherStation;
    private SmartThermometer smartThermometer;
    private List<SmartShutter> smartShutters;

    @Override
    public SmartHeating getSmartHeating() {
        return smartHeating;
    }

    @Override
    public void setSmartHeating(SmartHeating smartHeating) {
        this.smartHeating = smartHeating;
    }

    @Override
    public SmartWeatherStation getSmartWeatherStation() {
        return smartWeatherStation;
    }

    @Override
    public void setSmartWeatherStation(SmartWeatherStation smartWeatherStation) {
        this.smartWeatherStation = smartWeatherStation;
    }

    @Override
    public SmartThermometer getSmartThermometer() {
        return smartThermometer;
    }

    @Override
    public void setSmartThermometer(SmartThermometer smartThermometer) {
        this.smartThermometer = smartThermometer;
    }

    @Override
    public List<SmartShutter> getSmartShutters() {
        return smartShutters;
    }

    @Override
    public SmartShutter getSmartShutter(String id) {
        return smartShutters.get(0);
    }

    @Override
    public void addSmartShutter(SmartShutter smartShutter) {
        smartShutters.add(smartShutter);
    }

    @Override
    public void update(AObservable o, Object change) {

    }
}
