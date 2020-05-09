package com.zeta.BankApplication.Constants;

/**
 * Created by arpit on 09-05-2020.
 */
public enum AccountType {
    SAVING("SAVING_ACCOUNT"),
    CURRENT("CURRENT_ACCOUNT");

    private String account;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    AccountType(String account) {
        this.account = account;
    }
}
