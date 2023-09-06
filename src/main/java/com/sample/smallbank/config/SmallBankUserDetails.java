package com.sample.smallbank.config;

import com.sample.smallbank.entity.CustomerEntity;
import com.sample.smallbank.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;
import java.util.stream.Collectors;

public class SmallBankUserDetails implements UserDetailsService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        CustomerEntity customerEntity = customerRepository.findCustomerByEmail(username);

        if (customerEntity == null) {
            throw new UsernameNotFoundException("User not found: " + username);
        }

        // Convert the user's roles into a list of authorities (SimpleGrantedAuthority)
        List<SimpleGrantedAuthority> authorities = customerEntity.getRoles()
                .stream()
                .map(role -> new SimpleGrantedAuthority("ROLE_" + role))
                .collect(Collectors.toList());

        // Build and return a UserDetails object based on the user details and authorities
        return User.builder()
                .username(customerEntity.getEmail())
                .password(customerEntity.getPwd())
                .authorities(authorities)
                .build();
    }
}
