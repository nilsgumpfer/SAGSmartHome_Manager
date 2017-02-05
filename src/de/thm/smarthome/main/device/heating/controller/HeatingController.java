package de.thm.smarthome.main.device.heating.controller;

import de.thm.smarthome.main.device.heating.adapter.IHeating;
import de.thm.smarthome.main.device.heating.logic.IHeatingLogic;
import de.thm.smarthome.global.observer.AObservable;
import de.thm.smarthome.main.device.heating.model.IHeatingModel;

/**
 * Created by Nils on 27.01.2017.
 */
public class HeatingController extends AObservable implements IHeatingController {
    private IHeatingLogic logic;

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
}
