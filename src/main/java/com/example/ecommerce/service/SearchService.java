package com.example.ecommerce.service;

import com.example.ecommerce.model.SKU;
import com.example.ecommerce.model.SearchCriteria;

import java.util.List;

public interface SearchService {
    List<SKU> search(SearchCriteria criteria);
}
