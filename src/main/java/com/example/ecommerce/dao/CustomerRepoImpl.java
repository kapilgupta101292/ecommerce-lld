package com.example.ecommerce.dao;

import com.example.ecommerce.model.Customer;
import com.example.ecommerce.model.Item;
import com.example.ecommerce.model.ShoppingCart;
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

    @Override
    public void addProductToCart(long customerId, Item item) {
        customers.get(customerId).getCart().addItem(item);
    }

    @Override
    public void updateProductInCart(long customerId, long productId, int quantity) {
        ShoppingCart shoppingCart = customers.get(customerId).getCart();
        shoppingCart.getItems().get(productId).updateQuantity(quantity);
    }
}
