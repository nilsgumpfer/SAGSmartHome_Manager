package de.thm.smarthome.main.device.heating.device;

import de.thm.smarthome.global.interfaces.ISmartDevice;
import de.thm.smarthome.global.interfaces.ITemperatureRelevantDevice;
import de.thm.smarthome.global.observer.AObservable;
import de.thm.smarthome.global.observer.IObserver;
import de.thm.smarthome.main.device.heating.controller.IHeatingController;

/**
 * Created by Nils on 27.01.2017.
 */
public class SmartHeating extends AObservable implements ITemperatureRelevantDevice, ISmartDevice, IObserver {
    private IHeatingController controller;

    @Override
    public int setTemperature(double temperature) {
        return 0;
    }

    @Override
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
