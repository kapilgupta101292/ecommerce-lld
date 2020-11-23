package com.example.ecommerce.model;

public class Wallet implements PaymentMethod{

    private String phoneNumber;
    private String email;
    private String walletId;

    @Override
    public boolean deductAmount(String transactionId, double amount) {
        // contact wallet company for charging card with transactionId.
        return true;
    }

    @Override
    public boolean refund(String transactionId, double amount) {
        // contact wallet company for refund to the card for transactionId.
        return true;
    }
}
