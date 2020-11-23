package com.example.ecommerce.model;

import lombok.Data;

@Data
public class SKU {
    private long id;
    private Product product;
    private int quantity;
}
