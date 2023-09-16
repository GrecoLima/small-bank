package com.sample.smallbank.config;


import com.sample.smallbank.entity.AuthorityEntity;
import com.sample.smallbank.entity.CustomerEntity;
import com.sample.smallbank.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

    private final CustomerRepository customerRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public CustomAuthenticationProvider(CustomerRepository customerRepository, PasswordEncoder passwordEncoder) {
        this.customerRepository = customerRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        String password = authentication.getCredentials().toString();

        CustomerEntity customer = customerRepository.findCustomerByEmail(username);

        if (customer == null) {
            throw new UsernameNotFoundException("User not found: " + username);
        } else if (passwordEncoder.matches(password, customer.getPassword())) {
            List<GrantedAuthority> authorityList = new ArrayList<>();
            Set<AuthorityEntity> authorities = customer.getAuthorities();
            for (AuthorityEntity authority : authorities) {
                String authorityName = authority.getName();
                GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(authorityName);
                authorityList.add(grantedAuthority);
            }
            return new UsernamePasswordAuthenticationToken(username, password, authorityList);
        } else {
            throw new BadCredentialsException("Invalid password!");
        }
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
    }
}
