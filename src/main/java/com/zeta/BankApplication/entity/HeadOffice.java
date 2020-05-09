package com.zeta.BankApplication.entity;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.List;

/**
 * Created by arpit on 09-05-2020.
 */
@Entity
@Table(name="HeadOffice")
public class HeadOffice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long headOfficeId;

    @Column
    private String name;

    @OneToMany(mappedBy = "headOffice")
    private List<Branch> branchList;


    public List<Branch> getBranchList() {
        return branchList;
    }

    public void setBranchList(List<Branch> branchList) {
        this.branchList = branchList;
    }
}
