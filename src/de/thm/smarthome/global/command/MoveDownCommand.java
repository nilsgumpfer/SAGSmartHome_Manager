package de.thm.smarthome.global.command;

import de.thm.smarthome.main.device.shutter.device.SmartShutter;

import java.util.List;

/**
 * Created by Nils on 28.01.2017.
 */
public class MoveDownCommand implements ICommand {
    List<SmartShutter> devices;

    private MoveDownCommand(){}

    public MoveDownCommand(List<SmartShutter> devices) {
        this.devices = devices;
    }

    @Override
    public int execute() {
        return 0;
    }

    @Override
    public int undo() {
        return 0;
    }
}
