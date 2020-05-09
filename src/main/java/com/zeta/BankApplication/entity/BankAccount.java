package com.zeta.BankApplication.entity;

import com.zeta.BankApplication.Constants.AccountType;
import org.springframework.boot.autoconfigure.web.ResourceProperties;

import javax.persistence.*;
import java.util.List;

/**
 * Created by arpit on 09-05-2020.
 */

@Entity
@Table(name="BankAccount")
public class BankAccount {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long accountNumber;

    @Column
    private Double minimumBalance;

    @Column
    private Double currentBalance;

    @Column
    private double interestRate;

    @Column
    private String accountType;

    @Column
    @OneToMany(mappedBy = "bankAccount")
    private List<Transaction> transactionList;

    @ManyToOne
    @JoinColumn(name="customerid", nullable=false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name="branchId", nullable=false)
    private Branch branch;

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(Double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public Double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(Double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }
}
