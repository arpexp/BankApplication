package com.zeta.BankApplication.model;

import com.zeta.BankApplication.Constants.AccountType;

/**
 * Created by arpit on 09-05-2020.
 */
public class BankAccountVO {
    private String panNumber;
    private AccountType type;
    private Double amount;
    private Long branchId;

    public Long getBranchId() {
        return branchId;
    }

    public void setBranchId(Long branchId) {
        this.branchId = branchId;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}

