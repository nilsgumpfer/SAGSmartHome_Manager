package de.thm.smarthome.global.factory;

import de.thm.smarthome.main.device.heating.adapter.BuderusHeatingAdapter;
import de.thm.smarthome.main.device.heating.adapter.IHeating;
import de.thm.smarthome.global.enumeration.HeatingManufacturers;
import de.thm.smarthome.main.device.heating.adapter.VaillantHeatingAdapter;
import de.thm.smarthome.main.device.heating.adapter.ViessmannHeatingAdapter;

/**
 * Created by Nils on 03.02.2017.
 */
public class HeatingFactory {
    public IHeating createHeating(HeatingManufacturers variant, String serialnumber){
        switch (variant){
            case BUDERUS:
                return new BuderusHeatingAdapter(serialnumber);
            case VAILLANT:
                return new VaillantHeatingAdapter(serialnumber);
            case VIESSMANN:
                return new ViessmannHeatingAdapter(serialnumber);
            default:
                return null;
        }
    }
}
