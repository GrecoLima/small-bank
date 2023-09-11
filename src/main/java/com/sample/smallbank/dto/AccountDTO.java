package com.sample.smallbank.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountDTO {

    private Long accountId;
    private CustomerDTO user;
    private String accountNumber;
    private String accountType;
    private String branchAddress;
}
