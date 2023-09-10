package com.sample.smallbank.service;

import com.sample.smallbank.entity.LoanEntity;
import com.sample.smallbank.repository.LoanRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanService {
    private final LoanRepository loanRepository;

    public LoanService(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    public List<LoanEntity> getLoanDetailsByCustomerId(Long customerId) {
        return loanRepository.findByCustomer_CustomerIdOrderByCreatedDateDesc(customerId);
    }
}

