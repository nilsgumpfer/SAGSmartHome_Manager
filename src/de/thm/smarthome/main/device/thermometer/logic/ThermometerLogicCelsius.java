package de.thm.smarthome.main.device.thermometer.logic;

import de.thm.smarthome.main.device.thermometer.model.IThermometerModel;

/**
 * Created by Nils on 27.01.2017.
 */
public class ThermometerLogicCelsius implements IThermometerLogic {
    private IThermometerModel model;

    public ThermometerLogicCelsius(IThermometerModel model) {
        this.model = model;
    }

    @Override
    public double getTemperature() {
        return 0;
    }
}
