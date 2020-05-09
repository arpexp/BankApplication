package com.zeta.BankApplication.serviceImpl;

import com.zeta.BankApplication.Constants.BankAccountConstants;
import com.zeta.BankApplication.entity.BankAccount;
import com.zeta.BankApplication.entity.Branch;
import com.zeta.BankApplication.entity.Customer;
import com.zeta.BankApplication.model.BankAccountVO;
import com.zeta.BankApplication.repository.BankAccountRepository;
import com.zeta.BankApplication.repository.BranchRepository;
import com.zeta.BankApplication.repository.CustomerRepository;
import com.zeta.BankApplication.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Objects;
import java.util.Optional;

/**
 * Created by arpit on 09-05-2020.
 */

@Service
public class BranchServiceImpl implements BranchService {


    @Autowired
    private BranchRepository branchRepository;

    @Autowired
    private BankAccountRepository bankAccountRepository;

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public void createBankAccount(BankAccountVO bankAccountVO) {

        Customer customer = customerRepository.findByPanNumber(bankAccountVO.getPanNumber());

        if(Objects.nonNull(customer)){
            if (BankAccountConstants.CURRENT_ACCOUNT.equalsIgnoreCase(bankAccountVO.getType().getAccount())) {

                BankAccount bankAccount = new BankAccount();
                bankAccount.setCurrentBalance(bankAccountVO.getAmount());
                bankAccount.setInterestRate(BankAccountConstants.INTEREST_RATE_CURRENT_ACCOUNT);
                bankAccount.setMinimumBalance(BankAccountConstants.MINIMUM_BALANCE_CURRENT_ACCOUNT);
                bankAccount.setCustomer(customer);
                bankAccount.setBranch(customer.getBranch());
                bankAccount.setAccountType(bankAccountVO.getType().getAccount());

                bankAccountRepository.save(bankAccount);
            }
        }



    }

    @Override
    public Customer getCustomerByPan(String panNumber) {

       // return null;
       Customer customer = customerRepository.findByPanNumber(panNumber);
        return customer;
    }



/*    @Override
    public Customer getCustomerByAccountNumber(Long accountNumber) {
        //return null;
        Customer customer = customerRepository.findByPanNumber(panNumber);
        return customer;
    }*/


}
