package com.example.ecommerce.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class System {
    List<Customer> customers;
    List<Seller> sellers;
    Catalog catalog;

    System() {
        this.customers = new ArrayList<>();
        this.sellers = new ArrayList<>();
        this.catalog = new Catalog();
    }
}
