package com.example.ecommerce.dao;

import com.example.ecommerce.model.Customer;

public interface CustomerRepo {
    void save(Customer customer);

    Customer findById(long id);
}
