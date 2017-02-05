package de.thm.smarthome.main.device.thermometer.view;

import de.thm.smarthome.main.device.thermometer.controller.ThermometerController;
import de.thm.smarthome.global.observer.AObservable;
import de.thm.smarthome.global.observer.IObserver;

/**
 * Created by Nils on 27.01.2017.
 */
public class ThermometerViewController implements IObserver, IThermometerViewController {
    private ThermometerController controller;

    public ThermometerViewController(ThermometerController controller) {
        this.controller = controller;
        controller.attach(this);
    }

    /**
     * This method is called whenever the observed object is changed. An
     * application calls an <tt>Observable</tt> object's
     * <code>notifyObservers</code> method to have all the object's
     * observers notified of the change.
     *
     * @param o   the observable object.
     * @param arg an argument passed to the <code>notifyObservers</code>
     */
    @Override
    public void update(AObservable o, Object arg) {

    }
}
