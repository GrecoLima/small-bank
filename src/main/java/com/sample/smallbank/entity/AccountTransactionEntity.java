package com.sample.smallbank.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity(name = "account_transactions")
public class AccountTransactionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_transaction_id", nullable = false)
    private Long accountTransactionId;

    @JoinColumn(name = "account_id", nullable = false)
    @OneToOne
    private AccountEntity account;

    @JoinColumn(name = "customer_id", nullable = false)
    @OneToOne
    private CustomerEntity customer;

    @Column(name = "transaction_dt")
    private LocalDateTime transactionDt;

    @Column(name = "transaction_summary")
    private String transactionSummary;

    @Column(name = "transaction_type")
    private String transactionType;

    @Column(name = "transaction_amt")
    private int transactionAmt;

    @Column(name = "closing_balance")
    private int closingBalance;

    @Column(name = "create_dt")
    private LocalDateTime createDt;

}
