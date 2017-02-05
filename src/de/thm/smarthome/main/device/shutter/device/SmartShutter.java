package de.thm.smarthome.main.device.shutter.device;

import de.thm.smarthome.global.interfaces.ISmartDevice;
import de.thm.smarthome.main.device.shutter.adapter.IShutter;
import de.thm.smarthome.main.device.shutter.controller.IShutterController;
import de.thm.smarthome.main.device.shutter.model.IShutterModel;
import de.thm.smarthome.main.device.shutter.view.IShutterViewController;

/**
 * Created by Nils on 27.01.2017.
 */
public class SmartShutter implements ISmartDevice{

    private IShutter device;
    private IShutterController controller;
    private IShutterModel model;
    private IShutterViewController view;

    public int moveUp() {
        return 0;
    }

    public int moveDown() {
        return 0;
    }

    public boolean isUp() {
        return false;
    }

    public boolean isDown() {
        return false;
    }

    @Override
    public String getName() {
        return null;
    }
}
