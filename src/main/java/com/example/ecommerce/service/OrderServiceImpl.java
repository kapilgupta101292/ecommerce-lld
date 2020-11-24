package com.example.ecommerce.service;

import com.example.ecommerce.dao.OrderRepo;
import com.example.ecommerce.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepo orderRepo;

    @Autowired
    PaymentService paymentService;

    @Override
    public void createOrder(Order order) {

        orderRepo.save(order);
        paymentService.initiatePayment(order);
    }
}
