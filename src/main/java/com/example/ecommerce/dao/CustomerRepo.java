package com.example.ecommerce.dao;

import com.example.ecommerce.model.Customer;
import com.example.ecommerce.model.Item;

public interface CustomerRepo {
    void save(Customer customer);
    Customer findById(long id);
    void addProductToCart(long customerId, Item item);
    void updateProductInCart(long customerId, long productId, int quantity);
}
