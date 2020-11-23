package com.example.ecommerce.model;

import lombok.Data;

@Data
public class Item {
    private long productID;
    private int quantity;
    private double price;

    public void updateQuantity(int quantity) {
        this.quantity = quantity;
    }
}