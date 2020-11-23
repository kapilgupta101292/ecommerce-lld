package com.example.ecommerce.model;

public class CreditCard implements PaymentMethod{

    private String name;
    private String number;
    private int cvv;
    private int expiryMonth;
    private int expiryYear;

    @Override
    public boolean deductAmount(String transactionId, double amount) {
        // contact payment gateway for charging card with transactionId.
        return true;
    }

    @Override
    public boolean refund(String transactionId, double amount) {
        // contact payment gateway for refund to the card for transactionId.
        return true;
    }
}
