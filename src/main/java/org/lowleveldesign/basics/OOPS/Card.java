package org.lowleveldesign.basics.OOPS;

public abstract class Card implements PaymentMethod{
    private String creditNo;
    private String cardHolderName;

    public Card(String creditNo, String cardHolderName) {
        this.creditNo = creditNo;
        this.cardHolderName = cardHolderName;
    }

    public String getCreditNo() {
        return creditNo;
    }

    public void setCreditNo(String creditNo) {
        this.creditNo = creditNo;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }
    @Override
    public abstract void pay();

    @Override
    public String toString() {
        return "CreditCard{" +
                "creditNo='" + creditNo + '\'' +
                ", cardHolderName='" + cardHolderName + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;
        Card that = (Card) o;
        return creditNo.equals(that.creditNo) && cardHolderName.equals(that.cardHolderName);
    }
}
