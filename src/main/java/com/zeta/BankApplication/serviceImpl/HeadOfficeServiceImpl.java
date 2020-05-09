package com.zeta.BankApplication.serviceImpl;

import com.zeta.BankApplication.entity.Branch;
import com.zeta.BankApplication.entity.HeadOffice;
import com.zeta.BankApplication.repository.BranchRepository;
import com.zeta.BankApplication.repository.HeadOfficeRepository;
import com.zeta.BankApplication.service.HeadOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by arpit on 09-05-2020.
 */

@Service
public class HeadOfficeServiceImpl implements HeadOfficeService {

    @Autowired
    HeadOfficeRepository headOfficeRepository;

    @Autowired
    BranchRepository branchRepository;
    @Override
    public void createBranch(Integer headofficeId,String branchName) {
        Optional<HeadOffice> optional = headOfficeRepository.findById(new Long(headofficeId));
        if(optional.isPresent()){
            HeadOffice headOffice = optional.get();
            Branch branch = new Branch();
            branch.setName(branchName);
            branch.setHeadOffice(headOffice);
            branchRepository.save(branch);

        }


    }

    @Override
    public Branch getBranchbyId(String BranchId) {
        return null;
    }

    @Override
    public List<Branch> getAllBranches() {
        return null;
    }
}

