package de.thm.smarthome.main.device.thermometer.device;

import de.thm.smarthome.global.interfaces.ISmartDevice;
import de.thm.smarthome.global.observer.AObservable;
import de.thm.smarthome.global.observer.IObserver;
import de.thm.smarthome.main.device.thermometer.controller.IThermometerController;

/**
 * Created by Nils on 27.01.2017.
 */
public class SmartThermometer extends AObservable implements ISmartDevice, IObserver {
    private IThermometerController controller;

    @Override
    public String getName() {
        return null;
    }

    public double getTemperature(){return 0.0;}

    @Override
    public void update(AObservable o, Object change) {

    }
}
