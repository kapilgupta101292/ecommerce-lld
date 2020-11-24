package com.example.ecommerce.service;

import com.example.ecommerce.model.Order;

public interface PaymentService {
    void initiatePayment(Order order);
}
