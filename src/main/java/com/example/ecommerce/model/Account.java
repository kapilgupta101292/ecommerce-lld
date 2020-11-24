package com.example.ecommerce.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Account {

    private Long id;
    private String userName;
    private String password;
    private String name;
    private String email;
    private String phone;
    private PaymentMethod paymentMethod;
    private Address address;

    //private List<PaymentMethod> savedPaymentDetails;
    //private List<Address> savedAddresses;

}
