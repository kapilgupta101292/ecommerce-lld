package com.example.ecommerce.model;

public class WalletTransaction extends Transaction {
    @Override
    public PaymentStatus processPayments(double amount) {
        try {
            paymentMethod.deductAmount(this.getId(), amount);
        } catch (Exception ex) {
            return PaymentStatus.DECLINED;
        }
        return PaymentStatus.COMPLETED;
    }

}
