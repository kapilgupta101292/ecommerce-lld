package com.example.ecommerce.model;

import lombok.Data;

@Data
public class Product {

    private long id;
    private String name;
    private String description;
    private ProductCategory category;
    private double maximumRetailPrice;
    private double sellingPrice;


}
