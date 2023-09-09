package com.sample.smallbank.repository;

import com.sample.smallbank.entity.LoanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanRepository extends JpaRepository<LoanEntity, Long> {
    List<LoanEntity> findByCustomer_CustomerIdOrderByCreatedDateDesc(Long customerId);

}