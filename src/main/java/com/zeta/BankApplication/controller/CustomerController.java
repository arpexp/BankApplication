package com.zeta.BankApplication.controller;

import com.zeta.BankApplication.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by arpit on 09-05-2020.
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/createcustomer")
    public ResponseEntity<String> createCustomer(@RequestParam("pan") String pan,@RequestParam("branchid") Integer branchId){
        customerService.createCustomer(pan,branchId);
        return new ResponseEntity<String>(HttpStatus.CREATED);
    }
}
