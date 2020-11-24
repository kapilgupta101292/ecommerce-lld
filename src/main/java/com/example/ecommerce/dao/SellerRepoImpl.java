package com.example.ecommerce.dao;

import com.example.ecommerce.model.Seller;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class SellerRepoImpl implements SellerRepo {

    Map<Long, Seller> sellers;

    SellerRepoImpl() {
        sellers = new HashMap<>();
    }

    @Override
    public void save(Seller seller) {
        sellers.put(seller.getId(), seller);
    }

    @Override
    public Seller findById(long id) {
        return sellers.get(id);
    }
}
