package org.lowleveldesign.behaviouralPatterns.observerPattern.withObserverPattern;

public class Client {
    public static void main(String[] args) {
        // Example usage of the WeatherStation class.
        WeatherStation weatherStation = new WeatherStation();

        DevicesI mobile = new Mobile();
        DevicesI appleWatch = new AppleWatch();

        weatherStation.registerObserver(mobile);
        weatherStation.registerObserver(appleWatch);

        // Simulate a temperature change.
        weatherStation.notifyObservers(25);

        // Unregister the mobile device and simulate another temperature change.
        weatherStation.unregisterObserver(mobile);
        weatherStation.notifyObservers(30);
    }
}
