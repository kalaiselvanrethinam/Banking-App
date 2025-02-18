package com.example.BankingApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

//@Data
//@AllArgsConstructor
//@Getter
public class AccountDto {
    public AccountDto() {
    }

    public Long getId() {
        return id;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public AccountDto(Long id, String accountHolderName, double balance) {
        this.id = id;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private Long id;
    private String accountHolderName;
    private double balance;

}
