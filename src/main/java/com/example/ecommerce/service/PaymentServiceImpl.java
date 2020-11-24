package com.example.ecommerce.service;

import com.example.ecommerce.dao.TransactionRepo;
import com.example.ecommerce.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    TransactionRepo transactionRepo;

    @Override
    public void initiatePayment(Order order) {
        transactionRepo.save(order);
    }
}
