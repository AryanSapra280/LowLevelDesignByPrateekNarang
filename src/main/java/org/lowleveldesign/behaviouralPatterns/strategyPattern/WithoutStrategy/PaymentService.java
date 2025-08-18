package org.lowleveldesign.behaviouralPatterns.strategyPattern.WithoutStrategy;

public class PaymentService {

    public void pay(String paymentType, double amount) {
        if (paymentType.equalsIgnoreCase("creditCard")) {
            processCreditCardPayment(amount);
        } else if (paymentType.equalsIgnoreCase("debitCard")) {
            processDebitCardPayment(amount);
        } else if (paymentType.equalsIgnoreCase("paypal")) {
            processPayPalPayment(amount);
        } else {
            System.out.println("Unsupported payment type: " + paymentType);
        }
        // If tomorrow we want to add a new payment type, we will have to modify this method.
        // This violates the Open/Closed Principle.
        // The class is not open for extension but closed for modification.
        // This is a classic example of the problem with not using the Strategy Pattern.
    }
    private void processCreditCardPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
        // Logic for credit card payment
    }
    private void processDebitCardPayment(double amount) {
        System.out.println("Processing debit card payment of $" + amount);
        // Logic for debit card payment
    }
    private void processPayPalPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
        // Logic for PayPal payment
    }
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.pay("creditCard", 100.0);
        paymentService.pay("debitCard", 50.0);
        paymentService.pay("paypal", 75.0);
        paymentService.pay("bitcoin", 20.0); // Unsupported payment type
    }
}
