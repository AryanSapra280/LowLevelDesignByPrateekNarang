package org.lowleveldesign.behaviouralPatterns.observerPattern.withObserverPattern;

public class Mobile implements DevicesI {
    // This class represents a mobile device that observes temperature changes.
    private Integer temperature;
    @Override
    public void update(Integer temperature) {
        // Update the mobile device with the new temperature.
        System.out.println("Mobile " + " received temperature update: " + temperature + "°C");
    }
}
