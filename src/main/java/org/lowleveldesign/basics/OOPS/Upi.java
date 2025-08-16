package org.lowleveldesign.basics.OOPS;

public class Upi implements PaymentMethod{
    private String upiId;

    @Override
    public void pay() {
        System.out.println("Payment made using UPI: " + upiId);
    }
    public Upi(String upiId) {
        this.upiId = upiId;
    }
    public String getUpiId() {
        return upiId;
    }
    public void setUpiId(String upiId) {
        this.upiId = upiId;
    }
}
