package com.sample.smallbank.service;

import com.sample.smallbank.entity.AccountTransactionEntity;
import com.sample.smallbank.repository.AccountTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountTransactionService {

    private final AccountTransactionRepository accountTransactionRepository;

    @Autowired
    public AccountTransactionService(AccountTransactionRepository accountTransactionRepository) {
        this.accountTransactionRepository = accountTransactionRepository;
    }

    public List<AccountTransactionEntity> getBalanceDetails(Long customerId) {
        return accountTransactionRepository.findByCustomer_CustomerIdOrderByTransactionDtDesc(customerId);
    }
}
