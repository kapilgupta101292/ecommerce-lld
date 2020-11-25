package com.example.ecommerce.service;

import com.example.ecommerce.model.SKU;

import java.util.List;

public interface InventoryService {
    SKU addSKU(SKU sku);

    List<SKU> getSKUs();
}
