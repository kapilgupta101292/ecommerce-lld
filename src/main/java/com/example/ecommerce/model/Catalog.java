package com.example.ecommerce.model;

import java.util.List;
import java.util.Map;

public class Catalog implements Search {
    Map<String, List<Product>> productNames;
    Map<String, List<Product>> productCategories;

    public List<Product> searchProductsByName(String name) {
        return productNames.get(name);
    }

    public List<Product> searchProductsByCategory(String category) {
        return productCategories.get(category);
    }
}
