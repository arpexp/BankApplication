package com.zeta.BankApplication.model;

import com.zeta.BankApplication.entity.Customer;

/**
 * Created by arpit on 09-05-2020.
 */
public class BankAccountTransactionVO {

    private Double amount;
    private Long accountNumber;

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }
}
