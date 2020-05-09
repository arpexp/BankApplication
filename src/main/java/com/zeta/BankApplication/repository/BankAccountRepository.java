package com.zeta.BankApplication.repository;

import com.zeta.BankApplication.entity.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by arpit on 09-05-2020.
 */
@Repository
public interface BankAccountRepository extends JpaRepository<BankAccount,Long> {

    BankAccount findBankAccountsByAccountNumber(Long accountNumber);


}
