package com.example.ecommerce.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Order {

    private long id;
    private Customer customer;
    private Date orderDate;
    private double amount;
    private List<Item> items;
    private Address shippingAddress;
    private Address billingAddress;
    private Transaction transaction;

}
