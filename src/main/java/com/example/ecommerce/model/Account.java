package com.example.ecommerce.model;

import lombok.Data;

import java.util.List;

@Data
public class Account {

    private Long id;
    private String userName;
    private String password;
    private String name;
    private String email;
    private String phone;

    private List<PaymentMethod> savedPaymentDetails;
    private List<Address> savedAddresses;

}
