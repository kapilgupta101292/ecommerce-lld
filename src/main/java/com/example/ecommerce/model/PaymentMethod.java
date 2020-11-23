package com.example.ecommerce.model;

public interface PaymentMethod {
    boolean deductAmount(String transactionId, double amount);
    boolean refund(String transactionId, double amount);
}
