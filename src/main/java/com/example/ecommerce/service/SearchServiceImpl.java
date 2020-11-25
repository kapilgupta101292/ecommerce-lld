package com.example.ecommerce.service;

import com.example.ecommerce.model.SKU;
import com.example.ecommerce.model.SearchCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    private InventoryService inventoryService;
    @Override
    public List<SKU> search(SearchCriteria criteria) {
        Stream<SKU> stream =  inventoryService.getSKUs().stream();
        switch (criteria.getName()) {
            case "name": return stream.filter(s -> criteria.getValue().equals(s.getProduct().getName()))
                    .collect(Collectors.toList());
            case "category": return stream.filter(s -> criteria.getValue().equals(s.getProduct().getCategory().getName()))
                    .collect(Collectors.toList());
            default: return new ArrayList<>();
        }

    }
}
