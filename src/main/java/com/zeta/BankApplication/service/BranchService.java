package com.zeta.BankApplication.service;

import com.zeta.BankApplication.entity.BankAccount;
import com.zeta.BankApplication.entity.Customer;
import com.zeta.BankApplication.model.BankAccountVO;
import org.springframework.stereotype.Service;

/**
 * Created by arpit on 09-05-2020.
 */

public interface BranchService {

    public void createBankAccount(BankAccountVO bankAccountVO);

    public Customer getCustomerByPan(String panNumber);

    //public Customer getCustomerByAccountNumber(Long accountNumber);



}
