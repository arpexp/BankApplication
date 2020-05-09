package com.zeta.BankApplication.repository;

import com.zeta.BankApplication.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by arpit on 09-05-2020.
 */
@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    @Query(value = "Select * from transaction limit 10 WHERE accountNumber = :accountNumber order by id desc", nativeQuery = true)
    List<Transaction> findMiniStatement(Long acountNumber);

    //List<Transaction> findAllByAccountNumberOrderByTransactionIdAsc(String accountNumber) ;


}
