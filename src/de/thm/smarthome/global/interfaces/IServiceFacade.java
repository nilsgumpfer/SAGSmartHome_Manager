package de.thm.smarthome.global.interfaces;

/**
 * Created by Nils on 04.02.2017.
 */
public interface IServiceFacade {
    int setTemperature(double temperature);
    int moveShuttersUp();
    int moveShuttersDown();
    int login(String username, String password);
    int logout();
    String[] showLogs(int limit);
}
