package com.zeta.BankApplication.controller;

import com.zeta.BankApplication.service.HeadOfficeService;
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
@RequestMapping("/bank")
public class HeadOfficeController {

    @Autowired
    private HeadOfficeService headOfficeService;

    @PostMapping("/office")
    public ResponseEntity<String> createBranch(@RequestParam("headofficeId") Integer headofficeId,@RequestParam("branchname") String branchName){
        headOfficeService.createBranch(headofficeId,branchName);
        return new ResponseEntity<String>(HttpStatus.CREATED);
    }


    }

