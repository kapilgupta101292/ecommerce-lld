package com.example.ecommerce.service;

import com.example.ecommerce.dao.SellerRepo;
import com.example.ecommerce.model.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    SellerRepo sellerRepo;

    @Override
    public void createSeller(Seller seller) {
        sellerRepo.save(seller);
    }

}
