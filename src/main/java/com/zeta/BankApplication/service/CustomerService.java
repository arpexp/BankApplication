package com.zeta.BankApplication.service;

import org.springframework.stereotype.Service;

/**
 * Created by arpit on 09-05-2020.
 */
@Service
public interface CustomerService {
    void createCustomer(String pan, Integer branchId);
}
