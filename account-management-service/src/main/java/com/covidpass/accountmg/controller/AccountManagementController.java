package com.covidpass.accountmg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountManagementController {

    @GetMapping("/status/test")
    public String test(){
        return "Account Working ";
    }
}
