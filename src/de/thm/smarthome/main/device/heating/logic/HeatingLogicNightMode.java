package de.thm.smarthome.main.device.heating.logic;

import de.thm.smarthome.main.device.heating.model.IHeatingModel;

/**
 * Created by Nils on 27.01.2017.
 */
public class HeatingLogicNightMode implements IHeatingLogic {
    private IHeatingModel model;

    public HeatingLogicNightMode(IHeatingModel model){}

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
