package com.zeta.BankApplication.service;

import com.zeta.BankApplication.entity.Branch;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by arpit on 09-05-2020.
 */
@Service
public interface HeadOfficeService {

    public void createBranch(Integer headofficeId,String branchName);

    public Branch getBranchbyId(String BranchId);

    public List<Branch> getAllBranches();

}
