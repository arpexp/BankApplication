package com.zeta.BankApplication.serviceImpl;

import com.zeta.BankApplication.entity.Branch;
import com.zeta.BankApplication.entity.Customer;
import com.zeta.BankApplication.entity.HeadOffice;
import com.zeta.BankApplication.repository.BranchRepository;
import com.zeta.BankApplication.repository.CustomerRepository;
import com.zeta.BankApplication.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by arpit on 09-05-2020.
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BranchRepository branchRepository;

    @Override
    public void createCustomer(String pan,Integer branchId){

        Optional<Branch> optional = branchRepository.findById(new Long(branchId));
        if(optional.isPresent()){

            Customer customer = new Customer();
            customer.setPanNumber(pan);
            customer.setBranch(optional.get());
            customerRepository.save(customer);
        }

    }
}
