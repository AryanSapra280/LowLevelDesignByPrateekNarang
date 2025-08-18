package org.lowleveldesign.behaviouralPatterns.observerPattern.withObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements SubjectI{
    // This class implements the SubjectI interface and manages a list of observers (devices).
    //This is a class which says I will take care of Weather related data and notify observers when there is a change.

    List<DevicesI> observers = new ArrayList<>();

    @Override
    public void registerObserver(DevicesI observer) {
        if(observer != null && !observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void unregisterObserver(DevicesI observer) {
        if(observer != null && observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers(Integer temperature) {
        // This method notifies all registered observers about the temperature change.
        for (DevicesI observer : observers) {
            observer.update(temperature);
        }
    }
}
