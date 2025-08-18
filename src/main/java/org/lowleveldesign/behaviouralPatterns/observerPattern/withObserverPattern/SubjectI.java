package org.lowleveldesign.behaviouralPatterns.observerPattern.withObserverPattern;

public interface SubjectI {
    //This interface defines the methods that a subject must implement in the observer management.

    void registerObserver(DevicesI observer);
    void unregisterObserver(DevicesI observer);
    void notifyObservers(Integer temperature);

}
