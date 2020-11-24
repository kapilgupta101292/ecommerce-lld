package com.example.ecommerce.service;

import com.example.ecommerce.dao.CustomerRepo;
import com.example.ecommerce.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepo customerRepo;

    @Override
    public void createCustomer(Customer customer) {
        customerRepo.save(customer);
    }

}
