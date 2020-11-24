package com.example.ecommerce.dao;

import com.example.ecommerce.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class CustomerRepoImpl implements CustomerRepo {

    private Map<Long, Customer> customers;

    CustomerRepoImpl() {
        customers = new HashMap<>();
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(long id) {
        return customers.get(id);
    }
}
