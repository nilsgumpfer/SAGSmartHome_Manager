package de.thm.smarthome.main.device.shutter.controller;

/**
 * Created by Nils on 01.02.2017.
 */
public interface IShutterController {
    int moveUp();
    int moveDown();
    String getName();
}
