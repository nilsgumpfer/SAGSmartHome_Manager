package de.thm.smarthome.main.device.thermometer.logic;

import de.thm.smarthome.main.device.thermometer.model.IThermometerModel;

/**
 * Created by Nils on 27.01.2017.
 */
public class ThermometerLogicFahrenheit implements IThermometerLogic{
    private IThermometerModel model;

    public ThermometerLogicFahrenheit(IThermometerModel model) {
        this.model = model;
    }

    @Override
    public double getTemperature() {
        return 0;
    }
}
