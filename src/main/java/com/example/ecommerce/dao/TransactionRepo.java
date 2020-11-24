package com.example.ecommerce.dao;

import com.example.ecommerce.model.Order;

public interface TransactionRepo {
    void save(Order order);
}
