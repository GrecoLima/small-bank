package com.sample.smallbank.service;

import com.sample.smallbank.entity.AccountEntity;
import com.sample.smallbank.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public List<AccountEntity> getAccountDetails(Long customerId) {
        return accountRepository.findByCustomer_CustomerId(customerId);
    }
}

