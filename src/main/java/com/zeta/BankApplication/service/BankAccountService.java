package com.zeta.BankApplication.service;

import com.zeta.BankApplication.entity.Customer;
import com.zeta.BankApplication.entity.Transaction;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * Created by arpit on 09-05-2020.
 */

public interface BankAccountService {

    public void withdraw(Double amount, Long accountNumber) throws IOException;

    public Double deposit(Double amount,Long accountNumber);

    public List<Transaction> getTransactionList(Long accountNumber);

    public List<Transaction> getminiTransactionList(Long accountNumber);


}
