package com.sample.smallbank.service;

import com.sample.smallbank.entity.CustomerEntity;
import com.sample.smallbank.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    private final CustomerRepository customerRepository;

    @Autowired
    public LoginService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerEntity getUserDetailsAfterLogin(String userEmail) {
        return customerRepository.findCustomerByEmail(userEmail);
    }
}
