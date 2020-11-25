package com.example.ecommerce.dao;

import com.example.ecommerce.model.Order;

public interface OrderRepo {
    Order save(Order order);
}
