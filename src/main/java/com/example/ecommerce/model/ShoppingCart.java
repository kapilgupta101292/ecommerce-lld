package com.example.ecommerce.model;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<Long, Item> items;

    public ShoppingCart() {
        items = new HashMap<>();
    }

    public void addItem(Item item) {
        items.put(item.getProductID(), item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void updateQuantity(Item item, int quantity) {
        items.get(item.getProductID()).updateQuantity(quantity);
    }

    public void checkout() {
        // start a new transaction and render the checkout page
    }
}