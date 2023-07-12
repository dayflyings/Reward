package com.example.rewardpoint.service;

import com.example.rewardpoint.model.TransactionEntity;

import java.util.List;

public interface TransactionService {
    public TransactionEntity saveTransaction(TransactionEntity transactionEntity);

    public List<TransactionEntity> findTransactionByUserId(Long userId);

}
