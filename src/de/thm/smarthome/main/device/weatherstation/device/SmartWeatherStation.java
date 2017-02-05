package de.thm.smarthome.main.device.weatherstation.device;

import de.thm.smarthome.global.interfaces.ISmartDevice;
import de.thm.smarthome.global.observer.AObservable;
import de.thm.smarthome.global.observer.IObserver;
import de.thm.smarthome.main.device.weatherstation.controller.IWeatherStationController;

/**
 * Created by Nils on 27.01.2017.
 */
public class SmartWeatherStation extends AObservable implements ISmartDevice, IObserver{
    private IWeatherStationController controller;

    public double getWindVelocity() {
        return 0;
    }

    public double getRainfallAmount() {
        return 0;
    }

    public double getAirHumidity() {
        return 0;
    }

    public double getAirPressure() {
        return 0;
    }

    public double getTemperature() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void update(AObservable o, Object change) {

    }
}
