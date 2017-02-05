package de.thm.smarthome.main.device.shutter.controller;

import de.thm.smarthome.main.device.shutter.logic.IShutterLogic;
import de.thm.smarthome.global.observer.AObservable;

/**
 * Created by Nils on 27.01.2017.
 */
public class ShutterController extends AObservable implements IShutterController {
    private IShutterLogic logic;
}
