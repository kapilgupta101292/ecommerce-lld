package com.example.ecommerce.service;

import com.example.ecommerce.dao.CustomerRepo;
import com.example.ecommerce.model.Customer;
import com.example.ecommerce.model.System;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerRepo customerRepo;

    public void createCustomer(Customer customer) {
        customerRepo.save(customer);
    }

}
