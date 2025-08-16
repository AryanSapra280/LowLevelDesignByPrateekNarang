package org.lowleveldesign.basics.OOPS;

public class Client {

    public static void main(String[] args) {
        // Create instances of different payment methods
        PaymentMethod upiPayment = new Upi("user@upi");
        PaymentMethod walletPayment = new Wallet("wallet123");
        PaymentMethod creditCardPayment = new CreditCard("1234-5678-9876-5432","Aryan");

        // Add payment methods to the payment service
        PaymentService paymentService = new PaymentService();
        paymentService.addPaymentMethod("upi1", upiPayment);
        paymentService.addPaymentMethod("wallet1", walletPayment);
        paymentService.addPaymentMethod("creditCard1", creditCardPayment);

        // Make payments using different methods
        paymentService.makePayment("upi1");
        paymentService.makePayment("wallet1");
        paymentService.makePayment("creditCard1");
    }
}
