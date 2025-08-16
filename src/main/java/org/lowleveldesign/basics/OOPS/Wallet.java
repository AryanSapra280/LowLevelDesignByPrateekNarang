package org.lowleveldesign.basics.OOPS;

public class Wallet implements PaymentMethod {
    private String walletId;

    public Wallet(String walletId) {
        this.walletId = walletId;
    }

    @Override
    public void pay() {
        System.out.println("Payment made using Wallet: " + walletId);
    }

    public String getWalletId() {
        return walletId;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

}
