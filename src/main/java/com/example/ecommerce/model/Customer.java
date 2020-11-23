package com.example.ecommerce.model;

import lombok.Data;

import java.util.List;

@Data
public class Customer {
    private Long id;
    private Account account;
    private ShoppingCart cart;
    private List<Order> orders;
}
