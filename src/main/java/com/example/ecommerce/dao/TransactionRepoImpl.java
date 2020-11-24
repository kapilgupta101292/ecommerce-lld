package com.example.ecommerce.dao;

import com.example.ecommerce.model.Order;
import com.example.ecommerce.model.Transaction;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class TransactionRepoImpl implements TransactionRepo {

    Map<String, Transaction> transactions;

    @Override
    public void save(Order order) {
        Transaction txn = new Transaction(order);
        transactions.put(txn.getId(), txn);
    }
}
