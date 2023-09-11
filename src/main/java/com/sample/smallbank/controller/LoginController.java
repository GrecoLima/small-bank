package com.sample.smallbank.controller;

import com.sample.smallbank.dto.UserRegistrationDTO;
import com.sample.smallbank.entity.CustomerEntity;
import com.sample.smallbank.service.CustomerService;
import com.sample.smallbank.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    private final CustomerService customerService;
    private final LoginService loginService;

    @Autowired
    public LoginController(CustomerService customerService, LoginService loginService) {
        this.customerService = customerService;
        this.loginService = loginService;
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody UserRegistrationDTO registrationDto) {
        return customerService.registerUser(registrationDto);
    }

    @RequestMapping("/user")
    public CustomerEntity getUserDetailsAfterLogin(Authentication authentication) {
        String userEmail = authentication.getName();
        return loginService.getUserDetailsAfterLogin(userEmail);
    }

}
