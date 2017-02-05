package de.thm.smarthome.global.connection.wsprovider;

import de.thm.smarthome.global.interfaces.IServiceFacade;
import de.thm.smarthome.main.manager.smarthomemanager.controller.commandmanager.CommandManager;

import javax.jws.*;
import javax.jws.soap.SOAPBinding;

@WebService(name="SmartHomeManagerWebServices")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class SmartHomeManagerWebServiceDescriptor implements IServiceFacade
{
    private IServiceFacade commandManager;

    public SmartHomeManagerWebServiceDescriptor(){
        this.commandManager = CommandManager.getInstance();
    }

    @WebMethod
    public String getInstanceName()
    {
        return "SAG SmartHome127.0.0.1";
    }

    @WebMethod
    public int setTemperature(double temperature)
    {
        return commandManager.setTemperature(temperature);
    }

    @Override
    public int moveShuttersUp() {
        return commandManager.moveShuttersUp();
    }

    @Override
    public int moveShuttersDown() {
        return commandManager.moveShuttersDown();
    }

    @Override
    public int login(String username, String password) {
        return commandManager.login(username,password);
    }

    @Override
    public int logout() {
        return commandManager.logout();
    }

    @Override
    public String[] showLogs(int limit) {
        return commandManager.showLogs(limit);
    }

    /*@WebMethod(operationName="body-mass-index")
    @WebResult(name = "your-bmi")
    public double bmi( @WebParam(name="height") double height,
                       @WebParam(name="weight") double weight )
    {
        return weight / ((height * height) / 10000);
    }*/
}