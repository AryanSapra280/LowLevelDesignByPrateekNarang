package org.lowleveldesign.behaviouralPatterns.observerPattern.withoutObserverPattern;

class Device {

    public void notify(Integer temperature) {
        // Logic to notify the device about the temperature change
        System.out.println("Device notified with temperature: " + temperature);
    }
}
public class WithoutObserverPattern {
    private Integer temperature;
    private Device device;

    public WithoutObserverPattern(Device device) {
        this.device = device;
    }
    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
        // Notify the device about the temperature change
        device.notify(temperature);
    }
    public Integer getTemperature() {
        return temperature;
    }
    public static void main(String[] args) {
        Device device = new Device();
        WithoutObserverPattern withoutObserverPattern = new WithoutObserverPattern(device);
        //tight coupling between the temperature setting and device notification
        //if we want to add more devices, we need to modify this class, which violates the Open/Closed Principle
        //and makes it less flexible and harder to maintain.
        withoutObserverPattern.setTemperature(25);
        withoutObserverPattern.setTemperature(30);
        System.out.println("Current Temperature: " + withoutObserverPattern.getTemperature());
    }
}
