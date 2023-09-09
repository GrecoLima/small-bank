package com.sample.smallbank.repository;

import com.sample.smallbank.entity.AccountTransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountTransactionRepository extends JpaRepository<AccountTransactionEntity, Long> {

    List<AccountTransactionEntity> findByCustomer_CustomerIdOrderByTransactionDtDesc(Long customerId);

}
