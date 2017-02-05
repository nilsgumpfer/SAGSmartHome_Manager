package de.thm.smarthome.main.device.thermometer.controller;

import de.thm.smarthome.main.device.thermometer.logic.IThermometerLogic;
import de.thm.smarthome.global.observer.AObservable;

/**
 * Created by Nils on 27.01.2017.
 */
public class ThermometerController extends AObservable implements IThermometerController {
    private IThermometerLogic logic;

    @Override
    public double getTemperature() {
        return 0;
    }
}
