package org.lowleveldesign.behaviouralPatterns.observerPattern.withObserverPattern;

public interface DevicesI {
    // This interface defines the methods that a device must implement being an observer.
    void update(Integer temperature);
}
