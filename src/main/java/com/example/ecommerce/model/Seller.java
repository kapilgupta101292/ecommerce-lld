package com.example.ecommerce.model;

import lombok.Data;

import java.util.List;

@Data
public class Seller {
    private Long id;
    private Account account;
    private List<SKU> skuList;
}
