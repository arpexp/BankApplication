package com.zeta.BankApplication.controller;

import com.zeta.BankApplication.entity.Customer;
import com.zeta.BankApplication.model.BankAccountVO;
import com.zeta.BankApplication.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;

/**
 * Created by arpit on 09-05-2020.
 */
@Controller
@RequestMapping("/branch")
public class BranchController {

    @Autowired
    private BranchService branchService;

    @PostMapping("/createaccount")
    public ResponseEntity<String> createAccount(@RequestBody BankAccountVO bankAccountVO) {
        branchService.createBankAccount(bankAccountVO);
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);

    }

    @GetMapping("/getCustomerbyPan")
    public ResponseEntity<Customer> getCustomerByPanNumber(@RequestParam(value = "pan") String panNumber) {
        Customer customer = branchService.getCustomerByPan(panNumber);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }
 /*   @GetMapping("/getCustomerbyAccountNumber")
    public ResponseEntity<Customer> getCustomerByAccountNumber(@RequestParam(value = "accountNumber") Long accountNumber) {
        Customer customer = branchService.getCustomerByAccountNumber(accountNumber);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }
*/

}
