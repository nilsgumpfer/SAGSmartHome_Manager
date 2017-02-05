package de.thm.smarthome.main.device.heating.device;

import de.thm.smarthome.global.interfaces.ISmartDevice;
import de.thm.smarthome.main.device.heating.adapter.IHeating;
import de.thm.smarthome.main.device.heating.controller.HeatingController;
import de.thm.smarthome.global.interfaces.ITemperatureRelevantDevice;
import de.thm.smarthome.main.device.heating.controller.IHeatingController;
import de.thm.smarthome.main.device.heating.model.HeatingModel;
import de.thm.smarthome.main.device.heating.model.IHeatingModel;
import de.thm.smarthome.main.device.heating.view.HeatingViewController;
import de.thm.smarthome.main.device.heating.view.IHeatingViewController;

/**
 * Created by Nils on 27.01.2017.
 */
public class SmartHeating implements ITemperatureRelevantDevice, ISmartDevice {

    private IHeating device;
    private IHeatingController controller;
    private IHeatingModel model;
    private IHeatingViewController view;

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
