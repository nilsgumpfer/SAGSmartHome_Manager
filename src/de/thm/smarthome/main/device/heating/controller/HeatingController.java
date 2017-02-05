package de.thm.smarthome.main.device.heating.controller;

import de.thm.smarthome.main.device.heating.logic.IHeatingLogic;
import de.thm.smarthome.global.observer.AObservable;

/**
 * Created by Nils on 27.01.2017.
 */
public class HeatingController extends AObservable implements IHeatingController {
    private IHeatingLogic logic;
}
