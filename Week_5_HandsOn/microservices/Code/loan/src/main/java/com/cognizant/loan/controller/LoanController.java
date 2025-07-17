package com.cognizant.loan.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

    @GetMapping("/loans/{number}")
    public Loan getLoanDetails(@PathVariable String number) {
        // Dummy response for testing purposes
        return new Loan(number, "car", 400000, 3258, 18);
    }
}

// Loan class to define the structure of the response
class Loan {
    private String number;
    private String type;
    private int loan;
    private int emi;
    private int tenure;

    // Constructor, getters, and setters

    public Loan(String number, String type, int loan, int emi, int tenure) {
        this.number = number;
        this.type = type;
        this.loan = loan;
        this.emi = emi;
        this.tenure = tenure;
    }

    public String getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public int getLoan() {
        return loan;
    }

    public int getEmi() {
        return emi;
    }

    public int getTenure() {
        return tenure;
    }
}
