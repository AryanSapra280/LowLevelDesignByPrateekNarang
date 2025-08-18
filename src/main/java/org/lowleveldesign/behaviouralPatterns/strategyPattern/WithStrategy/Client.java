package org.lowleveldesign.behaviouralPatterns.strategyPattern.WithStrategy;

public class Client {
    public static void main(String[] args) {
        // Create a payment strategy for PayPal
        PaymentStrategy payPalStrategy = new PayPal("aryan@gmail.com", "password123");
        // Create a payment service with the PayPal strategy
        PaymentService paymentService = new PaymentService(payPalStrategy);
        // Process a payment of 100.0 using PayPal
        paymentService.processPayment(100.0);

        // Create a payment strategy for Debit Card
        PaymentStrategy debitCardStrategy = new DebitCard("1234-5678-9876-5432", "Aryan", "12/25");
        // Create a payment service with the Debit Card strategy
        paymentService = new PaymentService(debitCardStrategy);
        // Process a payment of 50.0 using Debit Card
        paymentService.processPayment(50.0);

        // You can switch strategies dynamically
        // Create a new payment strategy for PayPal
        PaymentStrategy newPayPalStrategy = new PayPal("kartik@gmail", "newpassword456");
        // Update the payment service with the new PayPal strategy
        paymentService = new PaymentService(newPayPalStrategy);
        // Process a payment of 75.0 using the new PayPal strategy
        paymentService.processPayment(75.0);

        // You can also add more payment strategies without modifying the PaymentService class
    }
}
