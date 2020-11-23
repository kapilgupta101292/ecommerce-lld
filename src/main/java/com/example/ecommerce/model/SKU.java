package com.example.ecommerce.model;

import lombok.Data;

@Data
public class SKU {
    private long id;
    private Product product;
    private int quantity;

    public SKU (Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
}
