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
}