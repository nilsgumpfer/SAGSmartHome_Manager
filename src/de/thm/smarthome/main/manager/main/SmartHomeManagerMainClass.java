package de.thm.smarthome.main.manager.main;

import de.thm.smarthome.main.manager.smarthomemanager.SmartHomeManager;

/**
 * Created by Nils on 27.01.2017.
 */
public class SmartHomeManagerMainClass {
    static SmartHomeManager manager;

    public static void main(String args[]){
        manager = new SmartHomeManager();
    }
}
