package com.zeta.BankApplication.repository;

import com.zeta.BankApplication.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by arpit on 09-05-2020.
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByPanNumber(String panNumber);

  //  Customer findByAccountNumber (Long accountNumber);
}
