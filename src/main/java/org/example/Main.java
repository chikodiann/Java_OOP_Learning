package org.example;

public class Main {
    public static void main(String[] args) {

        BankAccount bobsAccount = new BankAccount("0011223344",
                1000.00, "Bob Brown", "bob@email.com",
                "(081) 1234 56");
        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getAccountBalance());

        /* this is no longer needed, all of this code is repalced by the use of a constructor...
        bobsAccount.setAccountNumber("0011223344");
        bobsAccount.setAccountBalance(1000.00);
        bobsAccount.setCustomerName("Bob Brown");
        bobsAccount.setEmail( "bob@email.com");
        bobsAccount.setPhoneNumber("(081) 1234 56");
         */

        bobsAccount.depositFunds(1000);
        bobsAccount.withdrawFunds(100.0);
        bobsAccount.withdrawFunds(900);

        bobsAccount.depositFunds(100);
        bobsAccount.withdrawFunds(45.55);
        bobsAccount.withdrawFunds(54.46);

        System.out.println("*********************************************");
        System.out.println();

        SimpleCalculator calculate = new SimpleCalculator();

        calculate.setFirstNumber(20);
        calculate.setSecondNumber(10);



        System.out.println("Addition result = " + calculate.getAdditionResult());
        System.out.println("Subtraction result = " + calculate.getSubtractionResult());
        System.out.println("Division result = " + calculate.getDivisionResult());
        System.out.println("Multiplication result = " + calculate.geMultiplicationResult());

        System.out.println("**********************************************");
        System.out.println();

        Person person = new Person();

        person.setFirstName("Ann");
        person.setLastName("Luke");

        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getFullName());

    }
}