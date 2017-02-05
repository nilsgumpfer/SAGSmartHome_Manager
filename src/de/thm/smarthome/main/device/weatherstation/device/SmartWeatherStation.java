package de.thm.smarthome.main.device.weatherstation.device;

import de.thm.smarthome.global.interfaces.ISmartDevice;
import de.thm.smarthome.main.device.weatherstation.adapter.IWeatherStation;
import de.thm.smarthome.main.device.weatherstation.controller.IWeatherStationController;
import de.thm.smarthome.main.device.weatherstation.controller.WeatherStationController;
import de.thm.smarthome.main.device.weatherstation.model.IWeatherStationModel;
import de.thm.smarthome.main.device.weatherstation.model.WeatherStationModel;
import de.thm.smarthome.main.device.weatherstation.view.IWeatherStationViewController;
import de.thm.smarthome.main.device.weatherstation.view.WeatherStationViewController;

/**
 * Created by Nils on 27.01.2017.
 */
public class SmartWeatherStation implements ISmartDevice{

    private IWeatherStation device;
    private IWeatherStationController controller;
    private IWeatherStationModel model;
    private IWeatherStationViewController view;

    @Override
    public String getName() {
        return null;
    }
}
