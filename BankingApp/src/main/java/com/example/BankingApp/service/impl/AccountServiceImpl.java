package com.example.BankingApp.service.impl;

import com.example.BankingApp.dto.AccountDto;
import com.example.BankingApp.entity.Account;
import com.example.BankingApp.mapper.AccountMapper;
import com.example.BankingApp.repository.AccountRepository;
import com.example.BankingApp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

//    @Autowired
    private AccountRepository accountRepository;


    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapToAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }
}
