package org.lowleveldesign.behaviouralPatterns.strategyPattern.WithStrategy;

public class PayPal implements PaymentStrategy {
    private String email;
    private String password;

    public PayPal(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(double amount) {
        // Logic to process payment using PayPal
        System.out.println("Paid " + amount + " using PayPal: " + email);
    }
}
