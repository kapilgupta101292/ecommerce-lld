package com.example.ecommerce.dao;

import com.example.ecommerce.model.SKU;

import java.util.List;

public interface InventoryRepo {

    SKU addSKU(SKU sku);

    List<SKU> getSKUs();

    void updateQuantity(SKU sku, int quantity);
}
