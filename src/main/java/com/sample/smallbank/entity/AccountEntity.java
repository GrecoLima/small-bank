package com.sample.smallbank.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity(name = "accounts")
public class AccountEntity {

    @Id
    @Column(name="account_number")
    private long accountNumber;

    @Column(length = 50, nullable = false)
    private String accountType;

    @Column(length = 100)
    private String branchAddress;

    @Temporal(TemporalType.DATE)
    @Column(name = "create_date")
    private Date createDate;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    private CustomerEntity customer;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    private List<AccountTransactionEntity> transactions = new ArrayList<>();
}