package de.thm.smarthome.main.device.shutter.logic;

import de.thm.smarthome.main.device.shutter.model.IShutterModel;

/**
 * Created by Nils on 27.01.2017.
 */
public class ShutterLogicMaintenanceMode implements IShutterLogic {
    private IShutterModel model;

    public ShutterLogicMaintenanceMode(IShutterModel model){}

    @Override
    public int moveUp() {
        return 0;
    }

    @Override
    public int moveDown() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }
}
