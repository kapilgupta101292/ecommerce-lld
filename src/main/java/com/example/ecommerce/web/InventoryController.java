package com.example.ecommerce.web;

import com.example.ecommerce.model.SKU;
import com.example.ecommerce.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sku")
public class InventoryController {

    @Autowired
    InventoryService inventoryService;

    @PostMapping(produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SKU> save(@RequestBody SKU sku) {
        sku = inventoryService.addSKU(sku);
        return new ResponseEntity<>(sku, HttpStatus.OK);
    }

}
