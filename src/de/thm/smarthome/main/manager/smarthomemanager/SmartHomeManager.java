package de.thm.smarthome.main.manager.smarthomemanager;

import de.thm.smarthome.main.device.heating.device.SmartHeating;
import de.thm.smarthome.main.device.shutter.device.SmartShutter;
import de.thm.smarthome.main.device.thermometer.device.SmartThermometer;
import de.thm.smarthome.main.manager.smarthomemanager.controller.SmartHomeManagerController;
import de.thm.smarthome.main.manager.smarthomemanager.controller.commandmanager.CommandManager;
import de.thm.smarthome.main.manager.smarthomemanager.controller.commandmanager.ICommandManager;
import de.thm.smarthome.main.manager.smarthomemanager.controller.usermanager.IUserManager;
import de.thm.smarthome.main.manager.smarthomemanager.controller.usermanager.UserManager;
import de.thm.smarthome.main.manager.smarthomemanager.model.SmartHomeManagerModel;
import de.thm.smarthome.main.manager.smarthomemanager.view.SmartHomeManagerViewController;

import java.util.List;

/**
 * Created by Nils on 28.01.2017.
 */
public class SmartHomeManager {
    private static SmartHomeManager ourInstance = new SmartHomeManager();

    private SmartHomeManagerController controller;
    private SmartHomeManagerModel model;
    private SmartHomeManagerViewController viewController;

    private SmartHomeManager(){}

    public static SmartHomeManager getInstance() {
        return ourInstance;
    }

    public SmartHeating getSmartHeating(){
        return model.getSmartHeating();
    }

    public List<SmartShutter> getSmartShutters() {
        return model.getSmartShutters();
    }

    public SmartThermometer getSmartThermometer(){ return model.getSmartThermometer(); }
}
