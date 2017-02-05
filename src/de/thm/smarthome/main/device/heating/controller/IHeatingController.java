package de.thm.smarthome.main.device.heating.controller;

/**
 * Created by Nils on 01.02.2017.
 */
public interface IHeatingController {
    int setTemperature(double temperature);
    double getTemperature();
    String getName();
}
