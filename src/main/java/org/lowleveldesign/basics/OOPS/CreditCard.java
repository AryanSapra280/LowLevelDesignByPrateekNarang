package org.lowleveldesign.basics.OOPS;

public class CreditCard extends Card  {
    // CreditCard is a subclass of Card
    // It inherits the properties and methods of Card
    public CreditCard(String creditNo, String cardHolderName) {
        super(creditNo, cardHolderName);
    }
    @Override
    public void pay() {
        System.out.println("Payment made using Credit Card: " + getCreditNo());
    }
}
