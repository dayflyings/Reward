package com.example.rewardpoint.dao;

import com.example.rewardpoint.model.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionDAO extends JpaRepository<TransactionEntity, Long> {
    List<TransactionEntity> findTransactionEntitiesByUserId(Long userId);
}
