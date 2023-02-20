package org.example;

public class BankAccount {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        // constructor chaining ie calling a constructor from within another constructor
        this("11223344", 2.50,"Default name", "Default address", "Default phone number");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String accountNumber, double accountBalance, String customerName, String email, String phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double depositAmount){
       accountBalance += depositAmount;
        System.out.println("Deposit of N" +depositAmount + " made." + "\n New balance is N" + accountBalance);
    }

    public void withdrawFunds(double withdrawalAmount){
        if (accountBalance - withdrawalAmount < 0) {
            System.out.println("Insufficient funds! You only have N" + accountBalance + " in your account.");
        } else {
            accountBalance -= withdrawalAmount;
            System.out.println("Withdrawal of N" + withdrawalAmount + " processed." + "\n Remaining balance = N" + accountBalance);
        }
    }
}
