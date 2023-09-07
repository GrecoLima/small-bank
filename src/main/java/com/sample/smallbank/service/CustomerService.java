package com.sample.smallbank.service;

import com.sample.smallbank.dto.RoleDto;
import com.sample.smallbank.dto.UserRegistrationDto;
import com.sample.smallbank.entity.CustomerEntity;
import com.sample.smallbank.entity.RoleEntity;
import com.sample.smallbank.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public CustomerService(CustomerRepository customerRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
        this.customerRepository = customerRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public ResponseEntity<String> registerUser(UserRegistrationDto registrationDto) {

        // Check if a user with the same email already exists
        if (customerRepository.findCustomerByEmail(registrationDto.getEmail()) != null) {
            return ResponseEntity.badRequest().body("Email already exists");
        }

        // Create a list of RoleEntity for the roles from the request
        List<RoleEntity> roleEntities = new ArrayList<>();

        // Iterate through the roles from the request
        for (RoleDto roleDto : registrationDto.getRoles()) {
            // Check if the role already exists in the database
            RoleEntity existingRole = roleRepository.findByRoleName(roleDto.getRoleName().toUpperCase());
            if (existingRole != null) {
                // If the role exists, associate it with the user
                roleEntities.add(existingRole);
            } else {
                // If the role doesn't exist, create it and associate it with the user
                RoleEntity newRoleEntity = new RoleEntity();
                newRoleEntity.setRoleName(roleDto.getRoleName().toUpperCase());
                roleRepository.save(newRoleEntity);
                roleEntities.add(newRoleEntity);
            }
        }

        // Create a new customer entity (user)
        CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setEmail(registrationDto.getEmail());
        customerEntity.setPwd(passwordEncoder.encode(registrationDto.getPassword()));
        customerEntity.setRoles(roleEntities);

        // Save the user in the database
        customerRepository.save(customerEntity);

        return ResponseEntity.status(HttpStatus.CREATED).body("User registered successfully");
    }

}
