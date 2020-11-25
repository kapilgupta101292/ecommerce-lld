package com.example.ecommerce.service;

import com.example.ecommerce.dao.InventoryRepo;
import com.example.ecommerce.model.SKU;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    InventoryRepo inventoryRepo;

    @Override
    public SKU addSKU(SKU sku) {
        return inventoryRepo.addSKU(sku);
    }
}
