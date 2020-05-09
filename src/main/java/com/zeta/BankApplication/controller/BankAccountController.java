package com.zeta.BankApplication.controller;

import com.zeta.BankApplication.entity.Customer;
import com.zeta.BankApplication.model.BankAccountTransactionVO;
import com.zeta.BankApplication.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

/**
 * Created by arpit on 09-05-2020.
 */
@Controller
@RequestMapping("/bankaccount")
public class BankAccountController {

    @Autowired
    private BankAccountService bankAccountService;


    @PostMapping ("/withdraw")
    public ResponseEntity<String> withdraw(@RequestBody BankAccountTransactionVO bankAccountTransactionVO)
            throws IOException
    {
        bankAccountService.withdraw(bankAccountTransactionVO.getAmount() , bankAccountTransactionVO.getAccountNumber());
        return new ResponseEntity<>("Withdraw success", HttpStatus.OK);
    }
}
