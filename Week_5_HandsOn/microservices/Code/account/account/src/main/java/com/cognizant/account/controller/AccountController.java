package com.cognizant.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/accounts/{number}")
    public Account getAccountDetails(@PathVariable String number) {
        // Dummy response for testing purposes
        return new Account(number, "savings", 234343);
    }
}

// Account class to define the structure of the response
class Account {
    private String number;
    private String type;
    private int balance;

    // Constructor, getters, and setters

    public Account(String number, String type, int balance) {
        this.number = number;
        this.type = type;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public int getBalance() {
        return balance;
    }
}
