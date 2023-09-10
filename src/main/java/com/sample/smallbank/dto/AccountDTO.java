package com.sample.smallbank.dto;

import lombok.Data;

@Data
public class AccountDTO {

    private Long accountId;
    private Long customerId;
    private String accountType;
    private String branchAddress;
}
