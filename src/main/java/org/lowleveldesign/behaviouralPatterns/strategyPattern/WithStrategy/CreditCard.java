package org.lowleveldesign.behaviouralPatterns.strategyPattern.WithStrategy;

public class CreditCard implements PaymentStrategy {
    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;

    public CreditCard(String cardNumber, String cardHolderName, String expiryDate) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay(double amount) {
        // Logic to process payment using credit card
        System.out.println("Paid " + amount + " using Credit Card: " + cardNumber);
    }
}
