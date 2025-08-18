package org.lowleveldesign.behaviouralPatterns.strategyPattern.WithStrategy;

public interface PaymentStrategy {
    /**
     * Interface for payment strategies.
     * This interface defines the method that all payment strategies must implement.
     * It allows for different payment methods to be used interchangeably.
     */

    /**
     * Process the payment with the given amount.
     *
     * @param amount the amount to be paid
     */
    void pay(double amount);
}
