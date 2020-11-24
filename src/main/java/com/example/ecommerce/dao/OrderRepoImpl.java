package com.example.ecommerce.dao;

import com.example.ecommerce.model.Order;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class OrderRepoImpl implements OrderRepo {

    Map<Long, Order> orders;

    OrderRepoImpl() {
        this.orders = new HashMap<Long, Order>();
    }

    @Override
    public void save(Order order) {
        orders.put(order.getId(), order);
    }
}
