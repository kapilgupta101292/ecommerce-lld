package com.example.ecommerce.model;

import lombok.Data;

import java.util.UUID;

@Data
public class Transaction {
    private String id;
    private double amount;
    private PaymentMethod paymentMethod;

    public Transaction(Order order) {
        this.id = UUID.randomUUID().toString();
        this.amount = order.getAmount();
        this.paymentMethod = order.getCustomer().getAccount().getPaymentMethod();
    }
}
