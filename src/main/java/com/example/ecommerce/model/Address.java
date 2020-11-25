package com.example.ecommerce.model;

import lombok.Data;

@Data
public class Address {
    private Long id;
    private boolean primary;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private String country;
}
