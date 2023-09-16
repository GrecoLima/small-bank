package com.sample.smallbank.service;

import com.sample.smallbank.dto.AccountDTO;
import com.sample.smallbank.entity.AccountEntity;
import com.sample.smallbank.mapper.AccountMapper;
import com.sample.smallbank.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private final AccountRepository accountRepository;
    private final AccountMapper accountMapper;

    @Autowired
    public AccountService(AccountRepository accountRepository, AccountMapper accountMapper) {
        this.accountRepository = accountRepository;
        this.accountMapper = accountMapper;
    }

    public AccountDTO getAccountDetails(Long customerId) {
        AccountEntity account = accountRepository.findByCustomer_CustomerId(customerId);
        return accountMapper.entityToDto(account);
    }
}

