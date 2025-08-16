package org.lowleveldesign.basics.OOPS;

public class DebitCard extends Card {
    // DebitCard is a subclass of Card
    // It inherits the properties and methods of Card
    public DebitCard(String creditNo, String cardHolderName) {
        super(creditNo, cardHolderName);
    }
    @Override
    public void pay() {
        System.out.println("Payment made using Debit Card: " + getCreditNo());
    }
}
