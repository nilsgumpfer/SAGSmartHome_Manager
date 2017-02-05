package de.thm.smarthome.main.device.thermometer.device;

import de.thm.smarthome.global.interfaces.ISmartDevice;
import de.thm.smarthome.main.device.thermometer.adapter.IThermometer;
import de.thm.smarthome.main.device.thermometer.controller.IThermometerController;
import de.thm.smarthome.main.device.thermometer.controller.ThermometerController;
import de.thm.smarthome.main.device.thermometer.model.IThermometerModel;
import de.thm.smarthome.main.device.thermometer.model.ThermometerModel;
import de.thm.smarthome.main.device.thermometer.view.IThermometerViewController;
import de.thm.smarthome.main.device.thermometer.view.ThermometerViewController;

/**
 * Created by Nils on 27.01.2017.
 */
public class SmartThermometer implements ISmartDevice {

    private IThermometer device;
    private IThermometerController controller;
    private IThermometerModel model;
    private IThermometerViewController view;

    @Override
    public String getName() {
        return null;
    }
}
