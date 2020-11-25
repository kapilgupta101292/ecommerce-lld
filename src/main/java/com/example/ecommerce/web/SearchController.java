package com.example.ecommerce.web;

import com.example.ecommerce.model.Product;
import com.example.ecommerce.model.SKU;
import com.example.ecommerce.model.Search;
import com.example.ecommerce.model.SearchCriteria;
import com.example.ecommerce.service.CustomerService;
import com.example.ecommerce.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/search")
public class SearchController {

    @Autowired
    SearchService searchService;

    @PostMapping(produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<SKU>> search(@RequestBody SearchCriteria criteria) {
        List<SKU> skus = searchService.search(criteria);
        return new ResponseEntity<>(skus, HttpStatus.OK);
    }
}
