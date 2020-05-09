package com.zeta.BankApplication.entity;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.List;

/**
 * Created by arpit on 09-05-2020.
 */
@Entity
@Table(name="Branch")
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long branchId;

    @Column
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HeadOffice getHeadOffice() {
        return headOffice;
    }

    public void setHeadOffice(HeadOffice headOffice) {
        this.headOffice = headOffice;
    }

    @Column
    @OneToMany(mappedBy = "branch")
    private List<BankAccount> bankAccountList;

    @Column
    @OneToMany(mappedBy ="branch")
    private List<Customer> customerList;

    @ManyToOne
    @JoinColumn(name="headOfficeId")
    private HeadOffice headOffice;

    @Column
    public List<BankAccount> getBankAccountList() {
        return bankAccountList;
    }

    public void setBankAccountList(List<BankAccount> bankAccountList) {
        this.bankAccountList = bankAccountList;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public Long getBranchId() {
        return branchId;
    }

    public void setBranchId(Long branchId) {
        this.branchId = branchId;
    }


}
