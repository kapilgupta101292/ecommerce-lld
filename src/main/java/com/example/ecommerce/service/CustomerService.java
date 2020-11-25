package com.example.ecommerce.service;

import com.example.ecommerce.model.Customer;
import com.example.ecommerce.model.Item;
import com.example.ecommerce.model.ShoppingCart;

public interface CustomerService {
    void createCustomer(Customer customer);

    ShoppingCart addProduct(long customerId, Item item);
}
