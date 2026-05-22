package com.lpu;

public class Loan {
    private double loanAmount;
    private double interestRate;

    public Loan(double loanAmount, double interestRate)
            throws InvalidLoanException {

        if (loanAmount <= 0) {
            throw new InvalidLoanException("Invalid loan amount!");
        }

        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return loanAmount * interestRate / 100;
    }

    public void displayLoan() {
        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Interest: " + calculateInterest());
    }
}
