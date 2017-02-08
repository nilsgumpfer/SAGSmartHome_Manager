package de.thm.smarthome.global.interfaces;

import de.thm.smarthome.main.device.heating.memento.HeatingMemento;

/**
 * Created by Nils on 28.01.2017.
 */
public interface ITemperatureRelevantDevice {
    int setTemperature(double temperature);
    double getTemperature();
    HeatingMemento getMemento();
    void setMemento(HeatingMemento memento);
}
