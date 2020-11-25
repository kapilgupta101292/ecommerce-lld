package com.example.ecommerce.model;

import java.util.List;

public interface Search {
    List<Product> search(SearchCriteria criteria);
}
