package com.zeta.BankApplication.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by arpit on 09-05-2020.
 */
@Entity
@Table(name = "Customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customerid")
    private Long CustomerId;

    @OneToMany(mappedBy = "customer")
    private List<BankAccount> bankAccountList;

    @Column
    private String panNumber;


    public Long getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Long customerId) {
        CustomerId = customerId;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    @ManyToOne
    @JoinColumn(name = "branchId")

    private Branch branch;

    public List<BankAccount> getBankAccountList() {
        return bankAccountList;
    }

    public void setBankAccountList(List<BankAccount> bankAccountList) {
        this.bankAccountList = bankAccountList;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }
}
