package com.example.ecommerce.web;

import com.example.ecommerce.model.Product;
import com.example.ecommerce.model.Search;
import com.example.ecommerce.service.CustomerService;
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
    CustomerService customerService;

    @PostMapping(produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Product>> search(@RequestBody Search cartItem) {
        List<Product> products = new ArrayList<>(); // call to search service
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}
