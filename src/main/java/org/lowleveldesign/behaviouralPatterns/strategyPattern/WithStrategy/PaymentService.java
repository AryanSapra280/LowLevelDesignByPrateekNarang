package org.lowleveldesign.behaviouralPatterns.strategyPattern.WithStrategy;

public class PaymentService {
    private PaymentStrategy paymentStrategy;

    public PaymentService(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    /**
     * Process the payment with the given amount using the selected payment strategy.
     *
     * @param amount the amount to be paid
     */
    public void processPayment(double amount) {
        if (paymentStrategy == null) {
            throw new IllegalArgumentException("Payment strategy cannot be null");
        }
        paymentStrategy.pay(amount);
    }
}
