package com.payportal.reward_service.repository;

import com.payportal.reward_service.entity.Reward;
import com.payportal.reward_service.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RewardRepository extends JpaRepository<Reward, Long> {
    List<Reward> findByUserId(Long userId);
    Boolean existsByTransactionId(Long transactionId);
}
