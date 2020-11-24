package com.example.ecommerce.dao;

import com.example.ecommerce.model.Seller;

public interface SellerRepo {
    void save(Seller seller);
    Seller findById(long id);
}
