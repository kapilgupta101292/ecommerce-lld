package com.example.ecommerce.model;

public class CreditCardTransaction extends Transaction {
    @Override
    public PaymentStatus processPayments(double amount) {
        try {
            paymentMethod.deductAmount(id, amount);
        } catch (Exception ex) {
            return PaymentStatus.DECLINED;
        }
        return PaymentStatus.COMPLETED;
    }

}
