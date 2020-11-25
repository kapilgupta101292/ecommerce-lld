package com.example.ecommerce.dao;

import com.example.ecommerce.model.SKU;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class InventoryRepoImpl implements InventoryRepo {

    private Map<Long, SKU> inventory;

    public InventoryRepoImpl() {
        inventory = new HashMap<>();
    }

    @Override
    public SKU addSKU(SKU sku) {
        inventory.put(sku.getProduct().getId(), sku);
        return sku;
    }

    @Override
    public void updateQuantity(SKU sku, int quantity) {
        SKU current = inventory.get(sku.getProduct().getId());
        current.setQuantity(current.getQuantity() + quantity);
    }
}
