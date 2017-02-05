package de.thm.smarthome.main.manager.smarthomemanager.controller.commandmanager;

import de.thm.smarthome.global.command.ICommand;
import de.thm.smarthome.global.command.MoveDownCommand;
import de.thm.smarthome.global.command.MoveUpCommand;
import de.thm.smarthome.global.command.SetTemperatureCommand;
import de.thm.smarthome.global.interfaces.IServiceFacade;
import de.thm.smarthome.global.logging.SmartHomeLogger;
import de.thm.smarthome.main.manager.smarthomemanager.SmartHomeManager;

import java.util.List;

/**
 * Created by Nils on 27.01.2017.
 */

public class CommandManager implements IServiceFacade, ICommandManager {
    private static CommandManager ourInstance = new CommandManager();
    private SmartHomeManager smartHomeManager = SmartHomeManager.getInstance();
    private List<ICommand> invokedCommands;

    private CommandManager() {
    }

    public static CommandManager getInstance() {
        return ourInstance;
    }

    @Override
    public int setTemperature(double temperature){
        int returnValue = 0;

        SetTemperatureCommand command = new SetTemperatureCommand(smartHomeManager.getSmartHeating(), temperature);
        returnValue = command.execute();

        if(returnValue > 0)
            invokedCommands.add(command);

        return returnValue;
    }

    @Override
    public int moveShuttersUp() {
        int returnValue = 0;

        MoveUpCommand command = new MoveUpCommand(smartHomeManager.getSmartShutters());
        returnValue = command.execute();

        if(returnValue > 0)
            invokedCommands.add(command);

        return returnValue;
    }

    @Override
    public int moveShuttersDown() {
        int returnValue = 0;

        MoveDownCommand command = new MoveDownCommand(smartHomeManager.getSmartShutters());
        returnValue = command.execute();

        if(returnValue > 0)
            invokedCommands.add(command);

        return returnValue;
    }

    @Override
    public int login(String username, String password) {
        return 0;
    }

    @Override
    public int logout() {
        return 0;
    }

    @Override
    public String[] showLogs(int limit) {
        return SmartHomeLogger.readLogs(limit);
    }

    @Override
    public void undoLastCommand(){
        ICommand command = invokedCommands.get(invokedCommands.size()-1);
        command.undo();
        invokedCommands.remove(command);
    }
}
