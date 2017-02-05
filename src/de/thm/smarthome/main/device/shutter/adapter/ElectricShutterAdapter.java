package de.thm.smarthome.main.device.shutter.adapter;

import de.electricshutter.driver.shutter.ElectricShutterDriver;

/**
 * Created by Nils on 27.01.2017.
 */
public class ElectricShutterAdapter implements IShutter{

    ElectricShutterDriver driver;

    public ElectricShutterAdapter(String serialNumber){

        driver = new ElectricShutterDriver(serialNumber);
    }

    @Override
    public void moveUp() {

        driver.moveUp();
    }

    @Override
    public void moveDown() {

        driver.moveDown();
    }

    @Override
    public boolean isUp() {
        return driver.isUp();
    }

    @Override
    public boolean isDown() {
        return driver.isDown();
    }
}
