package com.example.ecommerce.web;

import com.example.ecommerce.model.CartItem;
import com.example.ecommerce.model.ShoppingCart;
import com.example.ecommerce.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    CustomerService customerService;

    @PostMapping(produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ShoppingCart> add(@RequestBody CartItem cartItem) {
        ShoppingCart cart = customerService.addProduct(cartItem.getCustomerId(), cartItem.getItem());
        return new ResponseEntity<>(cart, HttpStatus.OK);
    }

}
