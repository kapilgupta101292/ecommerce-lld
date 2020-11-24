package com.example.ecommerce.model;

import java.util.ArrayList;
import java.util.List;

public class System {
    public static List<Customer> customers;
    public static List<Seller> sellers;
    public static Catalog catalog;

     {
        this.customers = new ArrayList<>();
        this.sellers = new ArrayList<>();
        this.catalog = new Catalog();
    }
}
