package com.juns.world.spark.controller;

import com.juns.world.spark.repository.AccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountsController {

    @Autowired
    AccountsRepository accountsRepository;

    @PostMapping
    public void postAccounts() {

    }
}
