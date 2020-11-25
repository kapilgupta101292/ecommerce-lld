package com.example.ecommerce.model;

import lombok.Data;

@Data
public class CartItem {
    private Long customerId;
    private Item item;
}