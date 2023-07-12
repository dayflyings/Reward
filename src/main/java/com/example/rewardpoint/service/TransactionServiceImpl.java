package com.example.rewardpoint.service;

import com.example.rewardpoint.dao.TransactionDAO;
import com.example.rewardpoint.model.TransactionEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService{

    @Autowired
    TransactionDAO transRepo;

    /**
     * Save transaction information into database
     * @param transactionEntity transaction information to save
     * @return transaction entity
     */
    @Override
    public TransactionEntity saveTransaction(TransactionEntity transactionEntity) {
        return transRepo.save(transactionEntity);
    }

    @Override
    public List<TransactionEntity> findTransactionByUserId(Long userId) {
        return transRepo.findTransactionEntitiesByUserId(userId);
    }
}
