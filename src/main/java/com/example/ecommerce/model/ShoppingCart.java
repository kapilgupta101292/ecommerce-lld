package com.example.ecommerce.model;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class ShoppingCart {

    private Map<Long, Item> items;

    public ShoppingCart() {
        items = new HashMap<>();
    }

    public void addItem(Item item) {
        items.put(item.getProductId(), item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void updateQuantity(Item item, int quantity) {
        items.get(item.getProductId()).updateQuantity(quantity);
    }

    public void checkout() {
        // start a new transaction and render the checkout page
    }
}