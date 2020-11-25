package com.example.ecommerce.dao;

import com.example.ecommerce.model.SKU;

public interface InventoryRepo {

    SKU addSKU(SKU sku);

    void updateQuantity(SKU sku, int quantity);
}
