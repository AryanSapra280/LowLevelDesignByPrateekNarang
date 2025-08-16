package org.lowleveldesign.basics.OOPS;

import java.util.HashMap;

public class PaymentService {

    private HashMap<String, PaymentMethod> paymentMethods;

    public PaymentService() {
        this.paymentMethods = new HashMap<>();
    }

    public void addPaymentMethod(String id, PaymentMethod paymentMethod) {
        paymentMethods.put(id, paymentMethod);
    }

    public void makePayment(String id) {
        PaymentMethod paymentMethod = paymentMethods.get(id);
        if (paymentMethod != null) {
            paymentMethod.pay();
        } else {
            System.out.println("Payment method not found for ID: " + id);
        }
    }
}
