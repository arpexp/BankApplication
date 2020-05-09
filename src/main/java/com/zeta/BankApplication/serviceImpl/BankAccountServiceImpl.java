package com.zeta.BankApplication.serviceImpl;

import com.zeta.BankApplication.entity.BankAccount;
import com.zeta.BankApplication.entity.Customer;
import com.zeta.BankApplication.entity.Transaction;
import com.zeta.BankApplication.repository.BankAccountRepository;
import com.zeta.BankApplication.repository.TransactionRepository;
import com.zeta.BankApplication.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * Created by arpit on 09-05-2020.
 */
@Service
public class BankAccountServiceImpl implements BankAccountService {

    @Autowired
    private BankAccountRepository bankAccountRepository;

    @Autowired
    private TransactionRepository transactionRepository;


    @Override
    public void withdraw(Double amount, Long accountNumber) throws IOException {
        try {
             BankAccount bankAccount = bankAccountRepository.findBankAccountsByAccountNumber(accountNumber);
            Double currentBalance = bankAccount.getCurrentBalance();
            if ( currentBalance < amount) {
                throw new IOException("Account Balance Insufficent");
            } else {
                bankAccount.setCurrentBalance(currentBalance - amount);
                bankAccountRepository.save(bankAccount);
                Transaction transaction=new Transaction();
                transaction.setAmount(amount);
                transaction.setType("debit");
                transaction.setBankAccount(bankAccount);
                transactionRepository.save(transaction);

            }
        } catch (Exception e) {
            throw new IOException(e);
        }

    }

    @Override
    public Double deposit(Double amount, Long accountNumber) {
        return null;
    }

    @Override
    public List<Transaction> getTransactionList(Long accountNumber) {
        return null;
    }

    @Override
    public List<Transaction> getminiTransactionList(Long accountNumber) {
        return null;
    }


}
