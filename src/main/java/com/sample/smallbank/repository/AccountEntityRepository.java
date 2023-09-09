package com.sample.smallbank.repository;

import com.sample.smallbank.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountEntityRepository extends JpaRepository<AccountEntity, Long> {

    AccountEntity findByCustomer_CustomerId(Long customerId);

}