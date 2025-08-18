package org.lowleveldesign.behaviouralPatterns.observerPattern.withObserverPattern;

public class AppleWatch implements DevicesI {
    // This class represents an Apple Watch that observes temperature changes.
    private Integer temperature;

    @Override
    public void update(Integer temperature) {
        // Update the Apple Watch with the new temperature.
        this.temperature = temperature;
        System.out.println("Apple Watch received temperature update: " + temperature + "°C");
    }
}
