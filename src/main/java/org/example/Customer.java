package org.example;

public class Customer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public Customer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
    public Customer() {
        this("Nobody", "nobody@email.com");
    }
    public Customer(String name, String emailAddress) {
        this("Default name", 1000.00, "default email");
    }

    public Customer(double creditLimit, String emailAddress) {
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
}
