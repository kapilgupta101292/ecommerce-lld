package com.example.ecommerce.model;

import lombok.Data;

import java.util.Date;

@Data
public class Order {

    private long id;
    private Date orderDate;
    private double amount;
    private Address shippingAddress;
    private Address billingAddress;
    private Transaction transaction;

    public boolean shipOrder() {
        //ship order
        return true;
    }

    public boolean makePayment(Transaction transaction) {
        transaction.processPayments(amount);
        return true;
    }

}
