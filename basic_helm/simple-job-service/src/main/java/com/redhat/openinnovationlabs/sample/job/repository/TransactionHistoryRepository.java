package com.redhat.openinnovationlabs.sample.job.repository;

import com.redhat.openinnovationlabs.sample.job.model.TransactionHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionHistoryRepository extends JpaRepository<TransactionHistory, Integer> {
}