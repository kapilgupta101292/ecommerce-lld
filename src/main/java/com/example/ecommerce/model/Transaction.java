package com.example.ecommerce.model;

import lombok.Data;

@Data
public abstract class Transaction {
    protected String id;
    protected PaymentMethod paymentMethod;
    public abstract PaymentStatus processPayments(double amount);
}
